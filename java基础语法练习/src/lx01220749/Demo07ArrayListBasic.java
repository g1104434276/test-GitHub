package lx01220749;

import java.util.ArrayList;

/*���ϣ���򼯺�ArrayList���д洢��������,����ʹ�û������Ͷ�Ӧ��"��װ��".
 * 
 * ��������    ��װ��(�������� ,��װ�඼λ��java.long����)
 * byte     Byte
 * short	Short
 * int	    Integer
 * float    Flaot
 * double	Double
 * char  	Character
 * boolean  Boolean
 * 
 * JDK 1.5+ ��ʼ
 * �Զ�װ��:  �������� --> ��װ����
 * �Զ�����:  ��װ���� --> ��������
 * */


public class Demo07ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listA = new ArrayList<> ();
		//����ֻ������������,�����ǻ�������.
		ArrayList<Integer> listB = new ArrayList<> ();
		listB.add(100);
		listB.add(200);
		System.out.println(listB);
		
		int num = listB.get(0);
		System.out.println("��һ��Ԫ����:" + num);
		

	}

}
