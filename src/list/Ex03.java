package list;

import java.util.ArrayList;

public class Ex03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>(); 
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		System.out.println("arr.indexOf(\"bbb\") : " + arr.indexOf("bbb"));
		System.out.println("arr.indexOf(\"aaa\") : " + arr.indexOf("aaa"));
		System.out.println("arr.indexOf(\"bbb222\") : " + arr.indexOf("bbb222"));
		// 같은 데이터가 존재하지 않으면 -1, 있으면 index번호를 반환
		
		
		System.out.println();
		System.out.println("====== set =====");
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");
		arr.add(1, "홍길동");
		System.out.println(arr);
		// 삭제(remove) 후 다시 추가(add)하면 마지막에 추가됨
		// 원하는 위치에 넣으려면 (index, 자료)로 add해야함
		
		arr.set(1, "김개똥");
		// index번호의 자료를 ,뒤의 자료형으로 변경
		// >> remove, add(index, 자료)와 같은 기능
		System.out.println(arr);
		
		
		
		
		
		
		
	}
	
}
