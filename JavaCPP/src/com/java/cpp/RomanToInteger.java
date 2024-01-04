package com.java.cpp;

public class RomanToInteger {
	
	     public int getVal(char ch) {
	         switch(ch) 
	         {
	             case 'I': return 1;
	             case 'V': return 5;
	             case 'X': return 10;
	             case 'L': return 50;
	             case 'C': return 100;
	             case 'D': return 500;
	             case 'M': return 1000;
	             default: return 0;

	         }
	     }
	     
	     public int romanToInt(String s) {
	         int sum=0;
	         for(int i=0; i<s.length(); i++)
	         {
	             char ch = s.charAt(i);

	             if((i+1) < s.length() && getVal(ch) < getVal(s.charAt(i+1)))
	             {
	                 sum=sum-getVal(ch);
	             }
	             else
	             {
	                 sum=sum+getVal(ch);
	             }
	         }
	         return sum;
	}

	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();
		
		int x = rti.romanToInt("IX");
		System.out.println(x);
	}

}
