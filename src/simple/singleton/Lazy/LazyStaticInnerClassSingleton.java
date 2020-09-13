package simple.singleton.Lazy;

/**
 * 静态内部类单例
 * 缺点：会被反射机制破坏
 */

public class LazyStaticInnerClassSingleton {
    /**
     * 静态内部类的是在引用时才实例化的，这是JVM的运行机制决定的
     * 在装载LazyStaticInnerClassSingleton 时，只会 扫描LazyStaticInnerClassSingleton的构造器
     * 当引用LazyStaticInnerClassSingleton.getInstance时，会再装载 LazyStaticInnerClassSingleton$LazyHolder
     * 所以这也是一种懒加载
     */

    private LazyStaticInnerClassSingleton() {
        //加上非空判断后，就能避免让反射机制破坏
        if (LazyHolder.INSTANCE==null){
            throw  new RuntimeException("不允许非法访问");
        }
    }


    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }


    private static class LazyHolder {

        private static  final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
