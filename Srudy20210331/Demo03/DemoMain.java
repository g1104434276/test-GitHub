package Srudy20210331.Demo03;

public class DemoMain {
    public static void main(String[] args) {

//        Animal animal = new Animal();//错误;

//        Dog dog = new Dog ();//错误这也是抽象类;
        DogGolden dogGolden = new DogGolden();//这是普通类可以直接new对象;
        Dog2Ha dog2Ha = new Dog2Ha();//这是普通类可以直接new对象;

        dog2Ha.eat();
        dog2Ha.sleep();

        dogGolden.eat();
        dogGolden.sleep();
    }
}
