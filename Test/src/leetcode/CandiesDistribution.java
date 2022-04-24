package leetcode;

public class CandiesDistribution {
	
	public static int[] distributeCandies(int candies, int num) {
        
        int[] arr = new int[num];
        int i = 0;
        while (candies > 0) {
            if (candies-(i+1) > 0) {
             arr[i%num] += i+1;
             candies = candies-(i+1);
            } else {
                arr[i%num] += candies;
                candies -= candies;
            }
            i++;
        }
       return arr;
    }

	public static void main(String[] args) {
		
		int a = 20;
		int b = 2;
		distributeCandies(a,b);

	}

}
