package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		String[] fNames = {"김","이","박","최","맹","신","조"};
		String[] lNames = {"동동","나나","진수","명희","철수","명호","둘리"};
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for(int i=1;i<=20;i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student st = new Student();
			st.setName(fName+lName);
			st.setGrade(r.nextInt(3)+1);
			stList.add(st);
		}
//		int[] nums = new int[3];
//		for(Student s:stList) {
//			for(int i=0;i<nums.length;i++) {
//				if(s.getGrade()==(i+1)) {
//					nums[i]++;
//				}
//			}
//		}
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]!=0) {
//				System.out.println(i+1+"학년 : "+nums[i]+"명");
//			}
//		}
		List<Student> oneSt = new ArrayList<>();
		List<Student> twoSt = new ArrayList<>();
		List<Student> thrSt = new ArrayList<>();
		for(int i=0;i<stList.size();i++) {
			if(stList.get(i).getGrade()==1) {
				oneSt.add(stList.get(i));
			}else if(stList.get(i).getGrade()==2) {
				twoSt.add(stList.get(i));
			}else if(stList.get(i).getGrade()==3) {
				thrSt.add(stList.get(i));
			}
		}
		
		if(oneSt.size()!=0) {
			System.out.print("1학년은 "+oneSt.size()+"명 입니다. ");
			for(int i=0;i<oneSt.size();i++) {
				if((i+1)!=oneSt.size()) {
				System.out.print(oneSt.get(i).getName()+",");
				}else {
					System.out.println(oneSt.get(i).getName());
				}
			}
		}
		if(twoSt.size()!=0) {
			System.out.print("2학년은 "+twoSt.size()+"명 입니다. ");
			for(int i=0;i<twoSt.size();i++) {
				if((i+1)!=twoSt.size()) {
				System.out.print(twoSt.get(i).getName()+",");
				}else {
					System.out.println(twoSt.get(i).getName());
				}
			}
		}
		if(thrSt.size()!=0) {
			System.out.print("3학년은 "+thrSt.size()+"명 입니다. ");
			for(int i=0;i<thrSt.size();i++) {
				if((i+1)!=thrSt.size()) {
				System.out.print(thrSt.get(i).getName()+",");
				}else {
					System.out.println(thrSt.get(i).getName());
				}
			}
		}
	}
}
