package lx01220749;

public class lx01220749 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.setName("����");
		stu1.setAge(20);
		System.out.println("����Ϊ:" + stu1.getName() + ",������" + stu1.getAge());
		
		Student stu2 = new Student("��˧",20);
		System.out.println("����Ϊ:" + stu2.getName() + ",������" + stu2.getAge());
		stu1.setAge(22);
		System.out.println("����Ϊ" + stu1.getAge());
	}

}
