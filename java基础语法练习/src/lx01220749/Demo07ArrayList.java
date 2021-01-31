package lx01220749;
import java.util.ArrayList;

public class Demo07ArrayList {

	/*
	 * 数组的长度不可以发生改变
	 * 但ArrayList集合的长度是可以随意变化的.
	 * 
	 * 对于Arraylist来说,有一个尖括号<E>代表泛型
	 * 泛型: 也就是装在集合中的所有元素,全都是统一的什么类型
	 * 注意: 泛型只能是引用类型,不能是基本类型
	 * 
	 * 注意事项
	 * 对于ArrayList 集合按理说 直接打印得到的不是地址值,而是内容
	 * 如果内容是空,得到的是空的中括号 []
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<> ();
		System.out.println(list);//[]
		
		//像集合当中添加一些数据,需要用到add方法.
		list.add("赵丽颖");
		System.out.println(list);
		list.add("迪丽热巴");
		list.add("马儿扎哈");
		System.out.println(list);

	}

}
