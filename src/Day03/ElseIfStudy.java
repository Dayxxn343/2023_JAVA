package Day03;

public class ElseIfStudy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("정수 1 : ");
		int a = System.in.read() -48;
		System.in.read();
		System.in.read();
		System.out.print("정수 2 : ");
		int b = System.in.read() -48;
		System.in.read(); // System.in.read()를 입력받고 Enter키를 칠 경우
		System.in.read(); // 자동으로 정수 3에 대한 입력으로 넘어가기 때문에 x 2 작성
		System.out.print("정수 3 : ");
		int c = System.in.read() -48;
		
		// 가장 큰 수 하나만 구해서 출력
		// 조건의 개수는 3개까지
		
//		if (a > b && a > c) System.out.println("큰 수 : " + a);
//		if (b > a && b > c) System.out.println("큰 수 : " + b);
//		if (c > a && c > b) System.out.println("큰 수 : " + c);
		
		if (a > b && a > c) System.out.println("큰 수 : " + a);
		else if ( b > c) System.out.println("큰 수 : " + b);
		else System.out.println("큰 수 : " + c);

	}

}
