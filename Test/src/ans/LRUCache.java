package ans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

abstract class LRUCacheNode {
	
	
}

public class LRUCache extends LRUCacheNode{
	
//     ArrayList<Integer> list = null;
	LinkedList<Integer> list = null;
     HashMap<Integer,Integer> map = null;
    int max = 0;
    
    public  LRUCache(int capacity) {
//        list = new ArrayList<>(capacity);
    	list = new LinkedList<>();
        map = new HashMap<>();
        max = capacity;
    }
    
    public  int get(int key) {
        
        if (map.containsKey(key)) {
//            list.remove(new Integer(key));
        	remove(key);
            list.add(key);
            System.out.println(map.get(key));
            return map.get(key);
	    }
        System.out.println(-1);
	    return -1;
    }
    
    public void put(int key, int value) {
        
        if (!map.containsKey(key) && list.size() == max) {
            int temp = list.get(0);
            list.remove(0);
            map.remove(temp);
	    }
        
//        if (map.containsKey(key)) {
//		    list.remove(new Integer(key));
//	    } 
        
        if (map.containsKey(key)) {
        	list.remove(new Integer(key));
        	map.put(key,value);
        	list.add(key);
        } else {
        	 list.add(key);
     	    map.put(key,value);
        }
        
       
	    System.out.println("null");
    }
    
    public void remove(int key) {
    	LinkedList<Integer> node = list;
    	Iterator<Integer> itr = node.iterator();
    	while (itr.hasNext()) {
    		if (itr.next() == key ) {
//    			itr = itr.next().next();
    		}
    	}
    	
    }
	
    public static void main(String[] a) {
    	
    	LRUCache o = new LRUCache(2);
//    	o.get(2);
//    	o.put(2, 6);
//    	o.get(1);
//    	o.put(1, 5);
//    	o.put(1, 2);
//    	o.get(1);
//    	o.get(2);
    	o.put(1, 1);
    	o.put(2, 2);
    	o.get(1);
    	o.put(3, 3);
    	o.get(2);
    	o.put(4, 4);
    	o.get(1);
    	o.get(3);
    	o.get(4);
    }
}
