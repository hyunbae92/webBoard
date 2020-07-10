package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food {
	private String name;
	private int price;
	private String local;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", local=" + local + "]";
	}

}

public class ListTest4 {

	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = { "한식", "양식", "중식", "일식", "분식", "경양식" };
		Random r = new Random();
		for (int i = 1; i <= 30; i++) {
			Food f = new Food();
			f.setLocal(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10) + 1) * 1000);
			fList.add(f);
			System.out.println(f);
		}
		List<Food> exFList = new ArrayList<>();
		List<Food> chFList = new ArrayList<>();
		Food exF = fList.get(0);
		Food chF = fList.get(0);
		for (int i = 1; i < fList.size(); i++) {
			if (exF.getPrice() < fList.get(i).getPrice()) {
				exF = fList.get(i);
			}
			Food f = fList.get(1);
			if (chF.getPrice() > fList.get(i).getPrice()) {
				chF = fList.get(i);
			}
		}
		for (int i = 0; i < fList.size(); i++) {
			if (exF.getPrice() == fList.get(i).getPrice()) {
				exFList.add(fList.get(i));
			}
			if (chF.getPrice() == fList.get(i).getPrice()) {
				chFList.add(fList.get(i));
			}
		}

		System.out.println("가장 비싼 음식 가격 : " + exF.getPrice());
		System.out.println("가장 비싼 음식 갯수 : " + exFList.size());
		System.out.println(exFList);
		System.out.println("가장 싼 음식 가격 : " + chF.getPrice());
		System.out.println("가장 싼 음식 갯수 : " + chFList.size());
		System.out.println(chFList);

		int[] nums = { 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < fList.size(); i++) {
			for (int j = 0; j < locales.length; j++) {
				if (locales[j].equals(fList.get(i).getLocal())) {
					nums[j]++;
				}
			}
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(locales[j] + "의 갯수 : " + nums[j]);
		}
	}
}
/*
 * 음식 가격은 1000원부터 10000원까지 단 1000단위로 이뤄져야함 제일 비싼 음식과 제일 저렴한 음식을 출력
 */
