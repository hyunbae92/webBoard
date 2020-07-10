package iteratorTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class IteratorTest1 {
//0-100 랜덤값을 키값으로 주고 키값에 조건을 달아 85 이상이면 true 이하면 false 가 되게하고 점수 평균내기
	public static void main(String[] args) {
		Map<Float, Boolean> map = new HashMap<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			float val = r.nextFloat() * 100;
			if (val >= 85) {
				map.put(val, true);
			} else {
				map.put(val, false);
			}
		}
		Iterator<Float> it = map.keySet().iterator();
		float sum = 0f;
		while(it.hasNext()) {
			float key = it.next();
			sum = sum + key;
			System.out.println(key + " : " + map.get(key));
		}
		float avg = sum / map.size();
		System.out.println(avg);
	}
}
