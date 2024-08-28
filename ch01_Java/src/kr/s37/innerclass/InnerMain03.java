package kr.s37.innerclass;

public class InnerMain03 {
    
    public void innerTest() {
        //로컬내부클래스
        class Inner{
            public void getData() {
                System.out.println("Local 내부클래스");
            }
        }
        //로컬 내부 클래스 객체 생성
        Inner i = new Inner();
        i.getData();
    }
    
    public static void main(String[] args) {
        InnerMain03 im = new InnerMain03();
        im.innerTest();
    }

}