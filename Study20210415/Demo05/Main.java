package Study20210415.Demo05;

public class Main {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标,供电脑使用
        //首先进行向上转型
        USB usbmouse = new Mouse();//多态写法
        //参数是USB类型,我正好传递进去就是USB鼠标
        computer.useDevice(usbmouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型,传递进去的是实现类
        computer.useDevice(keyboard);//正确写法也发生了向上转型
        //使用子类对象匿名对象也是可以的
        //computer.useDevice(new Keyboard());//也是正确写法

        computer.powerOff();

    }
}
