package lx01220749;

import java.util.ArrayList;

/*如果希望向集合ArrayList当中存储基本类型,必须使用机泵类型对应的"包装类".
 * 
 * 基本类型    包装类(引用类型 ,包装类都位于java.long包下)
 * byte     Byte
 * short	Short
 * int	    Integer
 * float    Flaot
 * double	Double
 * char  	Character
 * boolean  Boolean
 * 
 * JDK 1.5+ 开始
 * 自动装箱:  基本类型 --> 包装类型
 * 自动拆箱:  包装类型 --> 基本类型
 * */


public class Demo07ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listA = new ArrayList<> ();
		//泛型只能是引用类型,不能是基本类型.
		ArrayList<Integer> listB = new ArrayList<> ();
		listB.add(100);
		listB.add(200);
		System.out.println(listB);
		
		int num = listB.get(0);
		System.out.println("第一号元素是:" + num);
		

	}

}
