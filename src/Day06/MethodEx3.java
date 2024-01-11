package Day06;

public class MethodEx3 {
//	int a = 5, b = 2;					//전역변수
	public void hap( int a, int b) {	//매개변수 argument parameter 인수 인자
//		int a = 5, b = 2;				//지역변수
		System.out.println("합 : " + (a + b));
	}
	public void cha(int a, int b) {
//		int a = 5, b = 2;
		System.out.println("차 : " + (a - b));
	}
	public void gop( int a, int b) {
//		int a = 5, b = 2;
		System.out.println("곱 : " + (a * b));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx3 me = new MethodEx3();
		me.hap(5, 2);
		me.cha(5, 2);
		me.gop(5, 2);

	}

}
