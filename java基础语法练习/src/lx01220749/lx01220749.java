package lx01220749;

public class lx01220749 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.setName("高立");
		stu1.setAge(20);
		System.out.println("姓名为:" + stu1.getName() + ",年龄是" + stu1.getAge());
		
		Student stu2 = new Student("高帅",20);
		System.out.println("姓名为:" + stu2.getName() + ",年龄是" + stu2.getAge());
		stu1.setAge(22);
		System.out.println("虚岁为" + stu1.getAge());
	}

}
