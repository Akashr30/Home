package zohoInterviewQstns;

import java.util.Arrays;

public class SmallestGreaterElements {
	

	public static void main (String[] args)
	 {
//        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
        
//        while (test > 0) {
            
//            int len = Integer.parseInt(sc.nextLine());
//            String str = sc.nextLine();
//            int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			String str = "795 792 224 713 278 869 982 698 202 227 234 349 781 181 274 690 628 38 582 508 471 414 748 182 38 706 433 703 77 119 758 648 936 760 704 253 105 717 426 16 869 699 906 116 911 892 741 91 31 489 936 793 282 608 597 597 242 436 544 399 578 136 409 486 0 117 945 5 972 897 43 442 677 626 667 313 402 39 87 777 303 1000 418 667 23 243 885 328 5 843 836 730 831 466 796 294 41 718 918 283"; 
			 int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();	
//			int[] arr = {6 ,3 ,9 ,8 ,10 ,2 ,1, 15, 7};
            int[] clone = arr.clone();
            Arrays.sort(arr);
            StringBuffer sb = new StringBuffer();
            for (int i = 0 ; i < clone.length ; i++) {
                
                int temp = clone[i];
                
                for (int j = 0 ; j < arr.length ; j++) {
                    if (arr[j] == temp) {
                        if (j+1 <= arr.length-1) {
                            sb.append(arr[j+1]).append(" ");
                        } else {
                            sb.append("_").append(" ");
                        }
                    }
                }
                
            }
            
            System.out.println(sb.toString());
            
//            test--;
//        }
	 }


}
