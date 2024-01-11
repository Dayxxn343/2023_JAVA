package Day06;
//생성자 Constructor 		소면자(메모리 정리 함수) Destructor는 없다.
//생성자는 메서드다.
//클래스명과 동일하다.
//결과형 반환형이 없다.
//구현하지 않으면 default가 실행된다.
//객체 생성시 자동 호출 된다.
//객체 초기화에 사용된다.

//다른 메소드와 main의 변수들을 구분해야 함
//ex) 아래 변수들과 같이 name, age와 같이
//메소드와 main의 것을 구분할 수 없기에 this.를 사용한다.

public class ConstructorEx {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	

	public int getAge() {
		return age;
	}
	
	public ConstructorEx() {
		System.out.println("기본 생성자");
	}
	
	public ConstructorEx(String name, int age) {
		System.out.println("\n생성자");
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx ce = new ConstructorEx();		
		// 객체 생성 -> 생성자 호출 -> 객체 초기화
		System.out.println("이름 : " + ce.getName());
		System.out.println("나이 : " + ce.getAge());
		
		ConstructorEx cel = new ConstructorEx("홍길동", 30);
		System.out.println("이름 : " + cel.getName());
		System.out.println("나이 : " + cel.getAge());

	}
}
