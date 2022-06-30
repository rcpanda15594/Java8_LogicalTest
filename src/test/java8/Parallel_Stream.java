package test.java8;

import java.util.Arrays;
import java.util.List;

public class Parallel_Stream {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(10,20,30,40,50);
		long t1 = System.currentTimeMillis();
		lst.stream().forEach(System.out::println);
		long t2 = System.currentTimeMillis();
		System.out.println("-----------------------------------"+(t2-t1));
		long t3 = System.currentTimeMillis();

		lst.parallelStream().forEachOrdered(System.out::println);
		long t4 = System.currentTimeMillis();
		System.out.println("-----------------------------------"+(t4-t3));
		System.out.println("Thread Name------------>"+Thread.currentThread().getName());

		long t5 = System.currentTimeMillis();

		lst.stream().parallel().forEach(System.out::println);
		long t6 = System.currentTimeMillis();
		System.out.println("-----------------------------------"+(t6-t5));
	}
	
}
