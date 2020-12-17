package com.java8;

class NewThread extends Thread {
	
	public void run() {
		for (int i = 0 ; i < 500 ; i++) {
			System.out.print (i+" dfsdfs ");
		}
	}
}


public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread f = new NewThread();
		f.setDaemon(true); 
		f.start();
		System.out.println("sdf");
	}

}
