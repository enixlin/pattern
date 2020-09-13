package simple.singleton.Lazy;

public class DoubleCheckLazySingleton {

    private static DoubleCheckLazySingleton instance;

    private int count;

    private DoubleCheckLazySingleton() {
    }


    /**
     * 懒汉式单例的问题是可能有线程不安全。
     * 由于进行了两次空值检查，所以这种方法叫双重检查懒汉式单例
     *
     * @return
     */
    public static DoubleCheckLazySingleton getInstance() {
        if (instance == null) {//实例为空才进入队列阻塞
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) { //实例为空才会创建实例
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }


    public void show() {
        System.out.println("HungerySingleton show function");
        System.out.println("count is " + this.count++);
    }

}
