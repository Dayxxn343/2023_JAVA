package Day09;

//추상클래스		abstract
//추상 메서드를 하나라도 가지면 추상 클래스가 된다.
//추상 메서드는 구현하지 않는다.
//추상 크래스임을 명시해야 한다.
//객체를 생성할 수 없다. 항상 상속으로 구현된다.
//상속 시 추상 메소드는 빠짐없이 구현해야 한다.
//일반 변수 메서드 상수를 가질 수 있다.

abstract class AbstractSuper {				//추상 클래스		명시해야 한다.
	int a = 10;
	public abstract int getA();
}

public class AbstractEx extends AbstractSuper {
	public int getA() {
		return a;
	}

	public static void main(String[] args) {
//		AbstractSuper as = new AbstractSuper(); //인스턴스를 만드는 영역을 확보할 수 없다.
		//메소드 미완성이기 때문에 인스턴스 생성이 안됨 메모리 완성이 되어야 할당이 가능하지 않느냐

	}

}
