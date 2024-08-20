package kr.s14.object.lang;

public class StringMain01 {


	public static void main(String[] args) {

		//암시적으로 문자열 생성

		String str1 = "abc";
		String str2 = "abc";

		//객체 비교
		//비교 연산자는 객체 비교를 하는 것이다.
		if(str1 ==str2) {
			System.out.println("str1과 str2는 같은 객체");}

		else {
			System.out.println("str1과 str2는 다른 객체");
		}

		//문자열 비교
		//equals를 이용해서 문자열을 비교한다.


		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 내용이 같다.");
		}else {
			System.out.println("str1과 str2의 내용이 다르다.");
		}

		System.out.println("--------------------------");
		//명시적으로 문자열 생성
		String str3 = new String("Hello");
		String str4 = new String("Hello");


		//객체 비교
		if(str3 ==str4) {
			System.out.println("str3롸 str4는 같은 객체");
		}else {
			System.out.println("str3와 str4는 다른 객체");
		}
		//문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str1과 str2의 내용이 같다.");
		}else {
			System.out.println("str1과 str2의 내용이 다르다.");
		}
		

		System.out.println("--------------------------");

		String str5 = "bus";
		String str6 = "BUS";

		//문자열 비교
		if(str5.equals(str6)) {
			System.out.println("str1과 str2의 내용이 같다.");
		}else {
			System.out.println("str1과 str2의 내용이 다르다.");
		}



	}


}


