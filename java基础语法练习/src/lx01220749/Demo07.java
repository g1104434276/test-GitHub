package lx01220749;
/*ArrayList当中常用的方法有;
 *		public boolean add (E e);  像集合当中添加元素,参数类型和泛型一致
 *		对于ArralList集合来说,add添加动作一定是成功的,所以返回值可用可不用.
 * 但对于其他集合(之后的集合)来说,add添加动作不一定成功
 * 		public E get (int index); 从集合当中获取元素,参数是索引编号.返回值就是对应位置的元素;
 * 		public E remove (int index); 从集合当中获取元素,参数是索引编号,返回值就是被删除元素
 * 		public int size(); 获取集合的尺寸长度,返回值是集合中包含的元素个数.
 * 
 * */

import java.util.ArrayList;

public class Demo07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<> ();
		System.out.println(list);
		
		//向集合中添加元素: add
		boolean success = list.add("柳岩");
		System.out.println(list);
		System.out.println("添加动作是否成功:" + success);
		
		list.add("汪羽侗");
		list.add("高媛媛");
		list.add("康旭尧");
		list.add("邬健柏");
		list.add("孔俊伟");
		System.out.println(list);
		
		//从集合中添加元素 get
		String name = list.get(0);
		System.out.println("第一号索引位置;" + name);
		//从集合中删除元素 remove
		String remowde = list.remove(4);
		System.out.println("被删除的人是:" + remowde + list);
		int size = list.size();
		System.out.println("集合的长度是:" + size);
		
	}

}
