package treesAndGraphs;
//Java program to solve fractional Knapsack Problem
import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
	private static double getMaxValue(int[] wt, int[] val,int capacity){
		Container[] iVal = new Container[wt.length];

		for (int i = 0; i < wt.length; i++) {
			iVal[i] = new Container(wt[i], val[i]);
		}

		// sorting items by value;
		Arrays.sort(iVal, new Comparator<Container>() {
			@Override
			public int compare(Container o1, Container o2)
			{
				return o2.cost.compareTo(o1.cost);
			}
		});

		double totalValue = 0;

		for (Container i : iVal) {

			int curWt = (int)i.weight;
			int curVal = (int)i.val;

			if (capacity - curWt >= 0) {
				// this weight can be picked while
				capacity = capacity - curWt;
				totalValue += curVal;
			}
			else {
				// item cant be picked whole
				double fraction	= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity= (int)(capacity - (curWt * fraction));
				break;
			}
		}

		return totalValue;
	}

	// item value class
	static class Container {
		Double cost;
		double weight, val, ind;

		// item value function
		public Container(int wt, int val)
		{
			this.weight = wt;
			this.val = val;
			cost = new Double((double)val / (double)wt);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] weight = { 10, 40, 20, 30 };
		int[] val = { 60, 40, 100, 120 };
		int capacity = 50;

		double maxValue = getMaxValue(weight, val, capacity);

		// Function call
		System.out.println("Maximum value we can obtain = "
						+ maxValue);
	}
}






/*
class Solution {

public int coinChange(int[] coins, int amount) {

	int ways=numWays(coins,amount,0);
	if(ways==Integer.MAX_VALUE-1)
		return -1;

    return ways;
}

public int numWays(int[] coins,int amount,int index){
    if(coins.length==index || amount==0){
        if(amount==0)
            return 0;
        return Integer.MAX_VALUE-1;
    }
    int ways=0;
    if(coins[index]<=amount){
     ways=Math.min(1+numWays(coins,amount-coins[index],index),
                     numWays(coins,amount,index+1));
    }else{
        ways=numWays(coins,amount,index+1);
	}        
    return ways;
}*/