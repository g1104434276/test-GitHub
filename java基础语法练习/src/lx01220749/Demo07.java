package lx01220749;
/*ArrayList���г��õķ�����;
 *		public boolean add (E e);  �񼯺ϵ������Ԫ��,�������ͺͷ���һ��
 *		����ArralList������˵,add��Ӷ���һ���ǳɹ���,���Է���ֵ���ÿɲ���.
 * ��������������(֮��ļ���)��˵,add��Ӷ�����һ���ɹ�
 * 		public E get (int index); �Ӽ��ϵ��л�ȡԪ��,�������������.����ֵ���Ƕ�Ӧλ�õ�Ԫ��;
 * 		public E remove (int index); �Ӽ��ϵ��л�ȡԪ��,�������������,����ֵ���Ǳ�ɾ��Ԫ��
 * 		public int size(); ��ȡ���ϵĳߴ糤��,����ֵ�Ǽ����а�����Ԫ�ظ���.
 * 
 * */

import java.util.ArrayList;

public class Demo07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<> ();
		System.out.println(list);
		
		//�򼯺������Ԫ��: add
		boolean success = list.add("����");
		System.out.println(list);
		System.out.println("��Ӷ����Ƿ�ɹ�:" + success);
		
		list.add("����");
		list.add("������");
		list.add("����Ң");
		list.add("������");
		list.add("�׿�ΰ");
		System.out.println(list);
		
		//�Ӽ��������Ԫ�� get
		String name = list.get(0);
		System.out.println("��һ������λ��;" + name);
		//�Ӽ�����ɾ��Ԫ�� remove
		String remowde = list.remove(4);
		System.out.println("��ɾ��������:" + remowde + list);
		int size = list.size();
		System.out.println("���ϵĳ�����:" + size);
		
	}

}
