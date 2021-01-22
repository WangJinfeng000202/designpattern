package a_singleton.type2;

/**
 * 饿汉式静态代码块
 */
public class Singleton {

    //使构造方法内部私有化，外部不能new
    private Singleton() {
    }

    //本类内部创建私有静态变量
    private final static Singleton INSTANCE;

    static { //在静态代码块中，创建单例对象
        INSTANCE = new Singleton();
    }

    //给外界提供一个公有的方法，返回实例对象
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
