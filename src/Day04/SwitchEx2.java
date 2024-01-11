package Day04;

public class SwitchEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("문자 : ");
		char str = (char) System.in.read();
		//문자로 입력 받은 것을 문자로 저장함
		switch (String.valueOf(str) ) {
		case "1" : System.out.println("하나"); break;
		case "2" : System.out.println("둘"); break;
		case "3" : System.out.println("셋"); break;
		default : System.out.println("문자열"); break;
		
		}

	}

}
