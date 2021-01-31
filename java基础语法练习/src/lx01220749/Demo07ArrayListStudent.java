package lx01220749;

import java.util.ArrayList;

public class Demo07ArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		
		Student one = new Student("洪七公",20);
		Student tow = new Student("欧阳锋",21);
		Student three = new Student("黄药师",22);
		Student four = new Student("段智兴",23);
		
		list.add(one);
		list.add(tow);
		list.add(three);
		list.add(four);
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println("学生的姓名:" + list.get(i).getName() + ",年龄" + list.get(i).getAge());
		}
		
		
		

	}

}
