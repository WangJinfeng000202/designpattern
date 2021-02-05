package c_abstractfactory;

public class Client {

    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        factory.makeProductA().doA();
        factory.makeProductB().doB();

        factory = new ConcreteFactoryB();
        factory.makeProductA().doA();
        factory.makeProductB().doB();
    }

    //抽象工厂
    interface IFactory{
        IProductA makeProductA();
        IProductB makeProductB();
    }
    //具体工厂类A
    static class ConcreteFactoryA implements IFactory{

        @Override
        public IProductA makeProductA() {
            return new ConcreteProductAWithFamilyA();
        }

        @Override
        public IProductB makeProductB() {
            return new ConcreteProductBWithFamilyA();
        }
    }
    //具体工厂类B
    static class ConcreteFactoryB implements IFactory{

        @Override
        public IProductA makeProductA() {
            return new ConcreteProductAWithFamilyB();
        }

        @Override
        public IProductB makeProductB() {
            return new ConcreteProductBWithFamilyB();
        }
    }

    //产品A抽象
    interface IProductA{
        void doA();
    }
    //产品B抽象
    interface IProductB{
        void doB();
    }

    //产品族A中的具体产品A
    static class ConcreteProductAWithFamilyA implements IProductA {
        @Override
        public void doA() {
            System.out.println("The ProductA be part of FamilyA");
        }
    }
    //产品族A中的具体产品B
    static class ConcreteProductBWithFamilyA implements IProductB {
        @Override
        public void doB() {
            System.out.println("The ProductB be part of FamilyA");
        }
    }
    //产品族B中的具体产品A
    static class ConcreteProductAWithFamilyB implements IProductA {
        @Override
        public void doA() {
            System.out.println("The ProductA be part of FamilyB");
        }
    }
    //产品族B中的具体产品B
    static class ConcreteProductBWithFamilyB implements IProductB {
        @Override
        public void doB() {
            System.out.println("The ProductB be part of FamilyB");
        }
    }
}
