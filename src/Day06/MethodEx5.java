package Day06;

public class MethodEx5 {
	public int hap(int a, int b) {
//		System.out.println("합 : " + (a+b));
	//void 결과형 / 반환형
		return a + b;
	}
	public double mok(double a, int b) {
		return (double)a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx5 me = new MethodEx5();
//		int sum = me.hap(2, 5);
//		System.out.println("합 : " + sum);
		System.out.println("합 : " + me.hap(2, 5));
		System.out.println("몫 : " + me.mok(2, 5));

	}

}
