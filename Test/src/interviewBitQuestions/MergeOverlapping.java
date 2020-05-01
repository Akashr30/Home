package interviewBitQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// * Definition for an interval.
  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
 
public class MergeOverlapping {
	
	public static void main (String[] ar) {
		
		
//    public ArrayList<Interval> merge(ArrayList<Interval> arr) {
		ArrayList<Interval> arr = new ArrayList<Interval> ();
		/*arr.add(new Interval(1,10));
		arr.add(new Interval(2,9));
		arr.add(new Interval(3,8));
		arr.add(new Interval(4,7));
		arr.add(new Interval(5,6));
		arr.add(new Interval(6,6));*/
		arr.add(new Interval(1,3));
		arr.add(new Interval(2,6));
		arr.add(new Interval(8,10));
		arr.add(new Interval(15,18));
		
        Collections.sort(arr ,new Comparator<Interval>(){
            
            public int compare (Interval i1, Interval i2) {
                return (i1.start)-i2.start;
            }
        });
        
        ArrayList<Interval> modified = new ArrayList<>();
        
        /*if (arr.size() == 2) {
            if (arr.get(0).end > arr.get(1).start && arr.get(0).end > arr.get(1).end) {
                arr.add(arr.get(0));
//                return modified;
            } else if (arr.get(0).end > arr.get(1).start && arr.get(0).end < arr.get(1).end) {
                modified.add(new Interval(arr.get(0).start,arr.get(1).end));
//                return modified;
            }
        } else  if (arr.size() >= 2) {
            if (arr.get(0).end > arr.get(1).start && arr.get(0).end > arr.get(1).end) {
                arr.add(0,arr.get(0));
                arr.remove(1);
            } else if (arr.get(0).end > arr.get(1).start && arr.get(0).end < arr.get(1).end) {
                modified.add(new Interval(arr.get(0).start,arr.get(1).end));
                arr.remove(1);
            } else {
                modified.add(arr.get(0));
            }
        }*/
        
       /* for (int i = 0 ; i < arr.size();i++) {
            
            Interval temp1 = arr.get(i); 
            
            for (int j = 1 ; j < arr.size() ; j++) {
                
            if (arr.get(i).end > arr.get(j).start && arr.get(i).end > arr.get(j).end) {
                arr.remove(j);
            } else if (arr.get(i).end > arr.get(j).start && arr.get(i).end < arr.get(j).end) {
                modified.add(new Interval(arr.get(0).start,arr.get(1).end));
                arr.remove(j);
            } else {
                modified.add(arr.get(j));
            }
        
            }
            
            
            
        }*/
//    return modified;
        boolean flag = true;
        modified.add(arr.get(0));
        int add = 1; 
        while (add < arr.size()) {
        	
        	if (modified.get(modified.size()-1).end > arr.get(add).start && modified.get(modified.size()-1).end > arr.get(add).end ) {
        		add++;
        	} else if (modified.get(modified.size()-1).end > arr.get(add).start && modified.get(modified.size()-1).end < arr.get(add).end ) {
        		Interval temp = modified.get(modified.size()-1);
        		Interval temp2 = arr.get(add);
        		modified.remove(modified.size()-1);
        		modified.add(new Interval(temp.start,temp2.end));
        		add++;
        	} else {
        		modified.add(new Interval(arr.get(add).start,arr.get(add).end));
        		add++;
        	}
        }
        
        for (Interval z : modified) 
        	System.out.println(z.start+"......"+z.end);
        
//    }
	}
}
