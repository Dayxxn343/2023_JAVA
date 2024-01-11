package Day04;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지
		int i = 0;
		int sum = 0, sum_even = 0, sum_odd = 0;
		while (i <100) {
			i ++;
			if (i % 2 == 0) {
				sum_even += i;
			}
			else {
				sum_odd += i;
			}
			sum = sum_even + sum_odd;
		} 
		System.out.println("짝수 합 : " + sum_even); //2550
		System.out.println("홀수 합 : " + sum_odd); //2500
		System.out.println("전체 합 : " + sum); // 5050

	}

}
