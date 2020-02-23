package dynamicProgramming;

import java.util.Scanner;

public class DecodeMessages {
	
		
	// A Dynamic Programming based 
	// function to count decodings 
	static int countDecodingDP(char digits[], 
							int n) 
	{ 
		// A table to store results of subproblems 
		int count[] = new int[n + 1]; 
		count[0] = 1; 
		count[1] = 1; 
		if(digits[0]=='0') //for base condition "01123" should return 0 
			return 0; 
		for (int i = 2; i <= n; i++) 
		{ 
			count[i] = 0; 

			// If the last digit is not 0, 
			// then last digit must add to 
			// the number of words 
			if (digits[i - 1] > '0') 
				count[i] = count[i - 1]; 

			// If second last digit is smaller 
			// than 2 and last digit is smaller 
			// than 7, then last two digits 
			// form a valid character 
			if (digits[i - 2] == '1' || 
			(digits[i - 2] == '2' && 
				digits[i - 1] < '7')) 
				count[i] += count[i - 2]; 
		} 
		return count[n]; 
	} 

	// Driver Code 
	public static void main (String[] args) 
	{ 
		char digits[] = {'1','3','1','0','5'}; 
		int n = digits.length; 
		System.out.println("Count is " + 
				countDecodingDP(digits, n)); 
	} 
	

	// This code is contributed by anuj_67 
	// Modified by Atanu Sen 

	
	
	
	//-------------------------------------------------------------
	
	// gfg recusrsive top down approach
//    public static int count = 0;
//    public static int num = 0;
   /* public static int decode(String[] arr ,int num ,int len) {
        
    	if (num == len-1 || num == len-2) {
    		return 1;
    	}
    	if (arr[0].equalsIgnoreCase("0")) 
    	    return 0;
    	
    	if (Integer.parseInt(arr[len-1]) == 0 && Integer.parseInt(arr[len-2]) > 2 )
    		return 0;
    	    
    	int count = 0;
    	
    	if ( Integer.parseInt(arr[num+1]) > 0) 
    		 count =  decode(arr,num+1,len);
        if (Integer.parseInt(arr[num+1]) == 1 ||( Integer.parseInt(arr[num+1]) == 2
        		&& Integer.parseInt(arr[num+2]) < 7 ))
        count += decode(arr, num+2 , len);
        
        return count;
        
    }
	public static void main (String[] args)
	 {
    	
    	Scanner sc = new Scanner(System.in);
    	int test = Integer.parseInt(sc.nextLine());
    	
    	while (test > 0) {
    	    int len = Integer.parseInt(sc.nextLine());
    	    String str = sc.nextLine();
    	    String[] arr = str.split("");
//    	    decode(arr,0,len);
//    	    System.out.println(count);
    	    System.out.println(decode(arr,-1,len));
    	    test--;
    	}
	 }*/
	
	//------------------------------------------------------------------------
	// bottom up approach-- not working
	/*static int countDecoding(char[] digits, int n)  
	{ 
	    // base cases 
	    if (n == 0 || n == 1) 
	    return 1; 
	    if(digits[0]=='0')   //for base condition "01123" should return 0  
	          return 0; 
	  
	    // Initialize count 
	    int count = 0;  
	  
	    // If the last digit is not 0, then  
	    // last digit must add to 
	    // the number of words 
	    if (digits[n - 1] > '0') 
	    count = countDecoding(digits, n - 1); 
	  
	    // If the last two digits form a number 
	    // smaller than or equal to 26, 
	    // then consider last two digits and recur 
	    if (digits[n - 2] == '1' ||  
	       (digits[n - 2] == '2' && digits[n - 1] < '7')) 
	    count += countDecoding(digits, n - 2); 
	  
	    return count; 
	} 
	  
	// Driver program to test above function 
	public static void main(String[] args)  
	{ 
//	    char digits[] = {'1', '2', '2', '1'}; 
	    char digits[] = {'6','7','5','3','5','6','2','9','1','2','7','0','9','3','6','0','6','2','6','1','8','7','9','2'};
//	    11
//		22974356140
	    int n = digits.length; 
	    System.out.printf("Count is %d", countDecoding(digits, n)); 
	} */

}
