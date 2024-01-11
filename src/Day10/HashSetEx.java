package Day10;

import java.util.HashSet;

/*
 * Collection		Set			HashSet
 * 								TreeSet
 * 					List		Vector			Stack
 * 								ArrayList
 * 					Queue		LinkedList
 * 
 * Map				HashMap
 * 					Hashtable
 */
public class HashSetEx {

	public static void main(String[] args) {
		//set은 대량 데이터보관이 안됨 소량만 가능
		//index가 없어서 정력이 없다.
		
		HashSet<String> hs = new HashSet<String> ();
		
		//추가
		System.out.println("추가 : " + hs.add("홍길동"));
		System.out.println("추가 : " + hs.add("이순신"));
		System.out.println("추가 : " + hs.add("김유신"));
		System.out.println("추가 : " + hs.add("홍길동"));
		
		System.out.println("\n크기 : " + hs.size());
		
		//삭제
		System.out.println("\n삭제 : " + hs.remove("홍길동"));
		
		//검색
		System.out.println("\n검색 : " + hs.contains("홍길동") + "\n");
		
		for(String str : hs) {		//배열이나 컬렉션만
			System.out.println("출력 : " + str);
		}
	}

}

