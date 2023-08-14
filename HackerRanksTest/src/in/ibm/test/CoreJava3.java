package in.ibm.test;

import java.math.BigDecimal;

public class CoreJava3 {
	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal("1");
		sum = sum(sum);
		System.out.println("sum = " + sum);
	}

	private static BigDecimal sum(BigDecimal i) {
		return i.add(BigDecimal.valueOf(4));
	}

	private static void sum(int i) {
		System.out.println("i = " + i);
	}

}
