package zohoInterviewQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortBasedOnFrequencies {
	
	static class subClass {
		int key , value = 0;
		public subClass(int i , int j) {
			key = i;
			value = j;
		}
		/*public int compareTo(subClass m2) {
			// TODO Auto-generated method stub
			return 0;
		}*/
	}
	
	public static void main (String[] args) {
//		 int arr[] = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1,8,8,8, 6, 7, 5,-1,-1};
		 int arr[] = {1,3,7, 7 ,7 ,3, 2, 2 ,2, 7, 3,1, 7, 1, 6, 3 ,5 ,5, 4 ,5, 6 ,2 ,1, 2, 4 ,7, 3, 1, 3, 5 ,4 ,1, 7, 2, 6, 1,2};
//		 int arr[] = {2,3,5,6,4,7,8,9,1};
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
		 for (int i = 0 ; i < arr.length ; i++) {
			 if (!map.containsKey(arr[i])) {
				 map.put(arr[i], 1);
			 } else {
				 int temp = map.get(arr[i]);
				 map.remove(arr[i]);
				 map.put(arr[i], temp+1);
			 }
		 }
		 
//		 ArrayList<subClass> al = new ArrayList<>();
		 subClass[] arr1 = new subClass[map.size()];
		 Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		 int j = 0;
		 while (itr.hasNext()) {
			 Entry<Integer, Integer> entry = itr.next();
//			 al.add(new subClass(entry.getKey(),entry.getValue()));
			 arr1[j] = new subClass(entry.getKey(),entry.getValue());
			 j++;
		 }
		 
		 // Using arrays for sorting
		 Arrays.sort(arr1, new Comparator<subClass>(){

			@Override
			public int compare(subClass m1, subClass m2) {
				if (m1.value > m2.value) {
					return -m1.value -(m2.value);
				} else {
					return m1.key-(m2.key);
				}
//				return 0;
			}
			 
		 });
		 
		 for (int i = 0 ; i < arr1.length ; i++)
			 System.out.println(arr1[i].key+"....."+arr1[i].value);
		 
		 
		 
		 
		 // Aliter method : Done using HashMap and comparator
		/* Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		 
		 while (itr.hasNext()) {
			 Entry<Integer, Integer> entry = itr.next();
			 System.out.println(entry.getKey()+"........."+entry.getValue());
		 }
		 
		 List<Map.Entry<Integer,Integer>> al = new ArrayList<>(map.entrySet());
//		 al.add((Entry<Integer, Integer>) map);
		 
		 Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> m1, Entry<Integer, Integer> m2) {
				if (m1.getValue() > m2.getValue()) {
					
					return -m1.getValue().compareTo(m2.getValue());
				} else {
					return m1.getKey().compareTo(m2.getKey());
				}
//				return 0;
			}
		 });
		 */
		
	}

}
