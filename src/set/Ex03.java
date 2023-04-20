package set;

import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashSet<String> name = new HashSet<>();
		String n;
		
		while(true) {
			System.out.print("이름 입력 : ");
			n = scan.next();
			
			if(name.add(n)) {
				System.out.println("사용가능한 이름입니다");
			}else {
				System.out.println("이미 존재하는 이름입니다");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
