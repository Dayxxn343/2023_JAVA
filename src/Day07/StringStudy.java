package Day07;

import java.util.StringTokenizer;

public class StringStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "930104-1111111";
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s, "-");
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		// System.out.println( sb );
		int year = (sb.charAt(0)-48) * 10 + (sb.charAt(1)-48) 
				+ (sb.charAt(6) == '3' || sb.charAt(6) == '4' ? 2000 : 1900 );
		int month = (sb.charAt(2)-48) * 10 + (sb.charAt(3)-48);
//		int day = (sb.charAt(4)-48) * 10 + (sb.charAt(5)-48);
		String gender = sb.charAt(6) == '1' || sb.charAt(6) == '3' ? "남자" : "여자";
		int age = 2024 - year;
		
//		int day = Integer.parseInt(sb.substring(4, 6));
		char m[] = sb.toString().toCharArray();
		int day = ( m[4] - 48 ) * 10 + (m[5] - 48);
		System.out.println(year + "년 " + month + "월 " + day + "일생 " + age + "살 " + gender + "입니다");
		
		// 1993년 1월 4일생 만 31살 남자입니다. 출력

	}

}
