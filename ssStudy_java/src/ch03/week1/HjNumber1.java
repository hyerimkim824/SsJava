package ch03.week1;

public class HjNumber1{
    /*
     * 1. 입력스캐너 생성-영문 소문자 입력
     * 2. if문 생성-1.알파벳이 아닌 것 입력시 거르기
     *              ->아스키 코드 a~z:97~122(아스키 코드 'a' = 97)
     *            2. 알파벳 배열 생성
     *            3.알파벳 입력시 순위가 낮은 모든 문자 출력
     *            4. 출력되었던 문자열의 첫번째 문자 삭제하고 나머지 문자 출력     
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner input = 
                new java.util. Scanner(System.in);

        System.out.print("알파벳 한 문자를 입력하세요>>");
        String a = input.next();
        char[] array = new char[26];//a~z 알파벳 배열 생성
        char first = a.charAt(0);//생성된 배열의 첫번째 값 가져옴
        
        

        if(first < 'a' || first > 'z' ) {
            System.out.print("알파벳을 입력하시오.");
        }

        for(int i=0;i<array.length;i++) 
            array[i] = (char)('a'+i);//알파벳 배열 생성

        int num = first - 'a';//입력 문자 위치 찾기

        for(int i = 0; i <= num ; i++) {
        
            for(int j = i; j <= num; j++) {
                System.out.print(array[j]);
               
                
            }
            System.out.println();





            input.close();


        }
    }
}
