package Day04;

// 0~9까지 랜덤수를 하나 발생시킨다.
// 한자리 값을 입력받아서
// 맞앗으면 몇 번 만에 맞췄는지를 알려준 후 break로 빠져나온다.
// 틀렸을 경우 작다/크다를 알려준다.

public class WhileStudy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int rand = (int) (Math.random() * 10); // 0~9 랜덤
		int i = 0;
		while (true) {
			System.out.print("찍어봐(0~9) : ");
			int user = System.in.read() - 48;
			System.in.read();
			System.in.read();
			
			i++;
			
			if (rand == user) {
				System.out.println(i + "번 맞췄습니다.");
				break;
				
			} else if (rand > user) {
				System.out.println("입력하 값이 작습니다.");
			} else {
				System.out.println("입력한 값이 큽니다.");
				
			}
			
			
			
		}
		
		

	}

}
