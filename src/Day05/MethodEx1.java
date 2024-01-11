package Day05;
//메서드( Method )
//독립된 프로그램
//반복되는 내용을 묶어서 처리
//반드시 호출한 곳으로 되돌아 온다
//인수는 개수에 상관없다.
//return 값이 없으면 void 다.
//return 값은 한 개 뿐이다.

//함수 특. 선언 구현 호출
public class MethodEx1 {
	public void sub() {		//선언 - 메소드를 알려준다./ 구현 - 메소드가 할 일을 정의
		System.out.println("Hello Java!!!");
		// return;		생략되어있음
	}

	public static void main(String[] args) {	//메인 메소드
		MethodEx1 me = new MethodEx1();
		me.sub();
		me.sub();
		me.sub();

	}

}
