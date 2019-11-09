package testOne;

public class Diamond {

	public static void main(String[] args) {
		/*int i =0,j=0,k=0;
		for (i = 1 ; i < 5 ; i++) {
			for (j = 0; j<i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}*/
		/*String[] queries = {"abc","ab","xyz","ghj"};
		String[] strings = {"abc","abc","jsis","abc","xyz","aba","ghj","sef"};
		
		int[] res = new int[queries.length];
        int count = 0;
        for (int i = 0 ; i < queries.length ; i++){     //abc,bc,cv,df,bc,df
            count = 0;
            for (int j = 0 ; j < strings.length;j++){   //abc,bc,bc
                if (queries[i].equals(strings[j])){
                    count += 1;
                }
            }
            res[i] = count;
        }*/
		int m = 1;
		/*for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < i*2; j++ ) {
				
				if (j < i*2) {
					for ( int k = 0 ; k < 5/2-j ; k++) {
						System.out.print(" ");
					}
				}
				System.out.print(j+1);
				
				
				if (j == i*2)
				System.out.print(j);
			}
		}*/
		int n = 11;
		int z = 0;
		int j = 0;
		for (int i = 0 ; i < (n*2) ; i++) {
			boolean isSpace = true;
			
			System.out.println("");
			if (i<n) {
			for ( j = 0 ; j < (2*i)+1 ; j++) {
				
				if (isSpace) {
					for ( int k = 0 ; k < n-i-1; k++) {
						System.out.print(" ");
					}
					isSpace = false;
				}
				System.out.print("*");
//				System.out.print(m);
				m++;
			}
		} else {
			
			z++;
//			for (int x = 0 ; x < (n+1)-(2*(z-1)) ;x++) {
			for (int x = 0 ; x < j-(2*z)  ;x++) {	
				if (isSpace) {
					for (int y = 0 ; y < i-n+1 ; y++) {
						System.out.print(" ");
					}
					isSpace = false;
				}
				System.out.print("*");
//				System.out.print(m);
				m++;
				
				
			}
			
		}
		}

	}

}
