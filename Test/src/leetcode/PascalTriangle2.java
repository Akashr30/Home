package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PascalTriangle2 {
	
	public static List<Integer> getRow(int row) {
	        
	        List<Integer> list = new ArrayList<>();
	        if (row == 0) {
	            list.add(1);
	            return list;
	        }
	        
	        Queue<Integer> q = new LinkedList<>();
	        q.add(1);
	        q.add(1);
	        
	        while (!q.isEmpty() && --row > 0) {
	            
	            int size = q.size();
	            int prev = 0;
	            for (int i = 0 ; i <= size ; i++) {
	                
	                if (i == 0) {
	                    int num = q.poll();
	                    prev = num;
	                    q.add(num);
	                    continue;
	                }
	                
	                if (i == size) {
	                    q.add(1);
	                    continue;
	                }
	                
	                int num = q.poll();
	                q.add(num+prev);
	                prev = num;
	            }
	        }
	        
	        while (!q.isEmpty())
	            list.add(q.poll());
	        
	        return list;
	    }

	public static void main(String[] args) {
		
		int n = 33;
		System.out.println(getRow(n));

	}

}
