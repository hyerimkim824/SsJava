package kr.s27.collection.product;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
	private ArrayList<Product> list;
	private BufferedReader br;
	
	public ProductMain() {
		
		list = new ArrayList<Product>();
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
	
	public void callMenu() throws IOException{ //exception이 발생하면 loop를 돈다.
		
		while(true) {
			System.out.print("1.상품입력, 2.상품몰록보기, 3. 종료>>");
			try {
				           //String -> int
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //상품 입력
				}else if(num ==2) {
					output();
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
	public void input() throws IOException{
		Product p =new Product();
		System.out.print("상품명 : ");
		p.setName(br.readLine());
		System.out.print("상품번호 : ");
		p.setNum(br.readLine());
		System.out.print("가격 : ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("제조사:");
		p.setMaker(br.readLine());	
		System.out.print("제고:");
		p.setStock(Integer.parseInt(br.readLine()));
		
		//Product를 ArrayList에 저장
		list.add(p);
		System.out.println("상품정보 1건이 추가되었습니다.");
		
		}

	
	//상품 정보 출력
	public void output() {
		System.out.println("상품 리스트 : 총 상품수 ("+list.size()+")");
		System.out.println("상품번호\t상품명\t가격\t제조사\t재고수");
		
		
		/*for문 이용
		for(int i=0;i<list.size();i++) {
			Product pt = list.get(i);
			System.out.printf("%s\t", pt.getNum());
			System.out.printf("%s\t",pt.getName());
			System.out.printf("%,d원\t",pt.getPrice());
			System.out.printf("%s\t", pt.getMaker());
			System.out.printf("%,d%n",pt.getStock());
		}*/
		
		//확장 for문
		for(Product pt : list) {
			
			System.out.printf("%s\t", pt.getNum());
			System.out.printf("%s\t",pt.getName());
			System.out.printf("%,d원\t",pt.getPrice());
			System.out.printf("%s\t", pt.getMaker());
			System.out.printf("%,d%n",pt.getStock());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new ProductMain(); //생성자 호출
	}
	
	

}
