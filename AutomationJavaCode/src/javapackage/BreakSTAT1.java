package javapackage;

public class BreakSTAT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<5;i++) {
			System.out.println("Outer loop start");

			for(int j=1;j<5;j++) {
				System.out.println("inner loop start");

				if(i==2 & j==2) {
					break;
				}
				System.out.println(i+""+j);
			}
			System.out.println("Inner loop");
		}
		System.out.println("Outer loop");

	}

}
