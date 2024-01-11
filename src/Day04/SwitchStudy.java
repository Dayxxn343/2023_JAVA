package Day04;

// 사칙연산( +- * / %) 계산기를 만든다.
// 사칙연산 이외의 문자가 들어오면 "잘못입력" 출력
// 나누기는 소수점이 나오도록

// 입력 2 5 +
// 출력 2 + 5 = 7
public class SwitchStudy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("정수 1 : ");
		int a = System.in.read() - 48;
		System.in.read();
		System.in.read();
		System.out.print("정수 2 : ");
		int b = System.in.read() - 48;
		System.in.read();
		System.in.read();
		
		System.out.print("연산자( +  -  *  /  %) : ");
		char c = (char) System.in.read();
		
		switch (c) {
		case '+' : System.out.println(a + "+" + b + "=" + (a+b)); break;
		case '-' : System.out.println(a + "-" + b + '=' + (a-b)); break;
		case '*' : System.out.println(a + "*" + b + "=" + (a*b)); break;
		case '/' : System.out.println(a + "/" + b + "=" + ((double)a/b)); break;
		case '%' : System.out.println(a + "%" + b + "=" + (a%b)); break;
		default : System.out.print("잘못 입력");
		}
		
		

	}

}
