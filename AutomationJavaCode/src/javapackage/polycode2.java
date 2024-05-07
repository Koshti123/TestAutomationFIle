package javapackage;

public class polycode2 extends poycode1 {

	@Override
	public void eat() {System.out.println("2");}

	public static void main(String[] args) {

		polycode2 nw=new polycode2();
		poycode1 nw1=new poycode1();
		nw.eat();
		nw1.eat();
	}
}
