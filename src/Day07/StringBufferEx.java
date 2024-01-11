package Day07;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성
		StringBuffer sb = new StringBuffer("Hello Java!!");
		System.out.println("용량 : " + sb.capacity());
		System.out.println("크기 : " + sb.length());
		
		//추가
		System.out.println("추가 : " + sb.append("!!"));
		System.out.println("추가 : " + sb); 		//원본이 변경된다.
		System.out.println("추가 : " + sb.insert(6,  "&JSP "));
		
		// 삭제
		System.out.println("삭제 : " + sb.delete(5,  sb.length()));
		System.out.println("용량 : " + sb.capacity());
		System.out.println("크기 : " + sb.length());
		
		sb.trimToSize();
		System.out.println("용량 : " + sb.capacity());
		System.out.println("크기 : " + sb.length());
		

	}

}
