package Day06;

public class EncapEx {
	private int aa = 10;
	int bb = 20;
	protected int cc = 30;
	public int dd = 40;
	
	public static void main(String[] args) {
		EncapEx ee = new EncapEx();
		System.out.println("aa : " + ee.aa);
		System.out.println("bb : " + ee.bb);
		System.out.println("cc : " + ee.cc);
		System.out.println("dd : " + ee.dd);
		
		// TODO Auto-generated method stub
		Encap ec = new Encap();
		System.out.println("a : " + ec.getA());
		//같은 멤버만 접근
		System.out.println("b : " + ec.b);
		//같은 폴더만 접근
		System.out.println("c : " + ec.c);
		// 같은 폴더이거나 상속받았을 때만 접근
		System.out.println("d : " + ec.d);
		// 아무나 접근
		

	}

}
