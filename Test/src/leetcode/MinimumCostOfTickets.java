package leetcode;

public class MinimumCostOfTickets {
	
	static Integer[] dp;
    public static int mincostTickets(int[] days, int[] costs) {
         dp = new Integer[days.length];
        return helper(days, costs, 0);
    }
    
    private static int helper(int[] days, int[] costs, int day) {
        if(day >= days.length)
            return 0;
    
        if(dp[day] != null)
            return dp[day];
        
        int ondDayPass = helper(days, costs, day + 1) + costs[0];
        
        int i;
        for(i = day; i < days.length; i++)
            if(days[i] >= days[day] + 7)
                break;
        
        int sevenDayPass = helper(days, costs, i) + costs[1];
        
        for(i = day; i < days.length; i++)
            if(days[i] >= days[day] + 30)
                break;
        
        int thirtyDayPass = helper(days, costs, i) + costs[2];
        
        return dp[day] = Math.min(ondDayPass, Math.min(sevenDayPass, thirtyDayPass));
    }

	public static void main(String[] args) {
		
//		int[] days =  {1,4,6,7,8,22,25};
//		int[] days = {1,9,17,26,30};
		int[] days = {1,4,6,7,8};
		int[] costs = {2,7,15};
		mincostTickets(days,costs);
	}

}
