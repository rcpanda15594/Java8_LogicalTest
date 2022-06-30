package test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Test {

	public static void main(String[] args) {

		String[] s = new String[5];
		s[0]="RAM";
		s[1]="DAS";
		s[2]="SAM";
		s[3]="KAM";
		
		System.out.println(s[2].toLowerCase());

		//System.out.println(s[3].toLowerCase());
		
		Optional<String> o = Optional.ofNullable(s[3]);
		System.out.println(o);
		if(o.isPresent()){
			System.out.println(s[3]);
		}else{
			System.out.println("No Value");
		}
		
		System.out.println(s[3]);
		System.out.println(s.toString());
		
	//======================================================================
		
		List<String> listt = Arrays.asList("A","B","C");
		System.out.println(listt);
		
		Optional<String> nullck =Optional.ofNullable(listt.get(3)); 
		if(nullck.isPresent()){
			System.out.println(listt.get(3));
		}else{
			System.out.println("No Value");
		}
		
		
		
	}


}
