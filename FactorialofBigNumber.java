package helloWorld;

import java.math.BigInteger;

public class FactorialOfNumber {
	static int n=30;
	public static void main(String[] args) {
		 BigInteger fact=BigInteger.valueOf(1);
	        for(int i=1;i<=n;i++){
	            fact=fact.multiply(BigInteger.valueOf(i));
	        }
	        System.out.println(fact);
	}
}
