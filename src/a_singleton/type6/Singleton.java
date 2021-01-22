package a_singleton.type6;

/**
 * 双重检查法 推荐使用
 */
public class Singleton {

    //使构造方法内部私有化，外部不能new
    private Singleton() {
    }

    //本类内部创建私有静态变量
    private static Singleton INSTANCE;

    //给外界提供一个公有的方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized(Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
