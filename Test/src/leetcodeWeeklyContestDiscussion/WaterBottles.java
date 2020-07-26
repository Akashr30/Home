package leetcodeWeeklyContestDiscussion;

public class WaterBottles {
	
	public static int numWaterBottles(int numBottles, int numExchange) {
        
        if (numExchange > numBottles)
            return numBottles;
        
        int sum = numBottles;
        // int div = numBottles
        while (numBottles >= numExchange) {
            
            int q = numBottles/numExchange;    //15/4 = 3  rem = 3
            sum += q;
            int rem = numBottles%numExchange;
            int empty = rem+q;
            numBottles = empty;
            
        }
        
        return sum;
    }

	public static void main(String[] ar) {
		
//		int numBottles = 15;
		int numBottles = 9;
		int numExchange = 3;
		numWaterBottles(numBottles,numExchange);
	}

}
