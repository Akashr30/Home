package leetcodeWeeklyContestDiscussion;

public class AntFallOfPlank {
	
	public static  int getLastMoment(int n, int[] left, int[] right) {
        
        
        // Arrays.sort(left);
        // Arrays.sort(right);
        
        int ans = 0;
        for (int x : left)
            ans = Math.max(x-n,ans);
        
        for (int y : right)
            ans = Math.max(ans,n);
        
        return ans;
    }
	
	public static void main(String[] ar) {
		
		int n = 20;
		int[] l = {4,7,15};
		int[] r = {9,3,13,10};
//		int[] r = {};
		System.out.println(getLastMoment(n,l,r));
	}
}
