package Day10;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] group = {"대한민국", "중국", "일본", "베트남"};
		//					  4		  3		 2		1
		
		Stack <String>s = new Stack <String>();
		for(int i = 0; i<group.length; i++) {
			System.out.println("추가 : " + s.push(group[i]));
		}
		System.out.println("\n검색 : " + s.search("대한민국"));
		System.out.println("\n삭제s : " + s.remove(3));
		System.out.println("\n삭제 : " + s.remove("중국"));
		
		while(! s.empty()) {
//			System.out.println("출력 : " + s.peek());
			System.out.println("\n출력 : " + s.pop());
		}

	}

}
