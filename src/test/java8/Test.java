package test.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		A a = () -> System.out.println("Hello...");
		a.m1();

		LocalDate date = LocalDate.now();
		LocalDateTime time = LocalDateTime.now();
		System.out.println(date + "------------" + time);

	
	List<Integer> list = Arrays.asList(10,20,30,40);
	
	List<Integer> list1 =list.stream().filter(i -> i>20).collect(Collectors.toList());
	System.out.println(list1);
	
	
	
	
	}

}
