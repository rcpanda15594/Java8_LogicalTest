package test.java8;

public class Employe {

	String name;
	int eno;

	public Employe(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "name=" + name + ", eno=" + eno + "";
	}

}
