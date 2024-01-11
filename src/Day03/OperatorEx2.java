package Day03;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비트 논리 연산자
		int a = 20;
		int b = 12;
		System.out.println("a & b : " + (a&b));
		System.out.println("a | b : " + (a|b));
		System.out.println("a ^ b : " + (a^b));
		System.out.println("\n");
		
		// 논리 연산자
		// && and
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("\n");
		
		// || or
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);


	}

}
