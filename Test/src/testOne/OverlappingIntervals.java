package testOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Elements {
    
    int start ;
    int end;
    
    Elements(int a , int b) {
        start = a;
        end = b;
    }
}

public class OverlappingIntervals {
	

	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    
	    int test = Integer.parseInt(sc.nextLine());
	    while (test > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        String[] arr = str.split(" ");
	        ArrayList<Elements> al = new ArrayList<>();
	        for (int i = 0 ; i < arr.length ; i=i+2) {
	            al.add(new Elements(Integer.parseInt(arr[i]),Integer.parseInt(arr[i+1])));
	        }
	        
	        Collections.sort(al, new Comparator<Elements>(){
		           
		           public int compare (Elements e1 , Elements e2) {
		               return e1.start-e2.start;
		           }
		            
		        });
	        ArrayList<Elements> al1 = new ArrayList<>();
	        al1.add(al.get(0));
	        int al1Idx = 0;
            for (int i = 1 ; i < al.size(); i++) {
                
                if (al1.get(al1Idx).end >= al.get(i).start && al1.get(al1Idx).end <= al.get(i).end) {
                    Elements temp = al1.get(al1Idx);
                    al1.remove(al1Idx);
                    Elements el = new Elements(temp.start,al.get(i).end);
                    al1.add(al1Idx,el);
                } else if (al1.get(al1Idx).end > al.get(i).start && al1.get(al1Idx).end > al.get(i).start){
                    continue;
                } else if (al1.get(al1Idx).end < al.get(i).start) {
                    al1.add(al.get(i));
                    al1Idx++;
                }
                            
            }
            StringBuffer sb = new StringBuffer();
            
            for (int i = 0 ; i < al1.size() ; i++) {
                sb.append(al1.get(i).start).append(" ").append(al1.get(i).end).append(" ");
            }
            
            System.out.println(sb.toString());
	        test--;
	    }
	    
	 }


}
