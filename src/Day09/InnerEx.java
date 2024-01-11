package Day09;
//내부클래스			Inner Class
//Member			멤버 변수나 멤버 메서드들과 같이 클래스가 정의
//외부 클래스의 멤버를 참조할 수 있다.
//static 변수를 가질 수 없다.
//객체를 생성하기 위해서는 외부 클래스의 객체를 먼저 생성해야 한다.

//Local				특정한 메서드 내에 클래스가 정의된 경우
//간단한 기능을 갖는 임시 클래스로 사용
//메소드 내부에서 선언되고 메소드 안에서만 객체화 할 수 있다.
//메소드 외부에서는 사용할 수 없습니다.
//접근수정자를 사용할 수 없다.

//Static 			클래스가 static으로 선언된 경우
//static 변수를 가지고 있다면 클래스는 static으로 선언해야 한다.
//외부 클래스의 static 멤버만 참조할 수 있다.

//Anonymous 		참조할 수 있는 이름이 없는 경우
//한 번만 사용하고 버려야 할 객체의 경우
// ㄴ 제일 어렵고 제일 중요함!

/* class Outer		- int a
 * 					- disp()	- class InnerLocal	- int c
 * 													- disp()
 * 					- class InnerMember		- int b
 * 											- disp()
 * 					- static class InnerStatic		- int d
 * 													- disp()
 * class InnerAnony		- int a
 * 						- disp()
 */


class Outer {
	private int a = 10;
	public void disp() {
		System.out.println("Outer a : " + a);
	
		//////////////Member Inner Class //////////////
		class InnerLocal {
			private int c = 30;
			public void disp() {
				System.out.println("InnerLocal a : " + a);
				System.out.println("InnerLocal c : " + c);
			}
		} //class InnerLocal
		InnerLocal il = new InnerLocal();
		il.disp();
	}
	
	////////////// Member Inner Class //////////////
	class InnerMember {
		private int b = 20;
		public void disp() {
			System.out.println("InnerMember a : " + a);
			System.out.println("InnerMember b : " + b);
		}
	} // class InnerMember
	
	//////////////Static Inner Class //////////////
	class InnerStatic {
		
		private int d = 40;
		public void disp() {
			//System.out.println("InnerStatic a : " + a);	// static 멤버만 접근
			System.out.println("InnerStatic d : " + d);
		}
	} // class InnerStatic

	public static InnerStatic InnerStatic() {
		// TODO Auto-generated method stub
		return null;
	}
	
} // class Outer


abstract class InnerAnony {		//추상클래스
	int e = 50;
	public abstract void disp();
	
}
public class InnerEx {
	public static void main(String[] args) {
		
		//Anonumouse Inner class
		InnerAnony ia = new InnerAnony() {
			public void disp() {
				System.out.println("InnerAnony e : " + e);
			}
		};
		ia.disp();
		
		new InnerAnony() {
			public void disp() {
				System.out.println("InnerAnony e : " + e);
			}
		}.disp();
		
		
		Outer out = new Outer();
		out.disp();
		
		//Member Inner Class
		Outer.InnerMember in = new Outer(). new InnerMember();
		Outer.InnerMember im = out.new InnerMember();
		im.disp();
		
		//Static Inner Class
		Outer.InnerStatic is = Outer.InnerStatic();
		is.disp();
		

	}

}
