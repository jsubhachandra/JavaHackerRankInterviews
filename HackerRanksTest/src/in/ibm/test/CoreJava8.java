package in.ibm.test;

import java.util.stream.IntStream;

public class CoreJava8 {

	public static void main(String[] args) throws Exception {
		IntStream.of(1, 1, 3, 1, 7, 6, 7).distinct().parallel().map(i -> i * 2).sequential().forEach(System.out::print);

	}

}
