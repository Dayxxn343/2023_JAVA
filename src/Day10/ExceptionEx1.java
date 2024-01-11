package Day10;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int m[] = { 10, 20, 30 };
		
		try {
			for(int i=0; i<m.length + 1; i++) {
			System.out.println("m[" + i + "] : " + m[i]);
			}
//			System.out.println("프로그램 끝");	//예외처리를 ifelse로 생각하면 안됨 //프로그램 running이 안됨
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘었다.");
			e.printStackTrace();
			
		}finally {		//예외도 클래스임 //참조변수
			System.out.println("프로그램 끝");
		}

	}

}
