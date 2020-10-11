package leetcode;

import java.util.Arrays;

public class TaskScheduler {
	
/*public static int leastInterval(char[] tasks, int n) {
        
        int[] arr = new int[26];
        for (char c : tasks) {
            arr[c-'A']++;
        }
        Arrays.sort(arr);
        int num = arr.length-1;
        int ans = 0;
        for (int i = num ; i >= 0 ;) {
            
            if (arr[i] == 0) {
            	i--;
                continue;
            }
            
            if (arr[i] == 1) {
                arr[i]--;
                ans++;
            } else {
                arr[i]--;
                ans++;
                for (int j = i-1 ; j >= i-n ;j--) {
                	if (arr[j] != 0) {
	                    arr[j]--;
                	}
                	ans++;
                }
                
            }
            if (arr[i] == 0)
            	i--;
        }
        return ans;
    }*/
	public static int leastInterval(char[] tasks, int n) {
		if (tasks == null || tasks.length == 0) {
			return 0;
		}
		int m = tasks.length;
		int[] cnt = new int[26];
		/* Build the count array with frequency of each task */
		for (char c: tasks) {
			cnt[c - 'A']++;
		}
		Arrays.sort(cnt);
		/* Get maximum frequency task  and calculate max idle spaces*/
        int max = cnt[25]-1;
		int spaces = max * n;
		
		/* Iterate over rest of the array and reduce the idle space count */
		for (int i = 24; i >= 0; i--) {
			spaces -= Math.min(max, cnt[i]);
		}
		/* Handle cases when spaces become negative */
		spaces = Math.max(0, spaces);
		return tasks.length + spaces;
	}

	public static void main(String[] args) {
		
//		char[] c = {'A','A','A','B','B','B'};
		char[] c = {'A','A','A','A','A','A','B','C','D','E','F','G'};
		int n = 2;
		leastInterval(c,n);

	}

}
