package Day05;

public class Mp3p { 		//클래스 자료형 / 설계도
	private String color;	//멤버변수(속성)
	private int memory;
	public void setColor(String c) { // 멤버 메소드(행위/동작)
		if (c.equals("빨간색") || c.equals("파란색") || c.equals("노란색")) {
		color = c;
		} else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	public void setMemory(int m) {
		if(m == 256 || m == 512 || m == 1024) {
			memory = m;
		} else {
			System.out.println("지원하지 않는 용량입니다.");
		}
	}
	public String getColor() {
		return color;
	}
	public int getMemory() {
		return memory;
	}
	//garbage collection 가비지 컬렉션
	public static void main(String[] args) {
		Mp3p m3;				//참조변수 heap 영역에 할당받은 공간의 주소를 저장
		m3 = new Mp3p();		//인스턴스 heap 영역에 할당받은 데이터 저장 공간
		
		m3.setColor("빨간색");
		m3.setMemory(256);
		System.out.println("색상 : " + m3.getColor());
		System.out.println("용량 : " + m3.getMemory());
		
		Mp3p m4 = new Mp3p();
		m4.setColor("검정색");
		m4.setMemory(2048);
		System.out.println("색상 : " + m4.getColor());
		System.out.println("용량 : " + m4.getMemory());
	}
	//

}
