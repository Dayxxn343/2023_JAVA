package Day03;

public class IfEx2 {

	public static void main(String[] args) throws Exception {
		// 2와 3의 공배수
		// TODO Auto-generated method stub
		System.out.print("정수 : ");
		int a = System.in.read() - 48;
		
		if ( a%2==0 && a%3==0) {
			System.out.println("공배수다.");
		} else {
			System.out.println("공배수가 아니다.");
		}

	}

}
