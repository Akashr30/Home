package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.security.auth.callback.PasswordCallback;

/*
class Interval {
	int start , end;
	  Interval(int a , int b) {
		this.start = a;
		this.end = b;
	}	
}

public class MergeIntervals {
	
	public static void mergeIntervals(Interval[] inter) {
		
		Arrays.sort(inter , new Comparator<Interval>() {
			public int compare (Interval i1 , Interval i2) {
				return i1.start - i2.start;
			}
		});
	}
	
	
	public static void main(String[] ar) {
		
//		int[][] arr = {{1,2},{9,6}, {4,5}, {3,8}};
		
//		Arrays.sort(arr , (arr1 , arr2) -> Integer.compare(arr1[0], arr2[0]) );
		
		Interval[] inter = new Interval[4];
		inter[0] = new Interval(1,2);
		inter[1] = new Interval(2,8);
		inter[2] = new Interval(8,9);
		inter[3] = new Interval(6,7);
		mergeIntervals(inter);
	}

	

}
*/

class Intervals {
	
	int num1 ;
	int num2 ;
	
	Intervals (int n1 , int n2) {
			num1 = n1;
			num2 = n2;
		}
	
}


class MergeIntervals {
	
	public static void main(String[] ar) {
		
		ArrayList<Intervals> al = new ArrayList<>();
		al.add(new Intervals(1,3));
		al.add(new Intervals(8,10));
		al.add(new Intervals(2,6));
		al.add(new Intervals(15,18));
		
		Collections.sort(al, new Comparator<Intervals>() {

			@Override
			public int compare(Intervals o1, Intervals o2) {
				
				return o1.num1 - o2.num1;
			}
			
		});
		
		for (Intervals i : al) {
			System.out.println(i.num1+"..."+i.num2);
		}
		
//		int[][] finl = new int[al.size()][al.size()];
		ArrayList<Intervals> finl = new ArrayList<>();
		finl.add(new Intervals(al.get(0).num1, al.get(0).num2));
		
		int index = 0;
		for (int i = 1 ; i < al.size() ; i++) {
			
			if ( finl.get(index).num2 >= al.get(i).num1 ) {
				int max = Math.max(al.get(index).num2, al.get(i).num2);
				int min = Math.min(al.get(index).num1, al.get(i).num1);
				finl.add(new Intervals(min,max));
//				al.remove(i);
				index++;
			} else {
				finl.add( new Intervals (al.get(i).num1,al.get(i).num2));
				index++;
			}
			
		}
		
		for (Intervals ir : finl)
			System.out.println("["+ir.num1+","+ir.num2+"]");
		
	}
}



