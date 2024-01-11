package Day08;

//오버라이드 (재정의)

class OvSuper {
	String name = "부모클래스";
	public String getName() {
		return name;
	}
}


public class OverrideEx extends OvSuper {
	String name = "자식클래스";
	public String getName() {		//오버라이드 함수
		return name;		//부모한테도 있고 자식한테도 있는 선언부분이 꼭 포함되어있어야 함
	}

	public static void main(String[] args) {
		// 부모클래스 참조변수 = 부모클래스 인스턴스
		OvSuper os = new OvSuper();
		System.out.println("os name : " + os.name);
		System.out.println("os name : " + os.getName());
		
		// 자식클래스 참조변수 = 자식클래스 인스턴스
		OverrideEx oe = new OverrideEx();
		System.out.println("oe name : " + oe.name);
		System.out.println("oe name : " + oe.getName());
		
		// 부모클래스 참조변수 = 자식클래스 인스턴스
		OvSuper osu = new OverrideEx();		// 자동형변환 프로모션
		System.out.println("osu name : " + osu.name);	// 부모
		System.out.println("osu name : " + osu.getName());	//자식
		
		// 자식클래스 참조변수 = 부모클래스 인스턴스
		OverrideEx oee = (OverrideEx) new OvSuper();

	}

}
