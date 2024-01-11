package Day05;
// 지역변수 / 전역변수

// 초반에 작성한다면 전역변수 int sum = 0;

public class MethodEx2 {
	int total;		//전역 변수 / 멤버변수
	
	public void hap() {
		int sum=0;		//지역변수
		for(int i = 1; i<101; i++) {
			sum += i;
			total += i;
		}
		System.out.println("합 : " + sum + "\t" + total);
	}
	public void gop() {
		int sum = 1;		//지역변수
		for(int i = 1; i<11; i++) {
			sum *= i;
			total *= i;
		}
		System.out.println("곱 : " + sum + "\t" + total);
		
	}
	public static void main(String[] args) {
		MethodEx2 me = new MethodEx2();
		me.hap();		//1 ~ 100 까지의 합
		me.gop();		//1 ~ 10 까지의 곱
	}

}
