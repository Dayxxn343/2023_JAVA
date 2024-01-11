package Day09;

interface Inter1 {
	int a = 10;
	public int getA();
}

interface Inter2 {
	int b = 20;
	public int getB();
}

interface Inter3 extends Inter1, Inter2 {		//다중상속
	int c = 30;
	public int getC();
}

abstract class InterSuper1 implements Inter3 {	//구현하지 않으면 추상클래스가 된다.

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}

}

public class InterEx2 extends InterSuper1 {	//부모클래스에서 구현하면 구현할 의무가 없다.
	public static void main(String[] args) {
		//InterSuper1 is = new InterSuper();	//객체를 생성할 수 없다.
		InterEx2 ie = new InterEx2();
		System.out.println("a : " + ie.getA());
		System.out.println("b : " + ie.getB());
		System.out.println("c : " + ie.getC());

	}

}
