package simple.singleton.hungery;


/**
 * 饿汉式单例的问题是会浪费内存
 */
public class HungerySingleton{


    private  static HungerySingleton hungerySingleton=new HungerySingleton();
    private int count;

    public static HungerySingleton getInstance(){
        return  hungerySingleton;
    }

    public void show(){
        System.out.println("HungerySingleton show function");
        System.out.println("count is "+this.count++);
    }
}
