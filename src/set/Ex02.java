package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");

		// Iterator : 반복자
		Iterator<String> it = arr.iterator();
		// it의 값은 bof의 값으로 시작하고 그 값을 참조
		// 마지막값은 eof
		// [bof // aaa // bbb // ccc // eof] 같은 형식으로 들어감
		// it << it의 최초의 위치
		// it << it.next() 한번을 사용한 위치
		// it
		// it

		/*
		 * System.out.println(it.hasNext()); // 다음이 있는지만 물어봄
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */

		
		  for (int i = 0; i < arr.size(); i++) { 
			  if (it.hasNext()) {
				  System.out.println(it.next()); 
				  } 
			  }
		  
		  System.out.println("for 사용");
		  for (; it.hasNext();) { // it.hasNext() == true
			  System.out.println(it.next()); 
			  }
		  
		  System.out.println("while 사용"); 
		  while(it.hasNext()) {
			  System.out.println(it.next()); 
		  }
		 
		
		HashSet<String> set = new HashSet<>();
		
		set.add("set aaa");	
		set.add("set bbb");
		set.add("set ccc");
		
		Iterator<String> it2 = set.iterator();
		
		/*
		 * for(;it2.hasNext();) { 
		 * System.out.println(it2.next()); 
		 * }
		 */
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
	}
}
