package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("age", 10);
		for(int i=map.get("age")+1;i<51;i++) {
			map.put("age",map.get("age")+i);
		}
		System.out.println(map.get("age"));
	}
}