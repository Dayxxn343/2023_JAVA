package Day07;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[] = new int[] {10, 20, 30};
		int w[] = new int[3];
		
		for (int i = 0; i<3; i++) {
			System.out.println("m[" + i + "] : " + m[i]);
		}
		
		//개선된 루프		1.5버전 이후
		for (int a : m) {			//배열이나 컬렉션만 사용
			System.out.println(a);
		}
		
		//오토박싱 / 언박싱 		1.5버전 이후
		// byte		Byte
		// short 	Short
		// int		Integer
		// long		Long
		// char 	Character
		// float 	Float
		// double	Double
		
		int a = new Integer(10);	// int a = 10;
		Integer b = 10;				//Integer b = new Integer(10);
		

	}

}
