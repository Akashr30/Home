package testOne;

import java.util.ArrayList;
//import java.util.List;

public class StockPrice {

	/*public static void main (String[] args) 
	{
        int a[] = {40,10,5,60,70,20,40,20,40,50}; 
		int len = a.length-1;
		ArrayList<Integer> lowStocks = new ArrayList<Integer>();
		int i = 0;
		int ls = 0;
		while ( i < len ) {
		    if ( a[i] > a[i+1]) {
		        lowStocks.add (i+1);
		    } 
		    i++;
		}
		lowStocks.add(null);
		
		for (int x = 0 ; x < lowStocks.size()-1;x++) {
			
			if (lowStocks.get(x+1) == null) {
				System.out.println("buy at : "+lowStocks.get(x));
	    		 System.out.println("Sell at : "+(len));
	    		 break;
	    	 }
		    if ( (lowStocks.get(x+1)- lowStocks.get(x)) <= 1){
		        continue; 
		    } else {
		    	System.out.println("buy at : "+lowStocks.get(x));
		        System.out.println("Sell at : "+(lowStocks.get(x+1)-1));
//		        System.out.print("sell at :"+lowStocks.get(x+1) != null ?lowStocks.get(x+1):lowStocks.get(len) );
//		        if ()
		    }
		}
	}
*/
	
/*	static class Interval { 
	    int buy, sell; 
	} 
	  
	
	    // This function finds the buy sell schedule for maximum profit 
	    static void stockBuySell(int price[], int n) 
	    { 
	        // Prices must be given for at least two days 
	        if (n == 1) 
	            return; 
	  
	        int count = 0; 
	  
	        // solution array 
	        ArrayList<Interval> sol = new ArrayList<Interval>(); 
	  
	        // Traverse through given price array 
	        int i = 0; 
	        while (i < n - 1) { 
	            // Find Local Minima. Note that the limit is (n-2) as we are 
	            // comparing present element to the next element. 
	            while ((i < n - 1) && (price[i + 1] <= price[i])) 
	                i++; 
	  
	            // If we reached the end, break as no further solution possible 
	            if (i == n - 1) 
	                break; 
	  
	            Interval e = new Interval(); 
	            e.buy = i++; 
	            // Store the index of minima 
	  
	            // Find Local Maxima.  Note that the limit is (n-1) as we are 
	            // comparing to previous element 
	            while ((i < n) && (price[i] >= price[i - 1])) 
	                i++; 
	  
	            // Store the index of maxima 
	            e.sell = i - 1; 
	            sol.add(e); 
	  
	            // Increment number of buy/sell 
	            count++; 
	        } 
	  
	        // print solution 
	        if (count == 0) 
	            System.out.println("There is no day when buying the stock "
	                               + "will make profit"); 
	        else
	            for (int j = 0; j < count; j++) 
	                System.out.println("Buy on day: " + sol.get(j).buy 
	                                   + "        "
	                                   + "Sell on day : " + sol.get(j).sell); 
	  
	        return; 
	    } 
	  
	    public static void main(String args[]) 
	    { 
//	        StockBuySell stock = new StockBuySell(); 
	  
	        // stock prices on consecutive days 
//	        int price[] = { 100, 180, 260, 310, 40, 535, 695 }; 
	    	 int price[] = {40,10,5,60,70,20,40,20,40,50}; 
	        int n = price.length; 
	  
	        // fucntion call 
	        stockBuySell(price, n); 
	    } 
	
	  */
}
