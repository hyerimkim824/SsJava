package kr.s05.object.method;


/*
 * [실습]
 * Worker
 * 1)멤버 변수 : 직원 이름(name), 급여(money) 계좌 잔고(balance)
 * 2)멤버 메서드 : work(실행하면 money에 1000원 누적)
 *             deposite(실행하면 돈을 balance에 누적시키고 money는 0으로 처리) 
 *             
 *WorkerAmin의 main
 *1)Worker 개체 생성
 *2)직원의 이름 지정
 *3)10번 일하는데 번 돈이 3000원일 때마다 계좌에 저축
 *4)직원 이름, 현재 계좌에 임금되지 않고 남아 있느 급여(money),계좌 잔고(balance)를 출력하시오.
 */



class Worker{
	
	//멤버 변수
	String name;
	int money;
	int balance;
	
	//work 실행하면 1000원 누적
	public void work() {
		money +=1000;
	}
	
	public void deposite() {
		balance += money;
		money = 0; //money는 0으로 초기화
	}
	
}

public class MethodMain07 {
	/*
	 * [실습]
	 * Worker
	 * 1)멤버 변수 : 직원 이름(name), 급여(money) 계좌 잔고(balance)
	 * 2)멤버 메서드 : work(실행하면 money에 1000원 누적)
	 *             deposite(실행하면 돈을 balance에 누적시키고 money는 0으로 처리) 
	 *             
	 *WorkerMain의 main
	 *1)Worker 개체 생성
	 *2)직원의 이름 지정
	 *3)10번 일하는데 번 돈이 3000원일 때마다 계좌에 저축
	 *4)직원 이름, 현재 계좌에 임금되지 않고 남아 있는 급여(money),계좌 잔고(balance)를 출력하시오.
	 */
	
	
	public static void main(String[] args) {
		
		java.util.Scanner input = //입력 받을 Scanner 형성
				new java.util.Scanner(System.in);
		
		//Worker 객체 생성
		Worker w = new Worker();
		System.out.print("직원 이름 : "); //직원 이름 저장
		
		w.name = input.nextLine();
		w.money = 0; //0으로 초기화
		w.balance = 0;
		
		int i =0;
		while(i ++<10) {
			w.work();
			
			if(w.money==3000){
				
			w.deposite();}

		
	}
	
	System.out.println("10번 일한 후 잔고");
	System.out.println("-----------------");
	System.out.println("입금되지 않고 남아있는 급여 : "+w.money);
	System.out.println("계좌 잔고 : "+w.balance);
	input.close();

}
}
