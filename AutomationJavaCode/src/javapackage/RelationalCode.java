package javapackage;

public class RelationalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=100;

		if (a !=b) {
			System.out.println("a");
		}else {
			System.out.println("b");
		}

		String p="HELLO";
		String q="hello";

		if (p.equals(q)) {System.out.println("a");}
		else {System.out.println("b");}

		if (p.equalsIgnoreCase(q)) {System.out.println("a");}
		else {System.out.println("b");}

	}

}
