package ch04.week2;
import java.util.*;

//This question is number4 question of practice 4th


class Phone2{
	
	String name;
	String phoneNumber;
	
	public Phone2(String name1, String num) {
		this.name = name1;
		this.phoneNumber = num;
		
	}
	
		
}
	


public class PhoneManager {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("인원수>>");
		
		int countNum = input.nextInt();
		
		Phone2 [] p = new Phone2[countNum];
		
		for(int i =0; i<p.length;i++) {
			
			System.out.print("이름과 전호번호(번호는 연속적으로 입력)>>>");
			String name = input.next();
			String phoneNum = input.next();
			
			p[i] = new Phone2(name, phoneNum);
			
			if(i==p.length-1) {
				System.out.println("저장되었습니다...");
			}
		}
		
		while(true) {
			
			System.out.print("검색할 이름>>");
			
			String searchName = input.next();
			
			if(searchName.equals("exit")) {
				System.out.println("프로그램을 종료합니다....");
				break;}
			
			for(int j=0; j<p.length;j++) {
				
				if((p[j].name).equals(searchName)) {
					
					System.out.println(p[j].name+"의 번호는 "+p[j].phoneNumber+"입니다");
				
					break;
				}
				else {
					
					if(j==p.length-1) {
					System.out.println(searchName+"이 없습니다.");	}		
				}
				}
		}
			
	input.close()	;					

	}
}
			
		
		
		
		

		
		
	


