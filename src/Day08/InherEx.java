package Day08;
//상속			Inheritance
//부모 것은 내 것.
//생성자는 제외
//재사용(재활용)
//코드의 간결성. 개발시간의 단축.

//class CellPhone		모델명, 전화번호 관리
//class CaPhone			화소 관리
//class Mp3Phone		화음 관리

class CellPhone {		//전화 기능
	private String model;
	private String tel;
	public CellPhone() {}
	public CellPhone(String model, String tel) {
		this.model = model;
		this.tel = tel;
	}
	public String getModel() {
		return model;
	}
	public String getTel() {
		return tel;
	}
	
} // CellPhone

class CaPhone extends CellPhone {			//전화 기능 + 카메라 기능
	private int pixel;
	
	public CaPhone(String model, String tel, int pixel) {
		super(model, tel);
//		this.model = model;
//		this.tel = tel;
		this.pixel = pixel;
	}
	public int getPixel() {
		return pixel;
	}
} // CaPhone

class Mp3Phone extends CaPhone {	//전화 기능 + 카메라 기능 + mp3 기능
	private int chord;
	public Mp3Phone(String model, String tel, int pixel, int chord) {
		super(model, tel, pixel);
		this.chord = chord;
	}
	public int getChord() {
		return chord;
	}
} // Mp3Phone

public class InherEx {
	public static void main(String[] args) {
		Mp3Phone mp = new Mp3Phone("B-500", "1111-2222", 1000, 20);
		System.out.println("화소 : " + mp.getPixel() );
		System.out.println("모델명 : " + mp.getModel() );
		System.out.println("전화번호 : " + mp.getTel() );
		System.out.println("화음 : " + mp.getChord() );
		
//		CellPhone cp = new CellPhone("B-500", "1111-2222");
//		System.out.println("모델명 : " + cp.getModel());
//		System.out.println("전화번호 : " + cp.getTel());
		
//		CaPhone ca = new CaPhone("B-500", "1111-2222", 1000);
//		System.out.println("화소 : " + ca.getPixel());
//		System.out.println("모델명 : " + ca.getModel());
//		System.out.println("전화번호 : " + ca.getTel());

	}

}
