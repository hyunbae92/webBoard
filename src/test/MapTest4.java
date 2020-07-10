package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
	public static void main(String[] args) {
		Map<String,String[]> param = new HashMap<>();
		String[] strs = new String[5];
		param.put("name",strs);
	}
}
