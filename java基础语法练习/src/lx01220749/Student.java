package lx01220749;

/*
���г�Ա������Ҫʹ��private �ؼ���
Ϊÿһ����Ա������дһ��Better/Setter����
��дһ���޲εĹ��췽��
��дһ��ȫ�εĹ��췽��



*/

public class Student {
	private String name;//����
	private int age;//����
	
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
