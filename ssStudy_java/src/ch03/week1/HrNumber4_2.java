package ch03.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HrNumber4_2 {
    public static void main(String[] args) throws Exception {
       
        try {
        	 BufferedReader br = null;
             br = new BufferedReader(new InputStreamReader(System.in));
             String[] day = {"일","월","화","수","목","금","토"};
             System.out.print("정수를 입력하세요>>");
             int num = Integer.parseInt(br.readLine());
            if(num>=7) {
                int a = (num%7);
                System.out.println(day[a]);
            }else if(num<7) {
                System.out.println("프로그램을 종료합니다...");
            }
        }catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("---------------------");
            System.out.println("예외메세지 : "+e.getMessage());
        }
    }
}

