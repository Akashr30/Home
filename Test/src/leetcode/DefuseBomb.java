package leetcode;

public class DefuseBomb {
	
    public static int[] decrypt(int[] code, int k) {
        
        if (k == 0)
            return new int[code.length];
        
        int[] arr = new int[code.length];
        int sum = 0;
        int c = 0;
        int len = code.length;
        if (k > 0) {
        	c=k;
            while (c > 0) {
                sum += code[c%len];
                c--;
            }
            arr[0] = sum;
            for (int i = 1 ; i < len ; i++) {
                sum = sum - code[i]+code[(i+k)%len];
                arr[i] = sum;
            }
        } else {
             c = len - k*-1;
            // [0,-1,0,6]
            while (c < len) {
                sum += code[c%len];
                c++;
            }
            arr[0] = sum;
            int x = 0;
            for (int i = 1 ; i < len ; i++) {
                sum = sum+code[i-1] - code[(len-k*-1+x++)%len];
                arr[i] = sum;
            }
        }
        
        return arr;
    }

	public static void main(String[] args) {
		
		int[] arr = {2,4,9,3};
		int k = -2;
		decrypt(arr,k);

	}

}
