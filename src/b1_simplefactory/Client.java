package b1_simplefactory;

public class Client {

    public static void main(String[] args) {
        new SimpleFactory().makeProduct(1).doSomething();
    }

    //抽象产品
    interface IProduct{
        void doSomething();
    }

    //具体产品 ProductA
    static  class ProductA implements IProduct{

        @Override
        public void doSomething() {
            System.out.println("I am ProductA");
        }
    }
    //具体产品 ProductB
    static  class ProductB implements IProduct{

        @Override
        public void doSomething() {
            System.out.println("I am ProductB");
        }
    }
    //具体产品 ProductC
    static  class ProductC implements IProduct{

        @Override
        public void doSomething() {
            System.out.println("I am ProductC");
        }
    }
    static final class Const{
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static IProduct makeProduct(int kind){
            return switch (kind) {
                case Const.PRODUCT_A -> new ProductA();
                case Const.PRODUCT_B -> new ProductB();
                case Const.PRODUCT_C -> new ProductC();
                default -> null;
            };
        }
    }
}
