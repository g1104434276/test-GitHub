package Study20210509.Demo04;
/*
局部内部类,如果希望访问所在方法的局部变量,俺么这个局部变量必须是[有效final的]
备注:从java8+开始,只要局部事实不变,那么final关键字可以省略.
可以反编译class文件看 jdk8之后 默认就会加上 这种东西和内存周期有关,内存周期就是在内存当中活得早晚,活得长短就是生命周期.

原因:
1. new出来的对象在堆内存当中.
2. 局部变量是跟着方法走的,在栈内存当中.
3. 方法运行完之后,立即出栈,局部变量就会立即消失.
4. new出来的对象会在堆当中持续存在,知道垃圾回收消失
5. 需要复制一份,所以要保证局部变量在整个运行过程中保证值的不变
 */
public class MyOuter {
    public void methodOuter(){
        //所在方法的局部变量
        final int num = 10;
        class Inner {
            public void methodInner (){
                System.out.println(num);
            }
        }

    }
}
