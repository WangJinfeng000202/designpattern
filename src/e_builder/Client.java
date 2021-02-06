package e_builder;

public class Client {
    public static void main(String[] args) {
        IBuilder iBuilder = new ConcreteBuilder();
        System.out.println(iBuilder.builder());
    }
    static class Product {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    interface IBuilder{
        Product builder();
    }

    static class ConcreteBuilder implements IBuilder {

        private Product product = new Product();

        @Override
        public Product builder() {
            return product;
        }
    }
}
