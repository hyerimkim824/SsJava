package kr.s14.object.lang;




public class StringMain02 {
	public static void main(String[] args) {

		String s1 = "Kwon Sun Ae";
		           //012345678910, 길이 =11
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치"+index);
		
		index = s1.indexOf("Sun");
		System.out.println("맨 처음 문자 n의 위치"+index);
		
		index = s1.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치 : "+index);
		
		char c = s1.charAt(index); //문자 추출
		System.out.println("추출한 문자 : "+c);
		
		
		index = s1.indexOf('S'); //소문자 s는 없기 때문에 -1을 반환하도록 되어있다.
		System.out.println(index);
		
		//지정한 인덱스로부터 마지막 인덱스까지의 문자열 반환
		String str = s1.substring(index);
		System.out.println("대문자 S 부터 끝까지 잘라내기 : "+str);
		
		//시작 인덱스부터 끝 인덱스전까지의 문자열 반환
		                   //5       8 : 
		str = s1.substring(index, index+3);

		System.out.println("대문자 S부터 시작해서 지정한 끝 인덱스 전까지의 문자열 반환 :" +str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : "+length);
		
		//구분자를 이용해서 문자열을 추출
		String[] array = s1.split(" ");
		//공백으로 구분해서 배열 안에 넣는다.
		//공백이 아니라 붙여서 넣으면 빈문자를 지정하게 된다.
		//(빈 문자 : 실제로는 데이터가 없는데 형식적인 문자다.)
		for(int i=0;i<array.length;i++) {
			
			System.out.println("array["+i+"] : "+array[i]);
			
		}
		
		
		
		
		
		
		
	}
}
