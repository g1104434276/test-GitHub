package lx01220749;

/*
所有成员变量都要使用private 关键字
为每一个成员变量编写一对Better/Setter方法
编写一个无参的构造方法
编写一个全参的构造方法



*/

public class Student {
	private String name;//姓名
	private int age;//年龄
	
	public Student() {	
	}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
