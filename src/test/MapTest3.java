package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<Double,String> map = new HashMap<>();
		map.put(3.3, "삼쩜삼");
		map.put(2345.3324,"이삼사오쩜삼삼이사");
		map.put(533.4,"오삼삼쩜사");
		map.put(1546.1234,"일오사육쩜일이삼사");
		Iterator<Double> it = map.keySet().iterator();
		while(it.hasNext()) {
			Double key = it.next();
			System.out.println(key +" : " + map.get(key));
		}
	}
}
