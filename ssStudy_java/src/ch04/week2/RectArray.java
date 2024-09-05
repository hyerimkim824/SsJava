package ch04.week2;
import java.util.*;


//This question is number4 question of practice 4th
//Use Rect class which is provided by question number3
class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//declare getArea method which calculate area of rectangular 
	public int getArea() {return width*height;}
	

}


public class RectArray {
	public static void main(String[] args) {
		
		//use scanner package to put input data
		Scanner input = new Scanner(System.in);
		
		Rect [] r =new Rect[4];
		
		for(int i=0; i<r.length;i++) {
			
			System.out.print("너비와 높이 >>");
			int w = input.nextInt();
			int h = input.nextInt();
			
			r[i] = new Rect(w,h);
			}
		System.out.println("저장하였습니다...");
		
		System.out.print("시긱향 잔체 합은 : ");
		
		int result = 0;
	
		
		for(int i = 0; i<r.length;i++) {
			
			
			result += r[i].getArea();
			
	
			
			}
		
		
		System.out.print(result);
		
			
		input.close();
			
		}

		
	}
	

	

