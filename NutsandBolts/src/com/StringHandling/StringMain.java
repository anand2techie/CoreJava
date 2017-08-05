package com.StringHandling;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bankNameAsLiteral="ICICI Bank";
		
		int customerId=45410707;
		
		String customerIdInString=String.valueOf(customerId);

		String customerIdInStringDirectAssignment=(new Integer(customerId).toString());
		
		String customerIdAsRef=new String(new Integer(customerId).toString());
		
		bankNameAsLiteral.concat(" ,Chennai");
		
		for(int i=0;i<1000;i++)
		{
			bankNameAsLiteral.concat(" ").concat(Integer.toString(i));
		}
		
		System.out.println(bankNameAsLiteral);
		
		String bankName=new String("               ICICi Bank-Chennai      ");
		
		String bankNameDuplicate=new String("ICICi Bank");
		
		//learnStringHandlingPart1(bankNameAsLiteral, bankName);
		
		//learnStringHandlingPart2(bankName);
		
		//learnStringHandlingPart3(bankName);
		
		String bankNameAsSubString=bankNameAsLiteral.substring(0,5); //01234 - ICICI
		
		//System.out.println(bankNameAsSubString);
		
		StringBuffer stringBuffer=new StringBuffer(bankNameAsLiteral); 
		
		
		stringBuffer.append(" ").append("Chennai");
		
		for(int i=0;i<1000;i++)
		{
			stringBuffer.append(" ").append(i);
		}
		
		System.out.println(stringBuffer);
	}

	private static void learnStringHandlingPart3(String bankName) {
		System.out.println(bankName);
		System.out.println(bankName.trim()); //trim spaces in a String (but only leading & trailing)
		
		//System.out.println(result); //0 (equal) or other than 0 (not equal)
		
		String bankNameWithConcatenatedVal=bankName.concat(" ").concat("Chennai");
		
		//System.out.println(bankNameWithConcatenatedVal);
		
									//length()
		for(int index=0;index<bankName.length();index++)
		{
			//toLowerCase()
			String bankNameInLowerCase=bankName.toLowerCase();
			
			//charAt()
			char ch=bankNameInLowerCase.charAt(index);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				//System.out.println(ch);
			}
		}
	}

	private static void learnStringHandlingPart2(String bankName) {
		//System.out.println(bankName.lastIndexOf('I')); //indexOf --> first occurrence; lastIndexOf --> last occurrence
		
		String emptyStr="";
		
		
		System.out.println(emptyStr.isEmpty());
		
		String[] bankNameArr=bankName.split("I"); //split will be done until such a char is present
		
		/*System.out.println(bankNameArr[0]); //ICICi Bank
		System.out.println(bankNameArr[1]); //Chennai
		System.out.println(bankNameArr[2]);*/
		//System.out.println(bankNameAsLiteral.hashCode());
	}

	private static void learnStringHandlingPart1(String bankNameAsLiteral, String bankName) {
		/*System.out.println(bankName.hashCode());
		System.out.println(bankNameDuplicate.hashCode());
		
		System.out.println(bankName.equals(bankNameDuplicate));
		
		System.out.println(bankName==bankNameDuplicate); //don't use == for comparison for a ref string
*/		
		int result=bankName.compareToIgnoreCase(bankNameAsLiteral);
	}

}
