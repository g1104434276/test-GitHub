package Study20210401.Demo07;

public interface MyInterface {
    public default void method(){
        System.out.println("接口中的默认方法");
    }
}
