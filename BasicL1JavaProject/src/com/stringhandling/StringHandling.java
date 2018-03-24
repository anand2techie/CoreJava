package com.stringhandling;

import oops.Bicycle;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a String
		String socialNetworkingSiteName = "AcadSocial";
		// 0123456789
		String socialNetworkingSiteName2 = new String("acadSocial");
		socialNetworkingSiteName2="acadSocialModified";
		System.out.println(socialNetworkingSiteName2);
		
		Bicycle bicycle=new Bicycle();
		/*System.out.println(socialNetworkingSiteName);
		
		System.out.println("Equality of 2 Strings:");
		System.out.println("with case: "+socialNetworkingSiteName.equals(socialNetworkingSiteName2));
		System.out.println("without case: "+socialNetworkingSiteName.equalsIgnoreCase(socialNetworkingSiteName2));
		
		int compareToResult=socialNetworkingSiteName.compareTo(socialNetworkingSiteName2);
		int compareToResultWithoutCase=socialNetworkingSiteName.compareToIgnoreCase(socialNetworkingSiteName2);
		System.out.println("Compare To result "+compareToResult);
		System.out.println("Compare To result without case "+compareToResultWithoutCase);*/
		
		String concatenatedStr=socialNetworkingSiteName.concat(" sponsered by").concat(" Facebook");
		System.out.println("After concatenation: "+concatenatedStr);
		//String is immutable - only at the level of memory
		
		//StringIndexOutOfBoundsException:
		//System.out.println(socialNetworkingSiteName.charAt(100));
		//socialNetworkingSiteName.charAt(-10);
		// System.out.println(socialNetworkingSiteName2);

		// call countVowelsCharacter()
		StringHandling handling = new StringHandling();
		//int vowelsCount = handling.countVowelsCharacter(socialNetworkingSiteName);
		//System.out.println(vowelsCount);
		
		//NullPointerException, if you check for null
		if(socialNetworkingSiteName.contains("Social")){
			System.out.println("Yes! It contains the specific string");
		}else{
			System.out.println("Nope! It doesn't");
		}
		
		if(socialNetworkingSiteName.endsWith("l")){
			System.out.println("Yes, it's ending with that");
		}else{
			System.out.println("Nope!");
		}
		
		//AcadSocial
		//indexOf - index of first occurrence
		int index=socialNetworkingSiteName.indexOf("P");
		//if the char is not present in that string, it's going to give u back a -ve value
		System.out.println("index of P: "+index);
		
		int lastIndex=socialNetworkingSiteName.lastIndexOf("a");
		System.out.println("last occurrence of a "+lastIndex);
		
		String emptyString="";//empty string
		String spaceContainedString="   a   ";//space can't be an empty String
		System.out.println("After trimming: "+spaceContainedString.trim());
		if(spaceContainedString.trim().isEmpty()){
			System.out.println("String is empty");
		}
		else{
			System.out.println("Nope, String has a value");
		}
		//split, substring, toCharArray, replace
		
		//AcadSocial
		System.out.println(socialNetworkingSiteName.substring(5));//ocial
															//from - inclusive; end - exclusive
		System.out.println(socialNetworkingSiteName.substring(0, 4));//0,4-1
		
		char[] strArray=socialNetworkingSiteName.toCharArray();
		
		String socialNtwrkNameModified=socialNetworkingSiteName.replace("Acad", "Academic");
		
		System.out.println(socialNtwrkNameModified);
		
		//array, OOPS, Collections, Exception Handling, File Handling etc..
		
	}

	int countVowelsCharacter(String str) {

		// I need to iterate my String and get the chars one-by-one
		// last index = length - 1
		int countOfVowels = 0;

		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.charAt(i));
			char lowerCasedCharacter=Character.toLowerCase(str.charAt(i));
			// or
			if (lowerCasedCharacter == 'a' || lowerCasedCharacter == 'e' || lowerCasedCharacter == 'i' || lowerCasedCharacter == 'o'
					|| lowerCasedCharacter == 'u') {
				countOfVowels++;
			}
		}

		// if you have a return type, you should have return statement
		return countOfVowels;
	}

}
