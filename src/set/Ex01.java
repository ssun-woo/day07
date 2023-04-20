package set;

import java.util.ArrayList;
import java.util.HashSet;

/*
 set
 - 순서가 존재하지 않는다(인덱스로 접근이 불가능)
 - 데이터의 중복을 허용하지 않는다
 - 배열 안의 공간을 16개로 잡고 75%가 차면 새롭게 16개의 공간을 생성한다
   공간은 유동적이다
 */
public class Ex01 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		// ArrayList와 마찬가지로 <>안에는 대문자로 시작하는 자료형이 들어간다

		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		set.add("ccc");

		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("aaa");
		arr.add("ccc");

		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
		// ArrayList는 중복이 허용되는 반면 Set은 중복이 허용되지 않음

		System.out.println();
		System.out.println("===== remove =====");
		set.remove("bbb");
		System.out.println(set);

	}
}
