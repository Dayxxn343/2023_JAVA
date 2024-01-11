package Day02;

/*
 1. 증감 연산자
 	++ --
 2. 산술 연산자
 	* / % + -
 3. 쉬프트 연산자
 	<< >> >>>
 4. 비교 연산자 (관계 연산자)
 	< > <= >= == !=
 5. 비트 연산자
 	& | ^ ~ 		~ (1의 보수 연산자 / bit not) 는 1번
 6. 논리 연산자
 	&& || ! 		! (부정연산자 / 논리 not) 는 1번
 7. 조건 (삼항) 연산자
	? :
 8. 대입연산자
	= += -= *= /= %=
 */

public class OperatorEx1 {
	public static void main(String [] args) {
	int a = 10, b = 10;
	b = ++a;
	System.out.println("a : " + a + "\t" + "b : " + b);
	
	b = a++;
	System.out.println("a : " + a + "\t" + "b : " + b);
	
	a = b = 10;
	System.out.println("a : " + ++a + "\t" + "b : " + b++);
	
	
	}
}
