package Day03;


public class ElseIfEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("정수 : ");
		int a = System.in.read() - 48;
		
		if(a == 1) System.out.println("하나");
		else if (a == 2) System.out.println("둘");
		else if (a == 3) System.out.println("셋");
		else System.out.println("숫자");

	}

}
