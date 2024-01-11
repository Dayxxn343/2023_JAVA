package Day11;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//객체 생성
		Vector <String> v = new Vector <String> (5, 3);
		System.out.println("추가 : " + v.add("홍길동"));
		System.out.println("추가 : " + v.add("이순신"));
		System.out.println("추가 : " + v.add("김유신"));
		v.addElement("강감찬");
		v.add(2, "대조영");
		v.insertElementAt("연개소문", 3);
		
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());
		
		//삭제
		HashSet <String> hs = new HashSet <String> ();
		hs.add("홍길동");
		hs.add("연개소문");
		hs.add("양규");
		System.out.println("삭제 : " + v.removeAll(hs));
		
		
		//출력
		for (int i = 0; i<v.size(); i++) {
//			System.out.println("출력 : " + v.elementAt(i));
			System.out.println("출력 : " + v.get(i));
		}
		//인터페이스
		//직접 상송(implements)받아서 메서드를 모두 구현해서 사용
		//대신 구현하고 있는 클래스를 상속받아서 필요한 메서드만 재정의해서 사용
		//익명 내부클래스로 객체를 생성해서 메서드를 모두 구현해서 사용
		//대신 객체를 생성하는 메서드의 리턴값을 받아서 사용
		
		//클래스
		//객체 생성 아니면 상속
		//멤버 모두가 static인 경우 클래스명.멤버
		//대신 객체를 구현해주는 메서드의 리턴값을 받아서 사용
		//자식클래스로 객체를 만들고 참조값을 받아서 사용
		//Class.forName() 객체를 생성
		
		
		//Enumeration		열거자 반복자. 복사본을 만든다.
		Enumeration <String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println("Enumeration : " + e.nextElement());
		}
		
		
		//Iterator			복사본을 만들지 않는다.
		Iterator <String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println("Iterator : " + i.next());
		}
		
		//배열
		String [] str = new String[v.size()];
		v.copyInto(str);
		for(int j = 0; j<str.length; j++) {
			System.out.println("배열 : " + str[j]);
		}
	}

}
