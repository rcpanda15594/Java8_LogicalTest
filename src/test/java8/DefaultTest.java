package test.java8;

public class DefaultTest implements A,B {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		B.super.m2();
	}

public static void main(String[] args) {
	DefaultTest a = new DefaultTest();
	a.m2();
}

	

}
