package iteratorTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Champ {
	private String name;
	private int defence;
	private int power;
	private int hp;
	
	@Override
	public String toString() {
		return "Champ [name=" + name + ", defence=" + defence + ", power=" + power + ", hp=" + hp + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
public class IteratorTest2 {

	public static void main(String[] args) {
		Map<String, Champ> map = new HashMap<>();
		String[] chamName = {"이즈리얼","아펠리오스","트리스타나","케이틀린","징크스","바루스"};
		Random r = new Random();
		for(int i=0;i<chamName.length;i++) {
			String name = chamName[r.nextInt(chamName.length)];
			if(map.containsKey(name)) {
				i--;
				continue;
			}
			Champ c = new Champ();
			c.setName(name);
			c.setPower(r.nextInt(150)+101);
			c.setDefence(r.nextInt(40)+41);
			c.setHp((r.nextInt(6)+5)*100);
			map.put(c.getName(), c);
		}
		List<Champ> chaList = new ArrayList<>();
		for(;chaList.size()<2;) {
			
			chaList.add(map.get(chamName[r.nextInt()]));
		}
	}
}










