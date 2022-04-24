package testOne;

public class MinCountsForPalindrome {
	public static void main(String[]ar) {
		String A = "banana";
		char[] ch = A.toCharArray();
        String pldrm = A;
        String rev = "";
        for (int i = ch.length-1 ; i >=0  ; i--) {
            rev += ch[i];
        }

        int count = 0;
        char[] revCh = rev.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int j = 0 ; j < ch.length ; j++) {
            
            if (ch[j] != revCh[j]) {
                String temp = A.substring(j,ch.length);
                String temp2 = A.substring(0,j);
                // String init = ch[j]+revCh[j];
//                sb.append(ch[j]).append(revCh[j]);
                // String ch = init+temp;
                sb.append(temp2).append(revCh[j]).append(temp);
                pldrm = sb.toString();
                // j++;
                count++;
            }
            if (pldrm.equalsIgnoreCase(sb.reverse().toString())) {
                break;
            }
            sb.setLength(0);
        }
        System.out.println(count);
        
	}

}
