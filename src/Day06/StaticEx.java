package Day06;

// static 영역에 할당된다.
// 다른 멤버보다 먼저 할당된다. (static / heap / stack)
// static 메서드는 static 변수만 호출할 수 있다.
// 객체없이 접근 가능하다.
// 자동 초기화 된다. 초기화는 한 번 만 수행한다.
// 모든 객체(Object)들이 사용 할 수 있도록 공유개념을 가진다.
// 클래스 변수 / 클래스 메소드 라고도 한다.

public class StaticEx {
	private int a = 10;
	private static int b = 10;		
	// 클래스변수 <- 공유하니까 <- 한 번만 할당하니까 <- 먼저 할당하니까

	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		// TODO Auto-generated method stub
		System.out.println("a : " + se.a);
		System.out.println("b : " + b);
		System.out.println("b : " + se.b);
		System.out.println("b : " + StaticEx.b);
		
		se.a += 10;
		se.b += 10;
		System.out.println("se a : " + se.a); 
		System.out.println("se b : " + se.b);
		
		StaticEx se1 = new StaticEx(); // a, b 값이 10으로 초기화됨
		se1.a += 10;
		se1.b += 10;
		System.out.println("sel a : " + se1.a);
		System.out.println("sel b : " + se1.b);
		

	}

}
