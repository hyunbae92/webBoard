package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,Object> lolCham = new HashMap<>();
		lolCham.put("name", "애쉬");
		lolCham.put("power", 30);
		lolCham.put("defense", 50);
		lolCham.put("level", 10);
		lolCham.put("speed", 300);
		Iterator<String> it = lolCham.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + lolCham.get(key));
		}
	}

}
