package Study20210320;

/*
String 当中与转换相关的常用方法有:

public char[] toCharArray(); 将当前字符串拆分成为字符数组作为返回值.
public byte[] getBytes(); 获取当前字符串底层字节数组
public String replace(CharSequence oldString , CharSequence newString);
将所有出现的老字符串替换成为新字符串,返回替换之后的结果新字符串;
备注:CharSequence意思就是说可以接受字符串类型.  (目前就先把它当作字符串)

 */
public class Demo04StirngConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);   //H
        System.out.println(chars.length);   //5
        System.out.println("=====================");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        /*
            97
            98
            99
         */
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=====================");

        //字符串的内容替换
        String str1 = "How do you do ?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);//How do you do ?
        System.out.println(str2);//H*w d* y*u d* ?
        System.out.println("=====================");

        String lang1 = "会不会玩呀! 你大爷的!";
        String lang2 = lang1.replace("你大爷的","****");
        System.out.println(lang1);//会不会玩呀! 你大爷的!
        System.out.println(lang2);//会不会玩呀! ****!
    }
}
