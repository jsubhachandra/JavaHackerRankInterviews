package in.ibm.test;

public class CoreJava2 {
	public static void main(String[] args) {
		new CoreJava2().testMethod();
	}

	void testMethod() {
		throw new RuntimeException(new Exception("it's a new Exception"));
	}
}
