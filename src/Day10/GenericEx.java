package Day10;

//제네릭 - 1.5
/*
class Generic {
	private int a;
	public Generic(int a) {
		this.a = a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}
*/
/*
class Generic {
	private Object a;
	public Generic(Object a) {
		this.a = a;
	}
	public void setA(Object a) {
		this.a = a;
	}
	public Object getA() {
		return a;
	}
}
*/

class Generic<T> {	//<T>는 Type의 약자 ex) E element / K key / V value 
	//제네릭 갖다 쓰면서 왜 명시 안하냐? 경고받는다.
	private T a;
	public Generic(T a) {
		this.a = a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
}

public class GenericEx {

	public static void main(String[] args) {
		Generic<Integer> ge1 = new Generic<Integer>(10);		//오토박싱 / 언박싱 new Integer(10)
		System.out.println("ge1 a : " + ge1.getA());
		int a = (Integer) ge1.getA();
		
		Generic<Double> ge2 = new Generic<Double>(10.5);	//new Double(10.5)
		System.out.println("ge2 a : " + ge2.getA());
		double d = (Double) ge2.getA();
		
		// ge2.setA("ABC");						// 문자열 관리할 객체를 따로 만들어라
		// System.out.println("ge2 a : " + ge2.getA());
		
//		Generic <String> ge3 = new Generic<String> ("ABCD"); 오류남
		Generic <?> ge3 = new Generic<String> ("ABCD"); // ?는 Object로 받겠다는 뜻
		// 참조변수 제네릭이 Object가 된다.
		ge3 = new Generic<Integer> (10);
		Integer c = (Integer) ge3.getA();
		
	}

}
