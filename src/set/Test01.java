package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 연락처 저장 프로그램 만들기

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>");
			int choice = scan.nextInt();
			String n = null;
			String p = null;

			switch (choice) {
			case 1:
				System.out.println("========");
				System.out.println("연락처 등록");
				System.out.println("========");

				System.out.print("이름을 입력하세요 : ");
				n = scan.next();

				if (name.contains(n)) {
					System.out.println("이미 등록된 이름입니다");
				} else {
					System.out.print("전화번호를 입력하세요 : ");
					p = scan.next();
					if (phone.contains(p)) {
						System.out.println("이미 등록된 번호입니다");
					} else {
						System.out.println("정상적으로 등록됐습니다");
						name.add(n);
						phone.add(p);
					}
				}
				break;
			case 2:
				System.out.println("========");
				System.out.println("연락처 보기");
				System.out.println("========");

				if (name.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				} else {
					System.out.print("이름을 입력하세요 : ");
					n = scan.next();
					if (name.contains(n)) {
						p = phone.get(name.indexOf(n));
						System.out.println("이름 : " + n);
						System.out.println("번호 : " + p);
					} else {
						System.out.println("등록되지 않은 이름입니다");
					}
				}

				break;
			case 3:
				System.out.println("========");
				System.out.println("연락처 삭제");
				System.out.println("========");

				if (name.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				} else {
					System.out.print("이름을 입력하세요 : ");
					n = scan.next();
					if (name.contains(n)) {
						phone.remove(name.indexOf(n));
						name.remove(n);
						System.out.println(n + "회원이 삭제됐습니다");
					} else {
						System.out.println("등록되지 않은 이름입니다");
					}
				}
				break;
			case 4:
				System.out.println("=============");
				System.out.println("모든 연락처 보기");
				System.out.println("=============");
				
				if(name.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				}else {
					for(int i=0; i<name.size(); i++) {
						System.out.println("-------------");
						System.out.println("이름 : " + name.get(i));
						System.out.println("번호 : " + phone.get(i));
						System.out.println("-------------");
					}
				}
				break;
			case 5:
				System.out.println("종료");
				System.exit(1);
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;

			}
		}

	}
}
