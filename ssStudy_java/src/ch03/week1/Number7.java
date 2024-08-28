package ch03.week1;

public class Number7 {
	public static void main(String[] args) {

		int num =0;
		while(num <100) {
			
		
			for(int i=1; i<10;i++) {
			
				if(num==0||(num%3!=0)) {
				if(i%3==0) {
					System.out.printf("%d 박수한번\n",num+i);
				}}
				if((num!=0)&(num%3==0)) {
					
					if(i%3==0) {
						System.out.printf("%d 박수두번\n",num+i);
					}else {System.out.printf("%d 박수한번\n",num+i);
			}
			

		}
			}
			num+=10;}
	}
	}
