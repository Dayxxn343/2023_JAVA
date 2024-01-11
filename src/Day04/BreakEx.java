package Day04;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		// for 			반복문이 몇 번 도는지 알 때
		// while 		반복문이 몇 번 도는지 모를 때
		while(true) {
			i++;
			
			if ( i > 10 ) break;
			
			if (i % 2 == 1) continue;		// 반복문의 처음으로 돌아가라
			
			System.out.println("i : " + i);
		}

	}

}
