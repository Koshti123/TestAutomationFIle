package javapackage;

public class Static2 {

	double roll;
	String name;
	String college;
	static int z=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static2 sj=new Static2();
		System.out.println(sj.roll);
		System.out.println(sj.name);
		System.out.println(sj.college);

		sj.roll=10;
		sj.name="Abhi";
		sj.college="VIIT";
		Static2.z=101;
		z=101;


		System.out.println(sj.roll);
		System.out.println(sj.name);
		System.out.println(sj.college);
	}

}
