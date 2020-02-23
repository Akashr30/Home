package testOne;


import java.util.*;
import java.lang.*;
import java.io.*;



class NumberToWords
 {
	
	public static void main (String[] args)
	 {/*
		 int ak = 00;
		 System.out.println(ak);
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    sc.nextLine();  
	    HashMap <Integer,String> map = new HashMap <Integer,String> ();
	    map.put(1,"one");
	    map.put(2,"two");
	    map.put(3,"three");
	    map.put(4,"four");
	    map.put(5,"five");
	    map.put(6,"six");
	    map.put(7,"seven");
	    map.put(8,"eight");
	    map.put(9,"nine");
	    map.put(10,"ten");
	    map.put(11,"eleven");
	    map.put(12,"twelve");
	    map.put(13,"thirteen");
	    map.put(14,"fourteen");
	    map.put(15,"fifteen");
	    map.put(16,"sixteen");
	    map.put(17,"seventeen");
	    map.put(18,"eighteen");
	    map.put(19,"nineteen");
	    map.put(20,"twenty");
	    map.put(30,"thirty");
	    map.put(40,"fourty");
	    map.put(50,"fifty");
	    map.put(60,"sixty");
	    map.put(70,"seventy");
	    map.put(80,"eighty");
	    map.put(90,"ninety");
	    map.put(100,"hundred");
	    map.put(1000,"thousand");
	    
	    for ( int j = 0 ; j < tc ; j++ ) {
	        String num =  sc.nextLine();
	        String word = "";
	        if (num == "0") {
	            word = "zero";
	            break;
	        }
	        int temp3 = Integer.parseInt(num);
	        if (temp3 <= 19) {
	            word += map.get(temp3)+" ";
	            System.out.println(word.substring(0,word.length()-1 ));
            	continue; 
	        }
	        int len = num.length()-1;
	        
	        for (int i = 0 ; (i <= len) ; i++ ) {
	            
	            if (num.charAt(i) == '0')
	                continue;
	            if (i >= len-1) {
	                int a = Character.getNumericValue(num.charAt(i));
	                if (a > 1) {
		                int temp1 = (int) Math.pow(10, len-i);
		                word += map.get(a * temp1 )+" ";
	                } else {
	                	if (num.charAt(i) == '1' || len == 0) {
	                		int temp2 = Character.getNumericValue(num.charAt(i));
		                	word += map.get(temp2)+" ";
		                	break;
	                	}
	                	int temp2 = 10+Character.getNumericValue(num.charAt(i+1));
	                	word += map.get(temp2)+" ";
	                	break;
	                }
	            }else {    
	            	int b = Character.getNumericValue(num.charAt(i)); 
	            	int temp = (int) Math.pow(10, len-i);
		             word += map.get(b)+" "+map.get(temp)+" ";
		             if (temp == 100) {
		            	 word += "and ";
		             }
	            }
	        }
//	        System.out.println(word);
	        System.out.println(word.substring(0,word.length()-1 ));
	    }
	 */

		 /*int ak = 00;
		 System.out.println(ak);*/
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    sc.nextLine();  
	    HashMap <Integer,String> map = new HashMap <Integer,String> ();
	    map.put(1,"one");
	    map.put(2,"two");
	    map.put(3,"three");
	    map.put(4,"four");
	    map.put(5,"five");
	    map.put(6,"six");
	    map.put(7,"seven");
	    map.put(8,"eight");
	    map.put(9,"nine");
	    map.put(10,"ten");
	    map.put(11,"eleven");
	    map.put(12,"twelve");
	    map.put(13,"thirteen");
	    map.put(14,"fourteen");
	    map.put(15,"fifteen");
	    map.put(16,"sixteen");
	    map.put(17,"seventeen");
	    map.put(18,"eighteen");
	    map.put(19,"nineteen");
	    map.put(20,"twenty");
	    map.put(30,"thirty");
	    map.put(40,"forty");
	    map.put(50,"fifty");
	    map.put(60,"sixty");
	    map.put(70,"seventy");
	    map.put(80,"eighty");
	    map.put(90,"ninety");
	    map.put(100,"hundred");
	    map.put(1000,"thousand");
	    
	    for ( int j = 0 ; j < tc ; j++ ) {
	        String num =  sc.nextLine();
	        int len  = num.length();
	        String word = "";
	        boolean and = false;
	        
	        for (int i = 0 ; i < len ; i++ ) {
	            
	            if (num.charAt(i)=='0') {
	                continue;
	            }
	            
	            if (and) {
	            	word += "and ";
	            	and = false;
	            }
	            
	            if (i == len-1) {
	            	word+= map.get(Character.getNumericValue(num.charAt(i)))+" ";
	            	break;
	            }
	        
	            if ( len <= 2 || i >= len-2) {
	                int temp = Integer.parseInt(num.substring(len-2,len));
	                
	                if (temp <= 20) {
	                    word += map.get(temp)+" ";
                       break;	                
	                } else {
	                    int val = Character.getNumericValue(num.charAt(i));
	                    int power =(int) Math.pow(10,(len-i-1));
	                    word += map.get((val * power))+" ";
	                }
	             } else {    
	            	int b = Character.getNumericValue(num.charAt(i)); 
	            	int temp2 = (int) Math.pow(10, (len-i-1));
		             word += map.get(b)+" "+map.get(temp2)+" ";
		             if (temp2 == 100) {
		            	 and = true;
		             }
	            }
	        }
//	        System.out.println(word);
	        System.out.println(word.substring(0,word.length()-1 ));
	    }
	 
	 
	 
	 
	 
	 }
}