package lx01220749;

/*
 * �ַ���������,������ֱ��д�ϵ�˫�����ַ���,�����ַ�����������
 * 
 * ���ڻ���������˵ ==�ǽ�����ֵ�Ƚ�
 * �������ñ�����˵ ==�ǽ���[��ֵַ]�ıȽ�
 * 
 */

public class Demo08StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		char[] charArray = {'a','b','c'};
		String str3 = new String(charArray);
		
		System.out.println(str1 == str2);//true
		System.out.println(str2 == str3);//false
		System.out.println(str1 == str3);//false
		
		
		
		
		

	}

}
