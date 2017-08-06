package com.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//import java.lang.*; by default

public class IOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFromFile();
	}

	static void readFromConsole() {
		
		//Decorator pattern: O1 <------> O1 <-------> O3 <-----> On
		// Create an ISR object for reading from a console
		InputStreamReader inputStreamReader = new InputStreamReader(System.in); // char
																				// by
																				// char

		// Create a BR object for reading from an ISR object
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // line
																				// by
																				// line
		
		System.out.println("Enter something here to print it!:");
		String linesRead = "";
		try {
			while ((linesRead = bufferedReader.readLine()) != null) {
				System.out.println(linesRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void readFromConsoleUsingScanner()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Account Holder name:");
		String accountHolder=scanner.next();
		System.out.println("Enter Account balance:");
		float accountBalance=scanner.nextFloat();
		scanner.close();
		
		// System.console().readLine(); - outside IDE
		
		System.out.println("Account balance of "+accountHolder+" is "+accountBalance+".");
	}
	
	
	
	
	static void readFromFile()
	{
		File file=new File("F:\\Gokul session\\Session 11_IO Programming_0745to0915\\session_11_IO Programming.txt");
		CapitalizedReader capitalizedReader=null;
		try {
			FileReader fileReader=new FileReader(file);
			
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			capitalizedReader=new CapitalizedReader(bufferedReader);
			
			String linesBeingRead="";
			while((linesBeingRead=capitalizedReader.readLine())!=null)
			{
				System.out.println(linesBeingRead);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				capitalizedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void writeToFile()
	{
		File file=new File("F:\\Gokul session\\Session 11_IO Programming_0745to0915\\newTestFile.txt");
		BufferedWriter bufferedWriter=null;
		try {
			FileWriter fileWriter=new FileWriter(file);
			bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write("I'm writing a sample data");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static void doFileOperations()
	{
		File file=new File("F:\\Gokul session\\Session 11_IO Programming_0745to0915\\newTestFile1.txt");
/*		//file.mkdir();
		//file.exists(); file.mkdirs(); System.out.println(file.getAbsolutePath());
		System.out.println(file.lastModified());
		Date date=new Date(file.lastModified());
		System.out.println(date);
		file.isDirectory(); //to check whether it's a folder or a file
		file.length(); //in terms of bytes
*/		System.out.println(file.canWrite());
		System.out.println(file.toString());
		System.out.println(file.getAbsolutePath());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
