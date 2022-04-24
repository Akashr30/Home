package testOne;

import java.util.Scanner;

public class SortZerosOnesTwos {
	 
		public static void main (String[] args)
		 {
	        /*Scanner sc = new Scanner(System.in);
	        int test = sc.nextInt();
	        sc.nextLine();
	        // String num = "";

	        String sortednum = "";
	        for (int i = 0 ; i < test ; i++) {
	            
	            int len = sc.nextInt();
	            sc.nextLine();
	            String num = sc.nextLine();
	            num = num.replaceAll("\\s", ""); 
	            char[] ch = num.toCharArray();
	            StringBuilder zeros= new StringBuilder();
	            StringBuilder ones = new StringBuilder();
	            StringBuilder twos = new StringBuilder();
	            String one="";
	            String two="";
	            String zero="";
	            String word = "";
	            for (int j = 0 ; j < len  ; j++) {
	                
	                switch(ch[j]) {
	                    case '0':
	                        zeros = zeros.append(num.charAt(j)).append(" ") ;
	                        break;
	                    
	                    case '1':
	                        ones =  ones.append(num.charAt(j)).append(" ") ;
	                        break;
	                        
	                    case '2':
	                        twos =  twos.append(num.charAt(j)).append(" ") ;
	                        break;
	                }
	                 
	            }
	            zero = zeros.toString();
                one = ones.toString();
                two = twos.toString();
               
                if (zero.length()>0) {
                	zero = zero.substring(0,zero.length()-1);
                	word += zero;
                }
                if (one.length()>0) {
                	one = one.substring(0,one.length()-1);
                	if (word.length()>0) {
                		word += " "+one;
                	} else {
                		word += one;
                	}
                }
               if (two.length()>0) {
            	   two = two.substring(0,two.length()-1);
            	   if (word.length()>0) {
               		word += " "+two;
               	} else {
               		word += two;
               	}
               }
	            System.out.println(word);
	        }
	        	 */
			
			Scanner sc = new Scanner(System.in);
	        int test = sc.nextInt();
	        sc.nextLine();
	        
	        for (int i = 0 ; i < test ; i++) {
	        	
	        	int len = sc.nextInt();
	        	sc.nextLine();
	            String num = sc.nextLine();
	            num = num.replaceAll("\\s", ""); 
	            char[] ch = num.toCharArray();
	            int one = 0,two = 0 , zero = 0;
			   for (int j = 0 ; j < len  ; j++) {
				                
	                switch(ch[j]) {
	                    case '0':
	                    	zero++;
	                        break;
	                    
	                    case '1':
	                    	one++;
	                        break;
	                        
	                    case '2':
	                    	two++;
	                        break;
	                }
				                 
	            }
			   while (zero > 0) {
				   System.out.print("0"+" ");
				   zero--;
			   }
			   
			   while (one > 0) {
				   System.out.print("1"+" ");
				   one--;
			   }
			   
			   while (two > 0) {
				   System.out.print("2"+" ");
				   two--;
			   }
	        }
		 }
	}