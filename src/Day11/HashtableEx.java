package Day11;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class HashtableEx {

	public static void main(String[] args) {
		//생성
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		//추가
		System.out.println("크기 : " + ht.size());
		
		ht.put(9, "홍길동");
		ht.put(1, "이순신");
		ht.put(5, "김유신");
		if(! ht.containsKey(0)) ht.put(0, "홍길동");
		ht.put(9, "대조영");			//변경
		
		System.out.println("크기 : " + ht.size());
		
		//출력
		Enumeration <String> e = ht.elements();
		while(e.hasMoreElements()) {
			System.out.println("출력 : " + e.nextElement());
			
		}
		
		Enumeration <Integer> en = ht.keys();
		while(en.hasMoreElements()) {
			System.out.println("출력 : " + ht.get(en.nextElement() ) );
		}
		
		//set
		HashSet <Integer> hs = new HashSet<Integer> (ht.keySet());
		Iterator <Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println("Set : " + it.next());
		}
		
		Vector <String> v = new Vector <String> (ht.values());
		for(int i = 0; i<v.size(); i++) {
			System.out.println("Collection : " + v.get(i));
		}
		
	}

}
