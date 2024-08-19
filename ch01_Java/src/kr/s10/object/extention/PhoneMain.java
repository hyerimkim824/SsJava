package kr.s10.object.extention;

public class PhoneMain {
	
	public static void main(String[] args) {
		SmartPhone sp = 
				new SmartPhone("010-1234","A1001","white","안드로이드");
		
		FeaturePhone fp = new FeaturePhone("010-5432","B1001","black",800);
		
		System.out.println("------------------------------");
		System.out.println("번호\t모델\t색상\t특징(os/화소수)");
		System.out.println("------------------------------");
		System.out.print(sp.getNumber()+"\t");
		System.out.print(sp.getModel()+"\t");
		System.out.print(sp.getColor()+"\t");
		System.out.print(sp.getOs()+"\n");
		
	
		System.out.print(fp.getNumber()+"\t");
		System.out.print(fp.getModel()+"\t");
		System.out.print(fp.getColor()+"\t");
		System.out.print(fp.getPixel()+"\t");
		
		
	}

}
