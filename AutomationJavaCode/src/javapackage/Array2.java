package javapackage;

public class Array2 {

	public static void main(String[] args) {

		int a[][]= {{1,2,3,4},{5,6,7,8}};

		int row=a.length;
		int coln=a[0].length;

		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
