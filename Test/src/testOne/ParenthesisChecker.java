package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class ParenthesisChecker
 { 
	static int count = 0;
	static int max = 0;
	static boolean flag = true;
	//)(((())(()()(()))))()(()))(((()))((()()(((()())()()())()))((()()()((()()()())()()))))(()())))())))(()))((()()))())((()()(((((((((()(()()(())()((()))()()()()(((()))()()))))()((((())(()(()()((((())(()())((()))))))((())()()()())(())()))((())())(())))()((())()))))()))))()))))(())(((()())(((()((())()))))))))(()()()))(()))()(()((((()(()(()())))))()())))))(()()))())))((())())((())())()(((()(())()))))()))())))))()((()))())()))(()((((())())()(()))()))()))))(((())()(()((()()(()(()((((())(((())(()()))(())())((((()()(())))())())))))))))())()()(((()))()))()(()(()(())))))())((((()((()((((()()(()())())(((())((((())((())))((((()(((((())))(()))(()))))()))((()))(((()((())))((()(()((()()()()))()())()(())((()()()))()(((((()(())()(())))(((((()(())(()((()()(()(())())()))(()))())()))(())()()())()))())))())(()())))(((((()()(((((())()))))())()((())))(())((())()((((())(()()))((()((()()((()()))(())()(()(()(())((())()())(()())()))))()(())))(())()()(()(())()((()(((())()))(())()((((())((()))()()))))()(())()((()()((
	// Implementation with array list ..THis can also be done using STACK
    static void checker (String str) {
    	
        ArrayList <Character> al = new ArrayList <Character>();
        al.add(str.charAt(0));
        
        for (int i = 1 ; i < str.length();i++) {
            if (al.size() == 0) {
                al.add(str.charAt(i));
                continue;
            }
            
            if ( ((str.charAt(i)==']' && al.get(al.size()-1)=='[')|| 
            		(str.charAt(i)=='}' && al.get(al.size()-1)=='{')||
            		(str.charAt(i)==')' && al.get(al.size()-1)=='(')) && al.size() != 0) {
                al.remove(al.size()-1);
//                i++;
//                count++;
                count = count+2;
//                flag = false;
            } else {
            	/*if (!flag) { For longest valid parenthesis..but didnt work
            		if (count > max)
            			max = count;
            			count = 0;
            		flag = true;
            	}*/
                al.add(str.charAt(i));
            }
        }
        
        /*if (al.size() != 0) 
            return false;
        else 
        	return true;*/
    }
	public static void main (String[] args) throws IOException
	 {
//	    Scanner in = new Scanner(System.in); 
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
//    	int test = in.nextInt();
    	int test= Integer.parseInt(br.readLine());
    	
    	for (int i = 0 ; i < test ; i++) {
//    	    String str = in.nextLine();\
    		String str = br.readLine(); 
    	  /* if ( checker(str)){
    	       System.out.println("balanced");
    	   } else {
    	       System.out.println("not balanced");
    	   }*/
    		checker(str);
    	   System.out.println(count);
//    	   System.out.println(max);
    	}
        
	 }
}
