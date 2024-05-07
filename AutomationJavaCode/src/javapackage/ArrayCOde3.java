package javapackage;

public class ArrayCOde3 {

	static int c[] = { 22, 2, 44, 5 };

	/*public static void passingArray() {

		int b = c[0];

		for (int i = 0; i < c.length; i++) {

			if (b >= c[i]) {
				System.out.println(b);
			} else {
				System.out.println("ABCD");
			}

		}
	}*/

	public static void main(String[] args) {

		int b = c[0];

		for (int element : c) {

			if (b >= element) {
				System.out.println(b);
			} else {
				System.out.println("ABCD");
			}

		}
	}

}
