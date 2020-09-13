package simple.singleton.Lazy;

public class LazySingleton {
    private static LazySingleton instance;

    private int count;

    private LazySingleton(){}


    /**
     * 懒汉式单例的问题是可能有线程不安全。
     * @return
     */
    public static LazySingleton getInstance(){
        if(instance==null){
            instance= new LazySingleton();
        }
        return instance;
    }


    public void show(){
        System.out.println("HungerySingleton show function");
        System.out.println("count is "+this.count++);
    }



}
