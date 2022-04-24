package maps;

import java.util.*;
import java.util.Map.Entry;


/*class SubClass {
    
    int num;
    int count=0;
    
    public SubClass(int x , int y) {
        num = x;
        count = y;
    }
}*/

public class SortBasedOnFrequency {
	
	static class SubClass {
	    
	    int num;
	    int count=0;
	    
	    public SubClass(int x , int y) {
	        num = x;
	        count = y;
	    }
	}

	public static void main (String[] args)
	 {
	     Scanner  sc = new Scanner(System.in);
         int test = Integer.parseInt(sc.nextLine());
	    
	     while (test > 0) {
	         
	         int len = Integer.parseInt(sc.nextLine());
	         String str = sc.nextLine();
	         int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	         
	         for (int i = 0 ; i < arr.length ; i++) {
	             if (!map.containsKey(arr[i])) {
	                 map.put(arr[i],1);
	             } else {
	                 int count = map.get(arr[i]);
	                 map.remove(arr[i]);
	                 map.put(arr[i],count+1);
	             }
	         }
	         
	         SubClass[] sb = new SubClass[map.size()];
	         
	         Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
	       //  ArrayList<SubClass> = new 
	       int j = 0;
	         while (itr.hasNext()) {
	             Entry<Integer, Integer> entry = itr.next();
	             sb[j] = new SubClass(entry.getKey(),entry.getValue());
	             j++;
	         }
 	         
	         Arrays.sort(sb, new Comparator<SubClass>() {
	             
	        	 @Override
	             public int compare (SubClass s1 , SubClass s2) {
	                 
	                 if (s1.count > s2.count) {
//	                     return  -Integer.compare(s1.count, s2.count);
	                     return -s1.count -(s2.count);
	                 } /*else if (s1.count == s2.count){
	                     return Integer.compare(s1.num,s2.num);
	                 }*/ else {
//	                	 return Integer.compare(s1.num,s2.num);
	                	 return s1.num-(s2.num);
	                 }
	             }
	         });
	       /*  StringBuffer sbf = new StringBuffer();
	        for (int x = 0 ; x < sb.length ; x++) {
	            for (int y = 0 ; y < sb[x].count ; y++) {
	                sbf.append(sb[x].num).append(" ");
	            } 
	        }*/
	         for (int i = 0 ; i < sb.length ; i++)
				 System.out.println(sb[i].num+"....."+sb[i].count);
	            
//	            System.out.println(sbf.toString());
	         
	         test--;
	     }
	 }


}
/*
37
1 3 7 7 7 3 2 2 2 7 3 1 7 1 6 3 5 5 4 5 6 2 1 2 4 7 3 1 3 5 4 1 7 2 6 1 2

1 1 1 1 1 1 1 2 2 2 2 2 2 2 7 7 7 7 7 7 7 3 3 3 3 3 3 5 5 5 5 4 4 4 6 6 6
*/
 