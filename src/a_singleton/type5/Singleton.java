package a_singleton.type5;

/**
 * 懒汉式 同步代码块
 */
public class Singleton {

    //使构造方法内部私有化，外部不能new
    private Singleton() {
    }

    //本类内部创建私有静态变量
    private static Singleton INSTANCE;

    //不能使用这种方式
    //多线程下依然会有多个进入if块内，重复创建
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }
}
