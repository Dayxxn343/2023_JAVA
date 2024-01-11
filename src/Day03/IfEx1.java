package Day03;
/* 제어문
조건문
	- if ( 조건 ) 참;
	- if ( 조건 ) 참;
	  else 거짓;
	- if ( 조건 ) 참;
	  else if ( 조건 ) 참;
	  ...
	  else 거짓;
	- switch ~ case

반복문
	- for
	- while
	- do ~ while
 */

public class IfEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("정수 : ");
		int a = System.in.read() - 48;
		if (a > 5) {
			System.out.println("크다");
		} else {
			System.out.println("작다");
		}

	}

}
