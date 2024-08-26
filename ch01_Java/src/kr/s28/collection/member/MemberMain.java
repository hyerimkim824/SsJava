package kr.s28.collection.member;
//import
import java.util.ArrayList;

import kr.s27.collection.product.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MemberMain {
	
	/*
	 * [실습]
	 * 메뉴 : 1.회원정보 입력, 2.회원정보 출력, 3.종류
	 * 메서드명 : 메뉴 callMenu(), 회원정보 입력 register(),
	 *         회원정보 출력 printUserInfo()
	 * 입력시 조건 체크 : 나이는 1살 이상 입력 가능
	 * 
	 */
	private ArrayList<Member> list;
	private BufferedReader br;
	
	//생성자
	
	public MemberMain() {
		
		list = new ArrayList<Member>();
		try { 
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			
			//Exception  메세지 출력
			e.printStackTrace();
			
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}
	
	/*
	 * [실습]
	 * 메뉴 : 1.회원정보 입력, 2.회원정보 출력, 3.종류
	 * 메서드명 : 메뉴 callMenu(), 회원정보 입력 register(),
	 *         회원정보 출력 printUserInfo()
	 * 입력시 조건 체크 : 나이는 1살 이상 입력 가능
	 * 
	 */
	public void callMenu() throws IOException{
		
		while(true) {
			System.out.print("1.회원 정보 입력, 2.회원 정보 출력, 3. 종료 >> ");
			try {
				//String -> int
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					register(); //상품 입력
				}else if(num ==2) {
					printUserInfo();
				}else if(num==3) {
					System.out.println("프로그램 종료");
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");

			}
		}

	}
	
	public void register() throws IOException{
		
		Member m =new Member();
		System.out.print("회원이름 : ");
		m.setName(br.readLine());
		System.out.print("나이 : ");
		
		//나이 설정
		while(true) {
		int age = Integer.parseInt(br.readLine());
		if(age<=0) {System.out.print("잘못 입력하셨습니다. 다시 입력하세요 : ");}
		else{m.setAge(age);
		break;}}
		
		System.out.print("직업 : ");
		m.setJob(br.readLine());
		System.out.print("주소:");
		m.setAddress(br.readLine());	
		System.out.print("휴대폰 번호:");
		m.setPhone(br.readLine());
		
		//Product를 ArrayList에 저장
		list.add(m);
		System.out.println("회원정보 1건이 추가되었습니다.");
		
		}
		

	public void printUserInfo() {
		
		System.out.println("회원 리스트 : 총 회원수 ("+list.size()+")");
		System.out.println("회원이름\t나이\t직업\t주소\t휴대폰 번호");
		
	
		//확장 for문
		for(Member m2 : list) {
			
			System.out.printf("%s\t", m2.getName());
			System.out.printf("%d\t",m2.getAge());
			System.out.printf("%s\t",m2.getJob());
			System.out.printf("%s\t", m2.getAddress());
			System.out.printf("%s%n",m2.getPhone());
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		new MemberMain();
		
	}
	
	

}
