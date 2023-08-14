package in.ibm.test;

import java.util.TreeSet;

public class CoreJava4 implements Comparable {
	public String name;

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String toString() {
		return "Base { name: " + name + "}";
	}

	public static class Main {
		public static void main(String[] args) {
			CoreJava4 b = new CoreJava4();
			CoreJava4 b1 = new CoreJava4();
			b.name = "Coffee";
			b1.name = "Tea";
			TreeSet<CoreJava4> set = new TreeSet<CoreJava4>();
			set.add(b);
			set.add(b1);
			set.stream().forEach(e -> System.out.print(e));
		}

	}

}
