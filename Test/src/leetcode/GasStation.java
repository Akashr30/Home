package leetcode;

public class GasStation {
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        
        // [1,2,3,4,5]
//cost = [3,4,5,1,2]
    	 int total = 0, tank = 0, index = 0;
         for (int i = 0; i < cost.length; i++) {
             int consume = gas[i] - cost[i];			
             tank += consume;
             if (tank < 0) {
                 index = i + 1;
                 tank = 0;
             }
             total += consume;			
         }		
         return total < 0 ? -1 : index;
       
      /* int st = -1;
       int sum = 0;
       int sub = Integer.MAX_VALUE;
       for (int i = 0; i < gas.length ; i++) {
           if (cost[i] <= gas[i]) {
               if (cost[i] <= sub) {
                       sum = gas[i];
                       sub = cost[i];
                       st = i;
               }
           }
       }
       int n = gas.length+st;
       
       for (int i = st+1 ; i < n ; i++) {
    	   int x = i%gas.length;
           sum = sum+gas[i%gas.length]-sub;
           sub = cost[i%gas.length];
           if (sum < 0)
               return -1;
       }
       
      return sum-sub >= 0 ? st : -1; */
   }

	public static void main(String[] args) {
		
//		int[] a = {1,2,3,4,5};
//		int[] b = {3,4,5,1,2};
//		int[] a = {2,3,4};
//		int[] b = {3,4,3};
		int a[] = {5,1,2,3,4};
		int[] b = {4,4,1,5,1};
		canCompleteCircuit(a,b);
		
	}

}
