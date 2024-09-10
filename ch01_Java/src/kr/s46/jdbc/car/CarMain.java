package kr.s46.jdbc.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
	
	private BufferedReader br;
	private CarDAO dao;
	//생성자
	public CarMain() {
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			//carDAO 객체 생성
			dao = new CarDAO();
			
			//메뉴 호출
			callMenu();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}
	
	//메뉴
	public void callMenu() throws IOException{
		
		while(true) {
			
			System.out.print("1.자동차정보등록, 2.목록보기 3. 상세정보, 4.정보 수정 ,5.정보삭제, 6.종료");
			
			 try {
	                int no = Integer.parseInt(br.readLine());
	                if(no == 1) { //자동차정보등록
	                	
	                  System.out.print("이름 : ");
	                  String name = br.readLine();
	                  System.out.print("색상 : ");
	                  String color = br.readLine();
	                  System.out.print("제조사 : ");
	                  String maker = br.readLine();
	                  System.out.print("가격 : ");
	                              //String -> int
	                  int price = Integer.parseInt(br.readLine());
	                  
	                  //CarDAO의 insertCar 메서드를 호출해서 입력받은 데이터 전달
	               
	                  dao.insertCar(name, color, maker, price);
	                 
	                    
	                }else if(no == 2) { //목록보기
	                	
	                    System.out.println("목록보기");
	                    
	                    dao.selectCar();
	                    
	                }else if(no == 3) { //상세정보
	                    System.out.println("상세정보");
	                    
	                    dao.selectCar();
						
						System.out.print("선택한 자동차 관리 번호 : ");
						int num = Integer.parseInt(br.readLine());
						System.out.println("---------------------------------");
						dao.selectDetailCar(num);

	                    
	                    
	                }else if(no ==4) { //정보수정
	                	
	                    System.out.println("정보수정");
	                    
	                    
	                  //목록보기
						dao.selectCar();

						
						System.out.print("수정할 자동차 관리 번호 : ");
						
						
						int num = Integer.parseInt(br.readLine());
						int count = dao.selectDetailCar(num);
						
						if(count ==1) {
							System.out.println("------------------------------------");
							
							System.out.print("이름 :");
							String name = br.readLine();
							System.out.print("색상 :");
							String color = br.readLine();
							System.out.print("제조사 :");
							String maker = br.readLine();
							System.out.print("가격 : ");
							int price = Integer.parseInt(br.readLine());
					
							dao.updateCar(num, name, color, maker, price);
							
						}

	                }else if(no ==5) {//정보삭제
	                	
	                    System.out.println("정보삭제");
	                    
	                  //목록 보기
						
						dao.selectCar();
						System.out.println("삭제할 자동차 번호 : ");
						int num = Integer.parseInt(br.readLine());
						
						dao.deleteCar(num);
						
	                    
	                    
	                }else if(no ==6) {//종료
	                	
	                    System.out.println("프로그램을 종료합니다");
	                    break;
	                }else {
	                    System.out.println("잘못 입력했습니다.");
	                }
	            }catch(NumberFormatException e) {
	                System.out.println("[숫자만 입력 가능]");
			}finally {
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		  new CarMain();
		
	}

}
