package in.ibm.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class CoreJava5 {

		public static void main(String[] args) {
			String s= "21";
			Integer i= Integer.parseInt(s);
			System.out.println(i);
			Function<String,Integer> adder = Integer::parseInt;
			System.out.println(adder.apply(s));
			HashMap map = new HashMap();
//			map.entrySet().stream()
			Arrays.parallelSort(args);

	}

}
