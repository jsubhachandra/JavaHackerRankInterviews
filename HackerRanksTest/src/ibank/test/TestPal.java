package ibank.test;

import java.util.Date;

public class TestPal {

	public static void main(String[] args) {
		String palen= "ABba";
		Date d = new Date();
		 System.out.println(d.getTime());
		 
		Boolean flag = isPalendram1(palen);
		System.out.println(flag);
		Date d1 = new Date();
		 System.out.println(d1.getTime());
		//O(n)
		//data(input string)

	}

	private static Boolean isPalendram1(String palen) {
		 
		 Boolean flag = false;
		 String reVName ="";
		for (int i = palen.length()-1; i >=0 ; i--) {
			reVName = reVName+palen.charAt(i);
		}
		if(palen.equalsIgnoreCase(reVName)) {
			flag = true;
		}
		 
		return flag;
	}

 
 
}
