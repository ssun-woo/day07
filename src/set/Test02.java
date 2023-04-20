package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String n = null;
		String p = null;
		while (true) {

			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("========");
				System.out.println("연락처 등록");
				System.out.println("========");
				System.out.print("이름을 입력하세요 :");
				n = scan.next();

				if (name.size() == 0) {
					name.add(n);
					System.out.print("전화번호를 입력하세요 : ");
					p = scan.next();
					phone.add(p);
					System.out.println("연락처가 등록됐습니다");
				} else {
					for (int i = 0; i < name.size(); i++) {
						if (n.contains(name.get(i))) {
							System.out.println("이미 등록된 이름입니다");
							break;
						} else {
							System.out.print("전화번호를 입력하세요 : ");
							p = scan.next();
							for (int j = 0; j < phone.size(); j++) {
								if (p.contains(phone.get(j))) {
									System.out.println("이미 등록된 전화번호 입니다");
									break;
								} else {
									name.add(n);
									phone.add(p);
									System.out.println("정상적으로 등록됐습니다");
									break;
								}
							}
							break;
						}
					}
				}
				System.out.println(name);
				System.out.println(phone);

				break;
			case 2:
				System.out.println("========");
				System.out.println("연락처 보기");
				System.out.println("========");

				System.out.print("이름을 입력하세요 :");
				n = scan.next();

				if (name.size() == 0) {
					System.out.println("등록된 연락처가 없습니다");
				} else {
					for (int i = 0; i < name.size(); i++) {
						if(n.contains(name.get(i))) {
							System.out.println("이름 : " + name.get(i));
							System.out.println("번호 : " + phone.get(i));
							break;
						}else {
							System.out.println("목록에 없는 이름입니다");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("========");
				System.out.println("연락처 삭제");
				System.out.println("========");
				
				System.out.print("이름 입력 : ");
				n = scan.next();
				
				if(name.size() == 0) {
					System.out.println("등록된 연락처가 없습니다");
				}else {
					if(name.contains(n)) {
						
					}
				}
				
				
				break;
			case 4:
				System.out.println("모든 연락처 보기");
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

