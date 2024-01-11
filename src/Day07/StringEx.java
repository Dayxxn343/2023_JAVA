package Day07;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0	1	2	3	4	5	6	7	8	9	10	11	12
		// | H | e | l | l | o |  | J | a | v | a | ! | ! | ! \0
		
		String s1 = "Hello Java!!";		// 문자열은 String 클래스 객체다.
		String s2 = "Hello Java!!";
		
		// == 주소비교 equals() 내용비교
		if (s1 == s2) System.out.println("같다.");
		else System.out.println("다르다.");
		if(s1.equals(s2)) System.out.println("같다.");
		else System.out.println("다르다.");
		
		s1 += "!!";
		if (s1 == s2) System.out.println("같다.");
		else System.out.println("다르다.");
		
		String s3 = new String ("Hello Java!!");
		if (s2 == s3) System.out.println("같다.");
		else System.out.println("다르다.");
		if(s2.equals(s3)) System.out.println("같다.");
		else System.out.println("다르다.");
		
		// 0	1	2	3	4	5	6	7	8	9	10	11	12
		// | H | e | l | l | o |  | J | a | v | a | ! | ! | ! \0
		
		System.out.println("charAt : " + s3.charAt(6));
		System.out.println("indexOf : " + s3.indexOf('a'));
		System.out.println("lastIndexOf : " + s3.lastIndexOf('a'));
		System.out.println("concat : " + s3.concat("!!"));
		System.out.println("s3 : " + s3);
		System.out.println("length : " + s3.length());
		System.out.println("replace : " + s3.replace('a', 'o'));
		String s[] = s3.split(" ");
		for(int i = 0; i<2; i++) {
		System.out.println("split : " + s[i]);
		}
		
		System.out.println("substring : " + s3.substring(6, 11));
		
		String str = "	a	a	a	";
		System.out.println("trim : " + str);
		System.out.println("trim : " + str.trim());
	}

}
