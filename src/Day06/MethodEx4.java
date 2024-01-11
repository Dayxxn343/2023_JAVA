package Day06;
// 오버로드
// 함수의 이름은 같으면서 매개변수의 자료형이 다르거나 갯수가 다르거나 순서가 다른 경우
// 다른 함수로 취급한다

public class MethodEx4 {
	// c 	hap(int, int)
	// 		hap3(int, int, int)
	// c++  hap(int, int)
	// 		hap(int, int, int)
	public void hap(int a, int b) {
		System.out.println("합 : " + (a+b));
	}
	public void hap(int a, int b, int c) {
		System.out.println("합 : " + (a + b + c));
	}
	public void hap(double a, double b) {
		System.out.println("합 : " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx4 me = new MethodEx4();
		me.hap(5, 2);
		me.hap(2,  5, 7);
		me.hap(2.5, 3.7);

	}

}
