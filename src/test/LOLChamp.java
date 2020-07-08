package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LOLChamp {
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "LOLChamp [name=" + name + ", power=" + power + "]";
	}
	
	public static void main(String[] args) {
		String[] names = {"티모","나미","람머스","나무","징크스","애쉬"};
		List<LOLChamp> lolList = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<names.length;i++) {
			LOLChamp ch = new LOLChamp();
			ch.setName(names[i]);
			ch.setPower(r.nextInt(51)+50);
			lolList.add(ch);
		}
		LOLChamp jjang = new LOLChamp();
		jjang = lolList.get(0);
		for(int i=1;i<lolList.size();i++) {
			if(jjang.getPower()<lolList.get(i).getPower()) {
				jjang = lolList.get(i);
			}
		}
		System.out.println(lolList);
		System.out.println("짱 : " + jjang);
	}
}
