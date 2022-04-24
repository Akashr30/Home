package testOne.testOne;

import java.math.BigInteger;

public class BigIntTest {
	
	public static void main(String[] a) {
		
		BigInteger dividend = new BigInteger("248"); 
        BigInteger divisor = new BigInteger("2");
        BigInteger[] answers = new BigInteger[2];
        answers[0] = dividend;
        answers[1] = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
//        answers = dividend.divideAndRemainder(divisor);
//        System.out.println(answers[0].toString()+" ......"+ answers[1].toString());
        while (answers[0].compareTo(one) == 1 && answers[1].compareTo(zero) == 0) {
        	answers = answers[0].divideAndRemainder(divisor);
        }
        
        if (Integer.parseInt(answers[0].toString()) == 1 && Integer.parseInt(answers[1].toString()) == 0) {
        	System.out.println("true");
        } else {
        	System.out.println("false");
        }
	}

}
