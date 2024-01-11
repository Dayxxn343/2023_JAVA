package Day09;
import java.util.Date;
public class ToStringEx extends Object {
	public String toString() {
		return "재정의한 toString이다.";
		
	}

	public static void main(String[] args) {
		ToStringEx ts = new ToStringEx();
		System.out.println("ToStringEx : " + ts);	//toString() 호출		Object - 주소출력
		
		String s = new String("Hello");
		System.out.println("String : " + s);		//toString() 호출		String - 문자입출력
		
		Date d = new Date();
		System.out.println("Date : " + d);			//toString() 호출		Date - 날짜출력

	}

}
