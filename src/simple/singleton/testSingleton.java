package simple.singleton;

import simple.singleton.Lazy.LazySingleton;
import simple.singleton.hungery.HungerySingleton;

public class testSingleton {

    public static void main(String[] args) {
        HungerySingleton instance = HungerySingleton.getInstance();
        LazySingleton lazy_instance = LazySingleton.getInstance();
        instance.show();
        instance.show();
        instance.show();
        instance.show();
        instance.show();
        instance.show();


    }
}
