package Day03;

public class ElseIfEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("성별 : ");
		char gender = (char) System.in.read();
		if (gender == 'M' || gender == 'm') {
			System.out.println("남자");
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("여자");
		} else System.out.println("잘못입력했습니다.");

	}

}
