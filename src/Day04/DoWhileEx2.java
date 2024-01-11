package Day04;

public class DoWhileEx2 {

	public static void main(String[] args) throws Exception {
		// 2~9 까지 입력하면 구구단 출력
		// 2~9 아니면 다시 입력
		
		int dan = 0;
		
		do {
			System.out.print("단 입력 : ");
			dan = System.in.read() - 48;
			System.in.read();
			System.in.read();
		} while(dan < 2 || dan > 9);
		//구구단 출력
		for (int i = 1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}

	}

}
