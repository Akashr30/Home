package priorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PriorityQueue1{

	public static void main(String[] args) {
		
//		PriorityQueue<String> pq = new PriorityQueue<>(3,(a,b) -> -(a.length()-b.length()));
//		PriorityQueue<String> pq = new PriorityQueue<>();
		PriorityQueue<String> pq = new PriorityQueue<>(new ArrayList<>());
		pq.add("medium");
		pq.add("short");
		pq.add("mid");
		pq.add("Verryyy large");
//		pq.add("a");
		pq.add("vb");
		pq.add("dfds");
		pq.add("msdfid");
		pq.add("sdfgdzfg");
		
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
