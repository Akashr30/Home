package testOne;

/*public class LeaderArray {

	public static void main(String[] args) {
//		int[] arr = {16,17,4,3,5,2};
		int[] arr = {1,2,3,4,18,5,7};
		int max  = 0;
		for (int i = 0 ; i <arr.length-1;) {
			for (int j = i+1 ; j < arr.length-1;j++) {
				if (arr[i] < arr[j]) {
					max = arr[j];
					i = j+1;
				}
				
			}
			System.out.print(max);
			max =0;
		}
		System.out.print(arr[arr.length-1]);
	}

}
*/


class LeaderArray  
{ 
    /*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    } 
  
    /* Driver program to test above functions */
    public static void main(String[] args)  
    { 
        LeaderArray lead = new LeaderArray(); 
        int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
        int n = arr.length; 
        lead.printLeaders(arr, n); 
    } 
} 




/*
class LeadersInArray  
{ 
    Java Function to print leaders in an array 
    void printLeaders(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    } 
  
     Driver program to test above functions 
    public static void main(String[] args)  
    { 
        LeadersInArray lead = new LeadersInArray(); 
        int arr[] = new int[]{1,2,3,4,18,5,7}; 
        int n = arr.length; 
        lead.printLeaders(arr, n); 
    } 
} */