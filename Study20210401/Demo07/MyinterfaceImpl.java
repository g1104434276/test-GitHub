package Study20210401.Demo07;

public class MyinterfaceImpl extends Object implements MyinterfaceB,MyinterfaceA{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void emthodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }

}
