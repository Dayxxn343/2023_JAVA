package Day02;

public class OperatorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 81; 		//국어 점수
		int eng = 75; 		//영어 점수
		int mat = 91; 		// 수학 점수
		
		int total = kor + eng + mat;
		double average = (total)/3;
		
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + mat + "점");
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + average + "점");
		
		
		
		//국어 : 81점
		//영어 : 75점
		//수학 : 91점
		//총점 : ---점
		//평균 : --.-점 		//단 소수점이 출력되도록

	}

}
