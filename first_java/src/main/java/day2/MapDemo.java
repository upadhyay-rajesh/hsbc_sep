package day2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> m = new HashMap<Integer ,Integer>();
		m.put(2,3);
		m.put(4, 5);
		
		System.out.println(m.get(2));
	}

}
