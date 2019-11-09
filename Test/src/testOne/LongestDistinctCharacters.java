package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LongestDistinctCharacters {
	
	/*public static void main (String[] args) throws IOException
	 {
//       Scanner sc = new Scanner(System.in);
		 BufferedReader sc = new BufferedReader(new
			        InputStreamReader(System.in));
       int test = Integer.parseInt(sc.readLine()); 
       
       for (int i = 0 ; i < test ; i++) {
           int[] arr = new int[200];
           String str = sc.readLine(); 
           char[] ch = str.toCharArray();
           int[] arr1 = new int[ch.length];
           String mainStr = "";
           String auxStr = "";
           int max = 0;
           int cons = 0;
           // abababcdefababcdab
           //aewergrththy
           //geeksforgeeks
           for (int j = 0 ; j < ch.length;j++) {
               if(arr[ch[j]]==0) {
                   arr[ch[j]]++;
                   auxStr += ch[j];
               } else if (arr[ch[j]] != 0) {
            	   
            	   arr1[cons] = auxStr.length();
                   mainStr += auxStr+",";
            	   auxStr = "";
            	   arr = new int[200];
                   auxStr +=ch[j];
                   
                   arr[ch[j]]++;
                   cons++;
               }
           }
           mainStr += auxStr+",";
           arr1[cons] = auxStr.length();
           System.out.println(mainStr);
           for (int maxOf = 0 ; maxOf < arr1.length;maxOf++) {
        	   if (arr1[maxOf] > max) {
        		   max = arr1[maxOf];
        	   }
           }
           System.out.println(max);
       }
	 }*/
	
	
	/*public static void main (String[] args) throws IOException
	 {
//       Scanner sc = new Scanner(System.in);
		 BufferedReader sc = new BufferedReader(new
			        InputStreamReader(System.in));
       int test = Integer.parseInt(sc.readLine()); 
       
       for (int i = 0 ; i < test ; i++) {
           int[] arr = new int[200];
           String str = sc.readLine(); 
           char[] ch = str.toCharArray();
           int[] arr1 = new int[ch.length];
           String mainStr = "";
           String auxStr = "";
           int max = 0;
           int cons = 0;
           // abababcdefababcdab
           //aewergrththy
           //geeksforgeeks
            //aeltwerfeg
           for (int j = 0 ; j < ch.length;j++) {
               if(arr[ch[j]]==0) {
                   arr[ch[j]]++;
                   auxStr += ch[j];
               } else if (arr[ch[j]] != 0) {
            	   
            	   arr1[cons] = auxStr.length();
                   mainStr += auxStr+",";
            	   auxStr = "";
            	   if (j==0)
                   auxStr +=ch[j];
            	   else {
            		   auxStr+= ch[j-1];
            		   if (ch[j] != ch[j-1])
            	   auxStr+=ch[j];
            	   }
                   arr = new int[200];
                   arr[ch[j]]++;
                   if(arr[ch[j-1]]==0)
                   arr[ch[j-1]]++;
                   cons++;
               }
           }
           mainStr += auxStr+",";
           arr1[cons] = auxStr.length();
           System.out.println(mainStr);
           for (int maxOf = 0 ; maxOf < arr1.length;maxOf++) {
        	   if (arr1[maxOf] > max) {
        		   max = arr1[maxOf];
        	   }
           }
           System.out.println(max);
       }
	 }*/
	
	//Answer 
	public static void main (String[] args) throws IOException
	 {
		BufferedReader sc = new BufferedReader(new
		        InputStreamReader(System.in));
			int test = Integer.parseInt(sc.readLine()); 
			
			 for (int i = 0 ; i < test ; i++) {
				 HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
				 String str = sc.readLine(); 
		         char[] ch = str.toCharArray();
		         String auxStr = "";
//		         String mainStr = "";
		         int cons = 0;
		         int max = 0;
		         int[] arr = new int[ch.length];
		         for (int j = 0 ; j < ch.length;) {
		        	 if (hm.get(ch[j]) == null) {
		        		 auxStr = auxStr+ch[j];
		        		 hm.put(ch[j], j);
		        		 j++;
		        	 } else if (hm.get(ch[j]) != null) {
//		        		 mainStr += auxStr+",";
		        		 arr[cons] = auxStr.length();
		        		 int val = hm.get(ch[j]);
		        		 char chVal = ch[j];
		        		 hm = new HashMap<Character,Integer>();
		        		  auxStr = "";
//		        		 hm.put(ch[j], val);
		        		 j = val+1;
		        		 cons++;
		        	 }
//		        	 j++;
		         }
		         arr[cons] = auxStr.length();
//		         System.out.println(mainStr);
		         for (int z = 0 ; z < arr.length;z++) {
		        	 if (arr[z] >= max) {
		        		 max = arr[z];
		        	 }
		         }
		         System.out.println(max);
			 }

	 }
}
