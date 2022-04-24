package leetcodeWeeklyContestDiscussion;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpaces {

    public static String reorderSpaces(String s) {
        
        List<String> res = new ArrayList<>();
        
         int count = 0;
         StringBuilder sb = new StringBuilder();
         for (int i = 0 ; i <= s.length() ; i++) {
             
             if (i == s.length()) {
                 if (sb.toString().length() > 0) {
                     res.add(sb.toString());
                 }
                 break;
             }
             
             if (s.charAt(i) == ' ') {
                 count++;
                 if (sb.toString().length() > 0) {
                     res.add(sb.toString());
                     sb.setLength(0);
                 }
             } else {
                 sb.append(s.charAt(i));
             }
         }
         sb.setLength(0);
         
         if (count == 0 || res.size() == 1)
        	 return res.get(0);
        
         int num = (count)/(res.size()-1);
         int balnc = (count)%(res.size()-1);
         int c = num;
         int d = res.size()-1;
         for (String i : res) {
             sb.append(i);
             while (c-- > 0 && d > 0) {
                 sb.append(" ");
             }
             c = num;
             d--;
         }
         
         while (balnc-- > 0) {
             sb.append(" ");
         }
         
         return sb.toString();
     }
	public static void main(String[] args) {

//		String s = "  this   is  a sentence " ;
//		String s = " practice   makes   perfect";
//		String s = "  walks  udp package   into  bar a";
		String s = "  hello";
		reorderSpaces(s);
		
	}

}
