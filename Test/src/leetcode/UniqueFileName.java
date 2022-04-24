package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueFileName {
	
	 public static String[] getFolderNames(String[] names) {
	        
	        String[] ans = new String[names.length];
	        Map<String, Integer> map = new HashMap<>();
	        
	        for(int i=0; i<names.length; i++){
	            String key = names[i];
	            if(!map.containsKey(key)){
	                map.put(key, 0);
	                ans[i] = key;
	            }
	            else{
	                Integer num = map.get(key) + 1;
	                while(map.containsKey(key + "(" + num + ")"))
	                    num++;
	                map.put(key, num);
	                key = key + "(" + num + ")";
	                map.put(key, 0);
	                ans[i] = key;
	            }
	        }
	        
	        return ans;
	    }
	/*public static String[] getFolderNames(String[] names) {
        int n = names.length;
        Map<String, Integer> map = new HashMap<>();
        Set<String> all = new HashSet<>();
        String[] ret = new String[n];
        for(int i = 0;i < n;i++){
        	if(all.add(names[i])){
        		ret[i] = names[i];
        	}else{
        		int g = map.getOrDefault(names[i], 0);
        		while(true){
	        		g++;
	        		String nm = names[i] + "(" + g + ")";
	        		if(all.add(nm)){
	        			ret[i] = nm;
	        			map.put(names[i], g);
	        			break;
	        		}
        		}
        	}
        }
        return ret;
    }*/
	 
	 public static void main(String[] ar) {
		 
//		 String[] str = {"kaido","kaido(1)","kaido","kaido(1)"};
		 String[] str = {"gta","gta(1)","gta","avalon","gta","gta"}; 
		 String[] arr = getFolderNames(str);
		 System.out.println();
	 }

}
