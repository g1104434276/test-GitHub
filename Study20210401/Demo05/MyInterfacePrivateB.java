package Study20210401.Demo05;

public interface MyInterfacePrivateB {

    public static void methodDefault1 () {
        System.out.println("静态方法一");
        //methodStaticCommon();
    }

    public static void methodDefault2 () {
        System.out.println("静态方法二");
       //methodStaticCommon();
    }

    //此版本为JAVA 1.8 版本所以会报错
/*    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
*/

}
