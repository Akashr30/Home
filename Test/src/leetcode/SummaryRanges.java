package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	public static List<String> summaryRanges(int[] nums) {
        
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < nums.length ; i++) {
            
            for (int j = i ; j < nums.length ; j++) {
                
                if (j+1 < nums.length && nums[j]+1 == nums[j+1]) {
                    continue;
                } else if (i == j) {
                    sb.append(nums[i]);
                    break;
                }else {
                    sb.append(nums[i]).append("->").append(nums[j]);
                    i = j;
                    break;
                }
            }
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res;
    }

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,4,5,7};
		summaryRanges(arr);
	}

}
