package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sorter implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

        String a1[] = o1.split("[.]"); 
        String a2[] = o2.split("[.]"); 

        int result = -1; 
        for (int i = 0; i < 4 && result != 0; i++) 
        { 
            result = a1[i].compareTo(a2[i]); 
        } 
        return result; 
    }
	
}

public class ValidIPAddress {
	
	public static boolean check(Long l1 , String s1) {
		
		if (l1 < 10 && s1.length() > 1) {
			return true;
		} else if (l1 < 100 && s1.length() > 2){
			return true;
		} else if (l1 < 256 && s1.length() > 3) {
			return true;
		}
		
		
		return false;
	}
	
	public static void main (String[] ar) {
		
//		String ip = "1121121121";
//		String ip = "511212121";
		String ip = "1212121";
		int x = 3;
		ArrayList<String> al = new ArrayList<String>();
		int i = 0 ,j = 0 , k = 0 , l = 0;
		
		for ( i = 1 ; i <= x && i <= ip.length();i++ ) {
			String a = ip.substring(0 , i);
			
			if (check(Long.parseLong(a),a)) 
				continue;
			
			if (Long.parseLong(a) >= 256)
				continue;
			
			for (j = i+1 ; j <= x+i && j <= ip.length() ; j++) {
				String b = ip.substring(i,j);
				
				if (check(Long.parseLong(b),b))
					continue;
				
				if (Long.parseLong(b) >= 256 )
					continue;
				
				for (k = j+1 ; k <= x+j && k <= ip.length() ; k++) {
					String c = ip.substring(j, k);
					
					if (check(Long.parseLong(c),c))
						continue;
					
					if (Long.parseLong(c) >= 256)
						continue;
					
					for (l = k+1 ; l <= ip.length() ; l++) {
						
						if (l  >= ip.length()) {
						String d = ip.substring(k, l);
						
						if (check(Long.parseLong(d),d))
							continue;
						
						if (Long.parseLong(d) < 256) {
							String s = a+"."+b+"."+c+"."+d;
							al.add(s);
						}
						}
					}
				}
			}
		}

		Collections.sort(al , new sorter());
		
		if (al.size() > 0)
		for (String y :al) {
			System.out.println(y);
		}
		else 
			System.out.println("not a  valid Ip");
		
	}

}
