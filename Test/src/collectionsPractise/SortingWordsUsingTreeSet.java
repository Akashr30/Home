package collectionsPractise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class SortingWordsUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("a");		// To print in order with mixed cases
		ts.add("RSTUV");
		ts.add("abcde");
		ts.add("A");
		ts.add("WXYZ");
		ts.add("AA");
		ts.add("aa");
		ts.add("wxyz");
		ts.add("aa");
		ts.add("rstuv");
		ts.add("ABCDE");
		ts.add("aa");
		
		System.out.println(ts);
		
		

	}

}
