package testOne;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAdjacent {
	

    static int flagInt = 0;
    static int count = 0;
    static String next = "";
    static String lastRem = "";
    public static String recur (ArrayList<String> al , int count , int len , String next) {
    
    String remVal = "";
    
    	if (al.size() == 1) {
    		if (lastRem.equals(al.get(0)))
    		al.remove(0);
    		return "";
    	}
    	
    	
    	if (count == len) {
    		return "";
    	}
    	
    	String s = recur(al,++count,len,next);
    	
    	if (s.equalsIgnoreCase(al.get(count)) || al.get(count-1).equalsIgnoreCase(al.get(count))) {
//    	if (al.get(count-1).equalsIgnoreCase(al.get(count))) {
    		flagInt++;
    		remVal = al.get(count);
    		lastRem = al.get(count);
    		al.remove(count);
    	} else 
    	remVal = al.get(count);
    	return remVal;
    }
    
    
    
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	        String[] str = sc.nextLine().split("");
	        ArrayList<String> al = new ArrayList<>();
	        al.add("");
	        for (String s : str) {
	            al.add(s);
	        }
	        
	        do {
	        	flagInt = 0;
	           recur(al,count,al.size()-1,next);
	            
	        } while (flagInt > 0);
	        
	        StringBuffer sb = new StringBuffer();
            
            for (int i = 1 ; i < al.size();i++)
                sb.append(al.get(i));
                
            System.out.println(sb.toString());
	    }
	 }
	//mississipie
	//aaaaaaaaaaaaa
	//geeksforgeek
	//rrmfqqfppejmiuivapyhgnhhwmni
}
