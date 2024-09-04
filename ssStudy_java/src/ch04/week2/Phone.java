package ch04.week2;
import java.util.*;

//This question is number2 question of practice 4th

//class of Phone is given by number2 question
public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		
		//Since question number2 describes input system,
		//we should use any input packages
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름과 전화번 입력 >>");
		String n1 = input.next();//first name variable
		String pn1 = input.next();//first phone number variable
		
		System.out.print("이름과 전화번 입력 >>");
		String n2 = input.next(); //second name variable
		String pn2 = input.next();//second phone number variable
		
		
		//declare Phone as p1
		Phone p1 = new Phone(n1, pn1);
		System.out.println(p1.getName()+"의 번호 "+p1.getTel());
		//declare Phone as p2
		Phone p2 = new Phone(n2,pn2);
		System.out.println(p2.getName()+"의 번호 "+p2.getTel());
		
		input.close();
				
				
	
	}

}
