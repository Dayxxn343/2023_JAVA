package Day08;

// 변수			상수화 된다. 값을 변경할 수 없다.
// 메서드			오버라이드를 할 수 없다.
// 클래스			상속을 받을 수 없다.

/*final*/ class FinalSuper {
	final int a = 10;		//초기화 해야 한다.		//final 초기화되어 있어야 한다.
	public /*final*/ int getA() {
		return a;
	}
}
public class FinalEx extends FinalSuper {	// 상속할 수 없다.
	public int getA() {		//재정의 할 수 없다.
		return a;
	}

	public static void main(String[] args) {
		FinalSuper fs = new FinalSuper();
//		fs.a = 20;			// 변경할 수 없다.
		
		

	}

}
