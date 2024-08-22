package kr.s20.inter;

interface I{
	public abstract void play();
}

class Pianist implements I{
	@Override
	public void play() {
		System.out.println("피아노를 연주하다.");
	}
}

class Cellist implements I{
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
	
	
}

class Stage{
	public void autoPlay(I i){//I 타입으로 객체가 전달된다.
		i.play();
		
	}
}


public class InterMain05 {
	public static void main(String[] args) {
		Stage a = new Stage();
		a.autoPlay(new Pianist());
		a.autoPlay(new Cellist());
		
		
	}

}
