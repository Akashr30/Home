package recursion;

public class FindingPositions {
	

	public static void main (String[] args)
	 {
//	    Scanner sc = new Scanner(System.in);
//	    int test = Integer.parseInt(sc.nextLine());
		int test = 1;
	    String[] arr = null;
	    while (test-- >0) {
	        
	        int num = 651651;    
	        // NAive approach
	       /* StringBuffer sb = new StringBuffer();	
	        for (int i = 2; i <= num ; i+=2) 
	            sb.append(i+" ");
	            
	         arr = sb.toString().split(" ");
	        sb.setLength(0);
	        
	        while (arr.length > 1) {
	            
	            for (int i = 0 ; i < arr.length ; i++) {
	                if (i%2 == 1) 
	                    sb.append(arr[i]+" ");
	            }
	            
	            arr = sb.toString().split(" ");
	            sb.setLength(0);
	                
	        }*/
	        // optimised approach
	        int power = 2;
	        int val = 1;
	        
	        for (int i = 1 ; i < num ; i++) {
	        	
	        	if (val* (power) < num ) {
	        	val = val* (power);
	        	} else {
	        		break;
	        	}
	        }
	        
	        System.out.println(val);
	    }
	 }


}
