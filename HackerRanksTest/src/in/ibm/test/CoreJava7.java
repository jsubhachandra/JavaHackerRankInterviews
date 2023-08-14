package in.ibm.test;

import java.util.Optional;

public class CoreJava7 {

		public static void main(String[] args)throws Exception {
			Optional.of(24)
			.filter(v->v%4==0)
			.map(v->{System.out.println(v); return v/2;})
			.filter(s->s!=0)
			.map(s->s/6)
			.map(s->{System.out.println(s); return s;}).orElseThrow(()->new Exception("data error"));
			

	}

}
