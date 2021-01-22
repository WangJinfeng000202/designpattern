package a_singleton.type1;

/**
 * 饿汉式静态变量
 */
public class Singleton {

    //使构造方法内部私有化，外部不能new
    private Singleton() {
    }

    //本类内部创建私有静态变量
    private final static Singleton INSTANCE = new Singleton();

    //给外界提供一个公有的方法，返回实例对象
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
