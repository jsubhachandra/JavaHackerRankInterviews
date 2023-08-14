package ibank.test;

import java.util.HashMap;

public class AEIOU_Test {
public static void main(String[] args) {
	String name = "My name is Subha Chandra";
	String name_arr[]  = name.split(" ");
	System.out.println(name_arr.length);
	
	HashMap<String, Integer> temp_mem = new HashMap<String, Integer>();
 	String ovels_test = "AEIOU";
	for (int i = 0; i< ovels_test.length(); i++ ) {
		Integer count = 0;
		for (int j = 0; j < name.length(); j++) {
			char c = ovels_test.charAt(i);
			String ov = String.valueOf(c);
			char a1 = name.charAt(j);
			String a = String.valueOf(a1);
			if(ov.equalsIgnoreCase(a) && temp_mem.containsKey(ov) ) {
				count++;
				temp_mem.put(ov, temp_mem.get(ov)+1);
			}else {
				temp_mem.put(ov, count);
			}
		}
	}
	
	System.out.println(temp_mem);

}
}
