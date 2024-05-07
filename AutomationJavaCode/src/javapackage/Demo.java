package javapackage;

public class Demo {
     int a1=10; //global variable
     static int b=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class 1 - To Print Hello
		System.out.println("Hello");

		int j=4+3;
		System.out.println(j);



		//class 2 -- Arithmetic Operation
		int a=10, b=20;
	    System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		//Class3

		System.out.println(b); // static

		System.out.println(a); // local variable

		Demo d= new Demo();
		System.out.println(d.a1);

		//Class4

		int q=1000;
		char c='K';
		double d1= 100.0;
		boolean b1=true;

		System.out.println(q);
		System.out.println(c);
		System.out.println(d1);
		System.out.println(b1);

		boolean cc=a>b;
		System.out.println(cc);








	}

}
