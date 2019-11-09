package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class NutsAndBolts {
	
	public static void main (String[] args) throws IOException {
	
/* using hashset 
        Scanner in = new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("ENter the test case :");
    	int test = in.nextInt();
    	String symbols = "!#$%&*@^~";
    	char[] syms = "!#$%&*@^~".toCharArray();
    	for (int i = 0 ; i < test ; i++) {
    		System.out.println("ENter the total pairs :");    
    	    int totPairs = in.nextInt();
    	    
    	    Hashtable <Integer,String> nuts = new Hashtable <Integer,String>();
    	    Hashtable <Integer,String> bolts = new Hashtable <Integer,String>();
    	    String nutsStr = "";
    	    String boltsStr = "";
    	    String n = "";
    	    String m = "";
    	    int pos1 = -1;
    	    int pos2 = -1;
    	    
    	    System.out.println("ENter the bolts :");
    	    for (int bolt = 0 ; bolt < totPairs ; bolt++){
    	         m = br.readLine(); 
    	        
    	        pos1 = (symbols.indexOf(m))+1;
    	        if (pos1 > 0)
    	        bolts.put(pos1,m);
    	    }
    	    
    	    System.out.println("ENter the Nuts :");
    	    for (int nut = 0 ; nut < totPairs ; nut++){
    	         n = br.readLine();
    	        
    	        pos2 = (n.indexOf(symbols))+1;
    	        if (pos2 > 0)
    	        nuts.put(pos2,n);
    	    }
    	    
    	    for (int x = 0 ; x < symbols.length() ; x++) {
    	        if (nuts.get(x+1) != null && bolts.get(x+1) != null ) {
    	            nutsStr += nuts.get(x)+" ";
    	            boltsStr += bolts.get(x)+" ";
    	        }
    	    }
    	    System.out.println("O/P :");
    	    System.out.println(nutsStr);
    	    System.out.println(boltsStr);
    	}*/
		
		//usnig Array
		
		
		    Scanner sc = new Scanner(System.in); 
	    	int test = sc.nextInt();
	    	
	    	char[] syms = "!#$%&*@^~".toCharArray();
	    	
	    	for (int i = 0 ; i < test ; i++) {
	    	    
	    	    int num = sc.nextInt();
	    	    
	    	    char[] nuts = new char[syms.length];
	    	    char[] bolts = new char[syms.length];
	    	    int pos1 = -1;
	    	    int pos2 = -1;
	    	    String nutsStr = "";
	    	    String boltsStr = "";
	    	    for (int nut = 0 ; nut < num ; nut++){
	    	        char nu =sc.next().charAt(0);
	    	        for (int aa = 0 ; aa < syms.length;aa++ ){
	    	            if (syms[aa]== nu){
	    	                nuts[aa] = nu;
	    	            }
	    	        }
	    	        
	    	    }
	    	    
	    	    for (int bolt = 0 ; bolt < num ; bolt++){
	    	        char bo = sc.next().charAt(0);
	    	        for (int bb = 0 ; bb < syms.length;bb++){
	    	            if (syms[bb]== bo){
	    	                bolts[bb] = bo;
	    	            }
	    	        }
	    	        
	    	    }
	    	    
	    	    for (int z = 0 ; z < syms.length ; z++){
	    	        if (nuts[z]!=0 && bolts[z]!=0 && nuts[z]==bolts[z] ){
	    	            nutsStr += nuts[z]+" ";
	    	            boltsStr +=  bolts[z]+" ";
	    	        }
	    	    }
	    	    System.out.println(nutsStr);
	    	    System.out.println(boltsStr);
	    	    
	    	}
	    	
		 }
	

}
