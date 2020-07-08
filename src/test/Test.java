package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Map<String,String> strMap = new HashMap<>();
		strMap.put("1", "일");
		strMap.put("2", "이");
		strMap.put("3", "삼");
		strMap.put("4", "사");
		Iterator<String> keys = strMap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = strMap.get(key);
			System.out.println(key + "," + value);
		}
		
	}

}
