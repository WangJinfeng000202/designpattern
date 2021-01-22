package a_singleton.type3;

/**
 * 懒汉式 线程不安全
 */
public class Singleton {

    //使构造方法内部私有化，外部不能new
    private Singleton() {
    }

    //本类内部创建私有静态变量
    private static Singleton INSTANCE;

    //给外界提供一个公有的方法，当使用到该方法时候，才创建实例对象
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
