package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 회원 등록 프로그램 만들기
		// 이름은 같을수 있고, 번호는 달라야한다
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> tel = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		ArrayList<String> address = new ArrayList<>();
		ArrayList<Integer> logCount = new ArrayList<>();
		Iterator<String> it = address.iterator();
		Scanner scan = new Scanner(System.in);
		String n, t, i, p, a, grade = null;
		int lc;
		// 회원등급 만들어서 회원 정보 확인때 같이 출력하기
		// 로그인 횟수 1~5회 Normal, 6~10회 VIP, 11회 이상 VVIP

		while (true) {

			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 아이디 찾기");
			System.out.println("4. 비밀번호 찾기");
			System.out.println("5. 회원 정보 보기");
			System.out.println("6. 지역별 회원 보기");
			System.out.println("7. 회원 정보 삭제");
			System.out.println("8. 모든 회원 보기");
			System.out.println("9. 종료");
			System.out.print(">>>");
			int choice = scan.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("========");
				System.out.println("회원가입");
				System.out.println("========");

				System.out.print("아이디 : ");
				i = scan.next();

				if (id.contains(i)) {
					System.out.println("이미 등록된 회원입니다 로그인 해주세요");
				} else {
					System.out.print("이름 : ");
					n = scan.next();

					while (id.contains(i)) {// true
						System.out.println("이미 등록된 아이디 입니다 다른 아이디를 입력해주세요");
					}
					System.out.print("비밀번호 : ");
					p = scan.next();
					
					
					while(true) {
						System.out.print("주소 : ");
						a = scan.next();
						while((a.equals("서울") || a.equals("경기") || a.equals("충청") || a.equals("경상") || a.equals("전라") || a.equals("제주")) == false) {
							System.out.println("주소는 서울, 경기, 충청, 경상, 전라, 제주 만 입력 가능합니다");
							System.out.print("주소 : ");
							a = scan.next();
						}
						break;
					}
					
					while (true) {
						System.out.print("전화번호 : ");
						t = scan.next();
						while (tel.contains(t)) {
							System.out.println("이미 등록된 번호 입니다 다른 번호를 입력해주세요");
							System.out.print("전화번호 : ");
							t = scan.next();
						}
						break;
					}
					id.add(i);
					pwd.add(p);
					address.add(a);
					tel.add(t);
					name.add(n);
					logCount.add(0);
					System.out.println("회원등록 됐습니다 로그인 해주세요");
				}
				break;
			case 2:
				System.out.println("========");
				System.out.println("로그인");
				System.out.println("========");

				System.out.print("아이디 : ");
				i = scan.next();
				System.out.print("비밀번호 : ");
				p = scan.next();

				if (!id.contains(i)) {
					System.out.println("등록되지 않은 아이디 입니다 다시 확인해주세요");
				} else {
					if (pwd.get(id.indexOf(i)).equals(p) == false) {
						System.out.println("비밀번호가 일치하지 않습니다 다시 확인해주세요");
					} else {
						System.out.println(name.get(id.indexOf(i)) + "님 환영합니다");
						int idIn = id.indexOf(i);
						logCount.set(idIn, logCount.get(idIn)+1);
						System.out.println(logCount);
					}
				}
				break;
			case 3:
				System.out.println("========");
				System.out.println("아이디 찾기");
				System.out.println("========");

				System.out.print("이름을 입력해주세요 : ");
				n = scan.next();
				System.out.print("전화번호를 입력해주세요 : ");
				t = scan.next();

				if (!name.contains(n)) {
					System.out.println("해당하는 이름이 없습니다 다시 확인해주세요");
				} else if (!tel.contains(t)) {
					System.out.println("해당하는 전화번호가 없습니다 다시 확인해주세요");
				} else {
					System.out.println("아이디는 " +"\"" +id.get(tel.indexOf(t))+ "\"" + " 입니다");
				}
				break;

			case 4:
				System.out.println("===============");
				System.out.println("비밀번호 찾기");
				System.out.println("===============");
				
				System.out.print("이름을 입력해주세요 : ");
				n = scan.next();
				System.out.print("아이디를 입력해주세요 : ");
				i = scan.next();
				System.out.print("전화번호를 입력해주세요 : ");
				t = scan.next();
				
				if(!name.contains(n)) {
					System.out.println("해당하는 이름이 없습니다 다시 확인해주세요");
				}else if(!tel.contains(t)) {
					System.out.println("해당하는 전화번호가 없습니다 다시 확인해주세요");
				}else if(!id.contains(i)) {
					System.out.println("해당하는 아이디가 없습니다 다시 확인해주세요");
				}else {
					System.out.println("비밀번호는 " + "\"" + pwd.get(tel.indexOf(t)) + "\"" + "입니다");
				}
				break;
				
				
			case 5:
				System.out.println("========");
				System.out.println("회원 정보 보기");
				System.out.println("========");

				if (name.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				} else {
					System.out.print("아이디를 입력하세요 : ");
					i = scan.next();
					if (id.contains(i)) {
						t = tel.get(id.indexOf(i));
						n = name.get(id.indexOf(i));
						a = address.get(id.indexOf(i));
						System.out.println("이름 : " + n);
						System.out.println("번호 : " + t);
						System.out.println("주소 : " + a);
						int count = logCount.get(id.indexOf(i));
						if(count <= 5) {
							grade = "Normal";
						}else if(count <= 10 ) {
							grade = "VIP";
						}else {
							grade = "VVIP";
						}
						System.out.println("등급 : " + grade);
					} else {
						System.out.println("등록되지 않은 이름입니다");
					}
				}
				break;
			case 6:
				System.out.println("===============");
				System.out.println("지역별 회원 보기");
				System.out.println("===============");
				
				
				System.out.println("지역을 입력해주세요");
				System.out.println("ex) 서울 경기 충청 경상 전라 제주");
				a = scan.next();
				
				
//				if(a.equals(it.)) {.............
//					if(it.hasNext()) {
//						System.out.println(it.next());
//					}
//				}
				break;
			case 7:
				System.out.println("========");
				System.out.println("회원 정보 삭제");
				System.out.println("========");
				if (name.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				} else {
					System.out.print("아이디를 입력하세요 : ");
					i = scan.next();
					if (id.contains(i)) {
						logCount.remove(id.indexOf(i));
						address.remove(id.indexOf(i));
						pwd.remove(id.indexOf(i));
						name.remove(id.indexOf(i));
						tel.remove(id.indexOf(i));
						id.remove(i);
						System.out.println("회원이 정보가 삭제됐습니다");
					} else {
						System.out.println("등록되지 않은 아이디 입니다");
					}
				}
				break;
			case 8 : 
				System.out.println("=============");
				System.out.println("모든 회원 보기");
				System.out.println("=============");
				grade = null;
				if(id.isEmpty()) {
					System.out.println("등록된 목록 없습니다");
				}else {
					for(int j=0; j<id.size(); j++) {
						System.out.println("-------------");
						System.out.println("이름 : " + name.get(j));
						System.out.println("번호 : " + tel.get(j));
						System.out.println("주소 : " + address.get(j));
						if(logCount.get(j) <= 5) {
							grade = "Normal";
						}else if(logCount.get(j) <= 10) {
							grade = "VIP";
						}else {
							grade = "VVIP";
						}
						System.out.println("등급 : " + grade);
						System.out.println("-------------");
					}
				}
				break;
			case 9:
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
