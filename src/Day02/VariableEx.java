package Day02;

// 한 줄 주석
/* 여러 줄 주석
 	변수 변하는 값 / 메모리 할당
 	자료형 	키워드 		크기  		기본값
 	논리형 	boolean 	1bit 		false
 	정수형 	byte		1byte		0
 			short		2byte 		0
 			int 		4byte		0
 			long 		8byte 		0
 	실수형	float		4byte 		0.0
 			double 		8byte 		0.0
 	문자형	char 		2byte 		\u0000
 	문자열				두 글자 이상 	null
 */

public class VariableEx {
	public static void main(String[] args) {
		boolean a = true;
		System.out.println("a : " + a);
		
		byte b = -128; // 1byte -128 ~ 127
		System.out.println("b : " + b);
		
		short c = 32767; // 2byte -32768 ~ 32767
		System.out.println("c : " + c);
		
		char d = '월';
		//char e = "월";	문자열
		System.out.println("d : " + d);
		
		String f = "월화수";
		System.out.println("f : " + f);
		
		double g = 4.0; // 4.0 double 	4.0f 4.0F float
		System.out.println("g : " + g);
		
		float h = 4.0f;
		System.out.println("h : " + h);
		
		//형변환
		int num1 = 10;
		double num2 = 10.5;
		double num3 = num1;	//실수 = 정수 	강제형변환
		System.out.println("num3 : " + num3);
		
		int num4 = (int) num2;	// 4byte = 8byte	강제형변환
		System.out.println("num4 : " + num4);
	}

}
