package Day06;

public class ClassStudy {
	private int a, b, c;
	public ClassStudy(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int total() {
		return a+b+c;
	}
	
	public double average() {
		return total() /3.0;
	}
	
	public String pass() {
		return average() >= 70 ? "합격" : "불합격";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudy cs = new ClassStudy(47, 55, 91);
		System.out.println("총점 : " + cs.total());
		System.out.println("평균 : " + cs.average());
		System.out.println("당락 : " + cs.pass()); // 70점 이상이면 "합격"

	}

}
