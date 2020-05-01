package zohoInterviewQstns;

public class KPanagrams {/*
	

    
    public static boolean kPanagrams(String s , int changes) {
        
        if (changes == 26){
            return true;
        } 
        String str = s.toLowerCase().replaceAll(" ","");
        char[] ch = str.toCharArray();
        int[] abc = new int[26];
        boolean flag = false;
        for (int i = 0 ; i < ch.length ; i++) {
            int temp = ch[i] - 'a';
            abc[temp]++;
        }
        int counts = 0;
        for (int i = 0 ; i < 26 ; i++) {
            
            if (abc[i] == 0) {
                abc[i]++;
                counts++;
            }
            
            if (counts == changes) 
                break;
            
        }
        
        int x = 0;
        
        for (x = 0 ; x < 26 ; x++) {
            if (abc[x] == 0) {
                break;
            }
        }
       
       if (x == 26)
           flag = true;
        
        return flag;
        
    }
     
     
	public static void main (String[] args)
	 {
//        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
        
//        while (test > 0) {
            
//            String str = "qwqqwqeqqwdsdadsdasadsfsdsdsdasasas";
            String str = "qwdfsdsdg";
            int changes =  12132131;
            if (kPanagrams(str,changes))
                System.out.println("1");
            else 
                System.out.println("0");
//            test--;
//        }
	 }


*/

	
	 

		// Function to find if string can be converted 
		// to Pangram by atmost k modifications 
		static boolean isPangram(String S, int k) 
		{ 
			if (S.length() < 26) 
				return false; 

			// visit array to keep track of all 
			// the characters present in the array 
			boolean[] visited = new boolean[26]; 

			for (int i = 0; i < S.length(); i++) { 
				visited[S.charAt(i) - 'a'] = true; 
			} 

			// A variable to keep count of 
			// characters missing in the string 
			int count = 0; 

			for (int i = 0; i < 26; i++) { 
				if (!visited[i]) 
					count++; 
			} 
			
			// Comparison of count with given value K 
			if (count <= k) 
				return true; 
			return false; 
		} 
		
		// Driver code 
		public static void main(String[] args) 
		{ 
			String S = "qwdfsdsdg"; 
			
			int k = 12132131; 
			
			System.out.print(isPangram(S, k)); 
		} 


}
