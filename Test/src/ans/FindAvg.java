package ans;

import java.util.ArrayList;

public class FindAvg {
	
	public static void main(String[] ar) {
		
		/*int[] salary = {4000,3000,1000,2000};
		
		int sum = 0;
        
        for (int i = 2 ; i < salary.length-2; i++) {
            sum += salary[i];
        }
        
        int avg = salary.length-2 ;
        
        double d = sum/avg;
        
        System.out.print(d);*/
		int[] nums = {1,1,0,1};
		FindAvg ff = new FindAvg();
		ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 1) {
                sum += 1;
            } else {
                al.add(sum);
                sum = 0;
            }
        }
        if (!al.contains(0)) {
//            return al.size()-1;
        }
        
        int maxx = 0;
        int add = 0;
        for (int i = 0 ; i < al.size()-2;i++) {
            
            if (al.get(i) != 0 && al.get(i+1) == 0 && al.get(i+2) != 0) {
                add = al.get(i)+al.get(i+2);
                maxx = Math.max(add,maxx);
            }            
            
        }
        
//        return maxx;
//		System.out.println(ff.longestSubarray(arr));
	}
	
	/*public  int longestSubarray(int[] nums) {
        
        
    }*/


/*public static void main () {
	
	int[] arr = {1,1,0,1};
	System.out.println(longestSubarray(arr));
}*/

}
