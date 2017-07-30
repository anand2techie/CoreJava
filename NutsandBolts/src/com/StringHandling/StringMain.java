package com.StringHandling;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bankNameAsLiteral="ICICI Bank";
		
		String bankName=new String("               ICICi Bank-Chennai      ");
		
		String bankNameDuplicate=new String("ICICi Bank");
		
		/*System.out.println(bankName.hashCode());
		System.out.println(bankNameDuplicate.hashCode());
		
		System.out.println(bankName.equals(bankNameDuplicate));
		
		System.out.println(bankName==bankNameDuplicate); //don't use == for comparison for a ref string
*/		
		int result=bankName.compareToIgnoreCase(bankNameAsLiteral);
		
		//System.out.println(bankName.lastIndexOf('I')); //indexOf --> first occurrence; lastIndexOf --> last occurrence
		
		String emptyStr="";
		
		
		System.out.println(emptyStr.isEmpty());
		
		String[] bankNameArr=bankName.split("I"); //split will be done until such a char is present
		
		/*System.out.println(bankNameArr[0]); //ICICi Bank
		System.out.println(bankNameArr[1]); //Chennai
		System.out.println(bankNameArr[2]);*/
		//System.out.println(bankNameAsLiteral.hashCode());
		
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

}
