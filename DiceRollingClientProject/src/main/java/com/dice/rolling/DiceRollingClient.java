package com.dice.rolling;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author USER
 */
public class DiceRollingClient {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MqttException {
        
         
         ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
         
            //declarting MQTT Client properties
            final int qos             = 1;
            String broker       = "tcp://localhost:1883";
            String clientId     = "DiceRollingSub";
            MemoryPersistence persistence = new MemoryPersistence();
         
	    //instantiating MqttClient with properties
            final MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            
	    //setting connection options
	    MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");
			
	//Die outcome will be sent to Topic every second
         exec.scheduleAtFixedRate(new Runnable() {
           public void run() {
			   
                   //generate 2 random integers
                   int die1= generateRandomInteger();
                   int die2= generateRandomInteger();
                   
                   //compose JSON objects
                   JSONObject obj = new JSONObject();
                    obj.put("Die1", die1);
                    obj.put("Die2", die2);
                  
               try {
                   //call sendToTopic method with JSONObject, topic, MQTTClient and QOS
                   sendToTopic(obj.toString().trim(),"Die",sampleClient,qos);
               } catch (MqttException ex) {
                   Logger.getLogger(DiceRollingClient.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
         }, 0, 1, TimeUnit.SECONDS);
    }

    /**
     * Method to publish message to the topic
     * @param content
     * @param topic
     * @param sampleClient
     * @param qos
     * @throws MqttException 
     */
    private static void sendToTopic(String content,String topic,MqttClient sampleClient,int qos) throws MqttException {
        
             MqttMessage message = new MqttMessage(content.getBytes());
             message.setQos(qos);
             
             //publish message o the topic
            sampleClient.publish(topic, message);
            System.out.println("Message published "+content);
    }
    
    /**
     * Method to generate a random integer
     * @return random integer
     */
    private static int generateRandomInteger()
    {
        Random r = new Random();
        int Low = 1;
        int High = 6;
        return r.nextInt(High-Low) + Low;
    }
    
}
