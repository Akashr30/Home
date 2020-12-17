package leetcode;

public class MountainInArray {
	
	

    private int findDec(int idx,int[] arr) {
           
           int i ;
           for ( i = idx ; i < arr.length-1 ; i++) {
               if (arr[i+1] > arr[i])
                   break;
           }
           return i;
       }
   
    private int findInc(int idx,int[] arr) {
           int i ;
           for ( i = idx ; i < arr.length-1 ; i++) {
               if (arr[i+1] < arr[i])
                   break;
           }
           return i;
       }
   
   
   public int longestMountain(int[] A) {
       
       int window = 0;
        int max = 0;
        boolean flag = true;
       for (int i = 0 ; i < A.length-1 ; i++) {
           if (A[i+1] > A[i]) {
               window = i;
//               max = 1;
               flag = false;
               break;
           }
       }
       
       if (flag)
           return 0;
       
      
       boolean incFlag = false;
       for (int i = window ; i < A.length-1 ; ) {
           
           int endOfInc = 0;
           if (A[i+1] > A[i]) {
                endOfInc = findInc(i,A);
               incFlag = true;
           }
           
           int endOfDec = 0;
           if (endOfInc+1 < A.length && incFlag && A[endOfInc] > A[endOfInc+1]) {
                endOfDec = findDec(endOfInc,A);
           }
           incFlag = false;
           
           if (endOfDec > endOfInc) {
               max = Math.max(max,endOfDec-i);
               i = endOfDec;
           } else {
        	   i++;
           }
           
       }
       return max == 0 ? 0 : max+1;
   }

	public static void main(String[] args) {
		
		int[] arr = {875,884,239,731,723,685};
		new MountainInArray().longestMountain(arr);

	}

}
