package Day04;

public class ForEx2 {

	public static void main(String[] args) {
		int cnt = 0, sum = 0;
		
		for (int i = 1; i < 101; i++) {
//			System.out.println("i : " + i);
			if (i % 3 != 0 && i % 2 != 0) {
				cnt += 1 ;
				sum += i;
			
			}
			// 3의 배수가 아니면서 홀수인 수
			
		}
		System.out.println("개수 : " + cnt); // 33
		System.out.println("합계 : " + sum); // 1633
		

	}

}
