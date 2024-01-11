package Day08;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int m[][] = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//		int m[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		int w[][] = new int[3][2];
		int a[] = {1, 2, 3};
		int b[] = {4, 5, 6, 10};
		int c[] = {7, 8, 9};
		int m[][] = {a, b, c};
		
		for (int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] : " + m[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(m[1][2]);
	}

}
