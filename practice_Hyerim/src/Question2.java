//Hye Rim Kim
//Qustion 19

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


//make Marathon class to declare solution methond
class Marathon{
	
	//input participant array
	private String[] p;
	//input completion array
	private String[] c;
	//to use hashmap's key and value, declare two(map1,map2) hashmap
	HashMap<Integer,String> map1 = new HashMap<Integer,String>();
	HashMap<Integer,String> map2 = new HashMap<Integer,String>();
	
	//getter, setter method
	public void setP(String[] p) {
		this.p = p;
	}

	public String[] getP() {
		return p;
	}

	public void setC(String[] c) {
		this.c = c;
	}

	public String[] getC() {
		return c;
	}

	//make hashmap key : name, value : index
	public void makePHash(String[] p) {

		for(int i=0;i<p.length;i++) {

			map1.put(i,p[i]);
		}
	}

	public void makeCHash(String[] c) {

		for(int i=0;i<c.length;i++) {

			map2.put(i,c[i]);	
		}
	}

	public void solution(){

		//iterator to make loop of key
		Iterator<Integer> keys2 = map2.keySet().iterator();	
	

		//during loop of key, we can search key of given condition
		//which make output of the name who cannot complete marathon
		while(keys2.hasNext()) {

			int key2 = keys2.next();
			String name = map2.get(key2);
			if(map1.containsValue(name)==true) {

				map1.values().remove(name);					
			}
		}
		
		System.out.println( map1.values());


	}
}

public class Question2 {
	
	public static void main(String[] args) {
		
		//delcare constructor
		Marathon m1 = new Marathon();
		Marathon m2 = new Marathon();
		
		//example 1
		String[] p1 = {"marina","joispa","nikola","vinko","fillpa"};
		String[] c1 = {"joispa","fillpa","marina","nikola"};
		m1.setP(p1);
		m1.setC(c1);
		
		m1.makePHash(p1);
		m1.makeCHash(c1);
		
		m1.solution();
		
		//example 2
		String[] p2 = {"mislav","stanko","mislav","ana"};
		String[] c2 = {"stanko","mislav","ana"};
		m2.setP(p2);
		m2.setC(c2);
		
		m2.makePHash(p2);
		m2.makeCHash(c2);
		
		m2.solution();
	}
	
}
