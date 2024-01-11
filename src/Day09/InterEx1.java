package Day09;

//인터페이스 		Interface
//interface 키워드를 사용한다.
//상수와 추상 메소드만으로 구성된다.
//final, abstract 키워드를 따로 붙이지 않는다.
//interface 는 객체를 생성할 수 없다.
//상속 시 implements(구현) 키워드를 사용한다.
//상속 시 추상 메소드는 빠짐없이 구현해야 한다.
//다중 상속이 가능하다.

interface InterSuper {
	int a = 10;				//final 		초기화해야됨
	public int getA();		//abstract		구현할 수 없다.
}
public class InterEx1 implements InterSuper {		//상속받아야만 한다.
	public int getA() {
		return a;
	}

	public static void main(String[] args) {
//		InterSuper is = new InterSuper();
		InterEx1 ie = new InterEx1();
		System.out.println(ie.getA());

	}

}
