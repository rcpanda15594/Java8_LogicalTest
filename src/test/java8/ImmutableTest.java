package test.java8;


public final class  ImmutableTest
{
	private final int i;

	public ImmutableTest (int i){
	this.i =i;
	}
	public int getI(){
		return this.i;
	}

	public static void main(String[] args){
	System.out.println("Run");
	ImmutableTest im = new ImmutableTest(10);
	ImmutableTest im2 = new ImmutableTest(20);
	System.out.println(im.i);
	//im.i=20;
	}

}
