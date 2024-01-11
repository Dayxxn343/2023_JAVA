package Day04;

public class SwitchEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("정수 : ");
		int a = System.in.read() - 48;
		switch( a ) { 		// 정수 문자 정수로 떨어지는 식만 둘 수 있다.
		case 1 : System.out.println("하나"); break;
		case 2 : System.out.println("둘"); break;
		case 3 : System.out.println("셋"); break;
		default : System.out.println("숫자");
		// 실수값, 논리연산자(크다 작다)가 올 수 없음
		}


	}

}
