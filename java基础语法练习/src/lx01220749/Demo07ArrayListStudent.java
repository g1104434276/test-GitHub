package lx01220749;

import java.util.ArrayList;

public class Demo07ArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		
		Student one = new Student("���߹�",20);
		Student tow = new Student("ŷ����",21);
		Student three = new Student("��ҩʦ",22);
		Student four = new Student("������",23);
		
		list.add(one);
		list.add(tow);
		list.add(three);
		list.add(four);
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println("ѧ��������:" + list.get(i).getName() + ",����" + list.get(i).getAge());
		}
		
		
		

	}

}
