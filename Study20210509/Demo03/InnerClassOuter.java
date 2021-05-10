package Study20210509.Demo03;

public class InnerClassOuter {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
