package testOne;

import java.util.ArrayList;

public class AlmostEqual {
	
	public static void main(String[] arg) {

		/*String ransomNote = "aa";
		String magazine = "ab";
        
        String[] ch1 = ransomNote.split("");
        String[] ch2 = magazine.split("");
        ArrayList<String> ar = new ArrayList<>();
        
        for (String x : ch2)
            ar.add(x);
        
        boolean flag = true;
        
        for (int i = 0 ; i < ch1.length ; i++) {
            if (ar.size() > 0 && ar.contains(ch1[i])) {
                ar.remove(ch1[i]);
                continue;
            } else {
                flag = false;
                break;
            } 
        }
           
        System.out.println(flag);*/
		

        int num = 11;
        if (num == 1) {
        	 System.out.println(0);
        	 
        } else {
        int q = 0;
        int r = 0;
        StringBuffer sb = new StringBuffer();
        while (num >= 1) {
            
             q = num / 2;
             r = num % 2;
            
            if (q == 1) {
            	sb.append(r);
                sb.append(q);
                break;
            }
            sb.append(r);
            
            num = q;
            
        }
        
        String s = sb.reverse().toString();
        String[] str = s.split("");
        sb.setLength(0);
        
        for (int i = 0 ; i < str.length ; i++) {
            if (str[i].equals("1")) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        System.out.println(Integer.parseInt(sb.toString(),2));
//        return Integer.parseInt(sb.toString(),2);
        }
	}

}
