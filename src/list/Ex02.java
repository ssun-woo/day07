package list;

import java.util.ArrayList;

public class Ex02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		for(String s : arr){
			if(s.equals("bbb")) {
				System.out.println("bbb와 같다");
			}else {
				System.out.println("bbb가 아니다");
			}
		}
		
		System.out.println();
		System.out.println("===== contains =====");
		// arr안에 특정 데이터가 존재하면 true, 그렇지 않으면 false 출력
		
		System.out.println(arr);
		System.out.println("arr.contains(\"bbb\") : " + arr.contains("bbb"));
		System.out.println("arr.contains(\"bb2\") : " + arr.contains("bb2"));
		boolean bool = arr.contains("bb2");
		// true와 false를 반환하기 때문에 boolean 타입으로 사용해야 한다
		
		
		System.out.println();
		System.out.println("===== bbb 삭제 =====");
		System.out.println("삭제 전 : " + arr);
		
		arr.remove(1); // arr.remobe("bbb");
		// index와 실제 자료를 통해 삭제 가능
		
		System.out.println("삭제 후 : " + arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



























