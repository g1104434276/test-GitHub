package lx01220749;
//�����ַ�����3+1��
/*
���ֹ��췽��
public String ();
public String (char[] array);�ַ�����
public String (byte [] array);�ֽ�����
ֱ�Ӵ���
ע��! ֱ��д��˫����,�����ַ�������

 */

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ʹ�ÿղι���
		String str1 = new String();
		System.out.println("��һ���ַ���:" + str1);
		
		//�����ַ����鴴���ַ���
		char [] charArray = { 'A' , 'B' , 'C'};
		String str2 = new String(charArray);
		System.out.println("�ڶ� ���ַ���:" + str2);
		
		//�����ֽ����鴴���ַ���
		byte[] byteArra = {97 ,98 ,99};
		String str3 = new String(byteArra);
		System.out.println("���� ���ַ���:" + str3);
		
		//ֱ�Ӵ���
		String str4 = "HelloWord";
		System.out.println("���� ���ַ���:" + str4);
		
		

	}

}
