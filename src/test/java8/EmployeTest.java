package test.java8;

import java.util.ArrayList;

public class EmployeTest {

	public static void main(String[] args) {

		ArrayList<Employe> al = new ArrayList<>();
		al.add(new Employe("Durga", 100));
		al.add(new Employe("Shiva", 200));
		al.add(new Employe("Ravi", 300));
		al.add(new Employe("Akasha", 400));

		System.out.println(al);

		// Collections.sort(al,Comparator c);

		al.sort((a, b) -> a.eno - b.eno);
		al.forEach(System.out::println);

	}

}
