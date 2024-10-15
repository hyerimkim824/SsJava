//Hye Rim Kim

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class XYZMart{
	//declare value of input 
	private String[] want;
	private int[] number;
	private String[] discount;
	
	HashMap<Integer,String> discountMap = new HashMap<Integer,String>();
	
	//getter, setter method

	public void setWant(String[] w) {
		this.want = w;
	}

	public String[] getWant(){
		return want;
	}
	public void setNumber(int[] n) {
		this.number = n;
	}
	public int[] getNumber(){
		return number;
	}
	public void setDiscount(String[] d) {
		this.discount = d;
	}

	public String[] getDiscount(){
		return discount;
	}

	//make hashmap key : index, value : name
	public void makeHash() {
		
		String[] d = this.discount;
		for(int i=0;i<d.length;i++) {

			discountMap.put(i,d[i]);
		}
	}
	
	public void solution() {
		
		ArrayList<String> fullWant = new ArrayList<>();
		ArrayList<Integer> numberList  = new ArrayList<>();
		Collection<String> values = discountMap.values();
		

		for(int i=0; i<number.length;i++) {
			for(int j =0; j< number[i];j++) {
				fullWant.add(want[i]);
			}
			
		}
	
		for(int i=0; i<fullWant.size();i++) {
			String food = fullWant.get(i);
	
				for (int key : discountMap.keySet()) {
			        if (discountMap.get(key) == food) {
			            numberList.add(key);
			        }
			    }
				
			}
		
		
		
		System.out.println(discountMap);
		System.out.println(fullWant);
		System.out.println(numberList);
	
	}
	
}


public class Question3 {
	
	public static void main(String[] args) {
		
		XYZMart m1 = new XYZMart();
		
		String[] w1 = {"banana","apple","rice","pork","pot"};
		int[] n1 = {3,2,2,2,1};
		String[] d1 = {"chicken","apple","apple","banana","rice","apple","pork"
				,"banana","pork","rice","pot","banana","apple","banana"};
		
		m1.setWant(w1);
		m1.setNumber(n1);
		m1.setDiscount(d1);
		
		m1.makeHash();
		m1.solution();
		
		
	}
	


}
