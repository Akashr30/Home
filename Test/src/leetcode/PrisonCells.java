package leetcode;

public class PrisonCells {
	
	public static int[] countDays(int[] cells ,int N) {
		
		   int[] arr = new int[cells.length];
		   int[] temp = new int[cells.length];
	        for (int i = 0 ; i < cells.length ; i++) {
	            if (i-1 >= 0 && i+1 < cells.length && cells[i-1] == cells[i+1]) {
	                arr[i] = 1;
	            } else {
	                arr[i] = 0;
	            }
	        }
	        
	        
	        
	        int num = N%14;
	        if (num == 1)
	            return arr;
	        else if (num == 0)
	            num = 14;
	        
	        for (int i = 2 ; i <= num ; i++) {
	            
	            for (int j = 1 ; j < arr.length-1 ; j++) {
	                if (arr[j-1] == arr[j+1]) {
	                	temp[j] = 1;
	                } else {
	                	temp[j] = 0;
	                }
	                
	            }
	            
	            arr = temp.clone();
	        }
	        
	        return arr;
	}
	
	public static void main(String[] atg) {
		
		int cells[] = {0,1,0,1,1,0,0,1};
		int N = 7;
		System.out.print(countDays(cells,N));
	}
}
