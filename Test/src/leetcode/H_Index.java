package leetcode;

public class H_Index {
	
	 public static int hIndex(int[] citations) {
	
		
		 int idx = 0, n = citations.length;
		    for(int c : citations) {
		      if (c >= n - idx) {
//		    	  return n - idx;
		    	  System.out.println(n-idx);
		      }
//		      else
		      idx++;
		    }
		    return 0;
	 }
	
	public static void main(String[] ar) {
		
		int[] citations = {0,1,2,3,4,5,6};
		System.out.println(hIndex(citations));
		
	}

}
