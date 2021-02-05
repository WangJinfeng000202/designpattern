package d_prototype;

import java.io.*;

public class client {

    interface IProtoType<T> extends Cloneable {
        T clone();
    }

    static class ConcreteProtoTypeA implements IProtoType<ConcreteProtoTypeA> {

        private String desc;

        public ConcreteProtoTypeA(String desc) {
            this.desc = desc;
        }

        @Override
        public ConcreteProtoTypeA clone() {
            return new ConcreteProtoTypeA(this.desc);
        }

        @Override
        public String toString() {
            return "ConcreteProtoTypeA{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }

    static class ConcreteProtoTypeB implements IProtoType<ConcreteProtoTypeB> {

        private String desc;

        public ConcreteProtoTypeB(String desc) {
            this.desc = desc;
        }

        @Override
        public ConcreteProtoTypeB clone() {
            return new ConcreteProtoTypeB(this.desc);
        }

        @Override
        public String toString() {
            return "ConcreteProtoTypeA{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }
}

class Client {
    static class ConcreteProtoType implements Cloneable, Serializable {
        private String desc;

        public ConcreteProtoType(String desc) {
            this.desc = desc;
        }

        @Override
        protected ConcreteProtoType clone() {
            ConcreteProtoType clone = null;
            try {
                clone = (ConcreteProtoType) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return clone;
        }
    }

    public ConcreteProtoType deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (ConcreteProtoType) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

//反射破坏单例现场
class ConcreteProtoType implements Cloneable {
    private static ConcreteProtoType instance = new ConcreteProtoType();

    public static ConcreteProtoType getInstance() {
        return instance;
    }

    @Override
    protected ConcreteProtoType clone() {
        //破坏了单例模式
/*
        try {
            return (ConcreteProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
 */
//        修改代码
        return instance;
    }
}