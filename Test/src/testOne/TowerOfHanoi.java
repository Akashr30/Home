package testOne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TowerOfHanoi {
	static void m1 () {
		
	}

	static void fun() //throws Exception//ArithmeticException 
    { 
		m1();
        System.out.println(5/0); 
//        throw new IllegalAccessException("demo"); 
        System.out.println("Hello");
    } 
    public static void main(String args[])//throws Error, Exception 
    { 
        try
        { 
            fun(); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println(e.getMessage()+": caught in main."); 
        } catch(UnsupportedOperationException e) {
        	System.out.println(e.getMessage()+": caught in main.64");
        } catch (Error e) {
        	System.out.println(e.getMessage()+": sdrgdcaught in main.64");
        }
    } 
}
