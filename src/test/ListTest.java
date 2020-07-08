package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
	private String name;
	private int grade;
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}

}

public class ListTest {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			Student st = new Student();
			st.setName("학생" + i);
			st.setGrade(r.nextInt(10) + 1);
			st.setPoint(r.nextInt(100)+1);
			stList.add(st);
		}
//		학년이 짝수 일때만 출력
//		for (int i = 0; i < stList.size(); i++) {
//				if (stList.get(i).getGrade() % 2 == 0) {
//					System.out.println("이름 :" + stList.get(i).getName() + ", 학년 : " + stList.get(i).getGrade() + "학년");
//			}
//		}
//		인덱스가 홀수일때출력
//		for (int i=0;i<stList.size();i++) {
//			if(i%2==1) {
//				System.out.println("이름 :" + stList.get(i).getName() + ", 학년 : " + stList.get(i).getGrade() + "학년");
//			}
//		}
		List<Student> stListTmp = new ArrayList<>();
		for(int i=0;i<stList.size();i++) {
			stListTmp.add(stList.get(i));
			for(int j=1;j<stListTmp.size();j++)
			if(stListTmp.get(j-1).getPoint()<stList.get(j).getPoint()) {
				
			}
		}

	}
}
