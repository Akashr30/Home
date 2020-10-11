package leetcode;

public class StoneGameI {
	
	public static int gameOnInt(int[] piles, int si, int ei, boolean turn){ 
	
	    if(si > ei){
	     	return 0;
	 	}
	
		if(turn){ // If its Alex's Turn
			int rr1 = gameOnInt(piles, si + 1,ei,false) + piles[si]; //Consuming from Starting Index
			int rr2 = gameOnInt(piles, si,ei - 1,false) + piles[ei]; //Consuming form Ending Index
			return Math.max(rr1, rr2); //Choosing the Maximum From both of the results
		}
		
		// If it is Lee's Turn
		int rr1 = gameOnInt(piles, si + 1, ei, true) - piles[si]; //Consuming from the Starting Index
		int rr2 = gameOnInt(piles, si, ei - 1, true) - piles[ei];//Consuming from the Ending Index
		return Math.min(rr1, rr2); // Choosing the Minimum from the Recursion Result
	}

	public static void main(String[] args) {
		
		int[] arr = {5,3,4,5};
		gameOnInt(arr,0,arr.length -1,true);

	}

}
