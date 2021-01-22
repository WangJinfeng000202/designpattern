package a_singleton.type8;


public class SingletonTest8 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        System.out.println(instance.getClass().getTypeName());
    }
}