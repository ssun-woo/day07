package list;

import java.util.ArrayList;

/*
 collection
 - 데이터의 집합 구조 (자료구조)
 - 배열과는 다르게 공간의 크기가 유동적이다
 
 framework
 - 기본 틀
 
 collection framework
 - List (ArrayList)
  	- 순서가 존재한다
  	- 데이터의 중복은 허용 가능
  	
 - Map
 	-
 	 
 - Set  
 	- 
 
 */



public class Ex01 {
	
	public static void main(String[] args) {
		
		
		// - ArrayList
		
		ArrayList<String> arr = new ArrayList<>(); 
		// 자료형			  변수명
		// <>안에는 자료형이 들어감, 뒤쪽에는 생략가능(불가능한것도 있음)
		
		arr.add("111");
		arr.add("222");
		arr.add("333");
		// index를 사용해서 데이터를 넣는 배열과는 달리 .add를 사용해 데이터를 넣는다
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		// 출력을 할때는 .get과 index번호를 사용
		
		System.out.println("ArrayList의 크기 : " + arr.size()); 
		// ArrayList의 크기
		// 크기는 size아니면 length가 전부
		// 헷갈리면 .찍고 써보면 확인 가능(자동완성)
		
		
		System.out.println();
		System.out.println("======기본 for문 사용========");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		// 기본 반복문을 사용한 ArrayList 출력
		
		System.out.println();
		System.out.println("======for each문 사용========");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println();
		System.out.println("================");
		
		// ArrayList<int> arr02 = new ArrayList<>();
		// int로 변수형을 적으면 오류발생, <>안에는 대문자로 시작하는 자료형이 들어가야함
				
		int n1 = 100;
		Integer n2 = 200;
		System.out.println(n1);
		System.out.println(n2);
		// int와 Integer가 같다
		
		ArrayList<Integer> arr02 = new ArrayList<>();
		arr02.add(111);
		// arr02.add("111");
		// arr02.add(111.12);
		// >> 자료형이 다르면 오류 발생
		
		
	}
	
	
	
}
















