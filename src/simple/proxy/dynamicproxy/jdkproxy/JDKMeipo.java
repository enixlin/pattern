package simple.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {


    private IPerson target;

    public IPerson getInstance(IPerson target){
             this.target=target;
             Class<?> clazz=target.getClass();
             return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        befor();

        method.invoke(this.target);

        after();
        return null;
    }

    private void after() {

        System.out.println(" 牵线人工作完成，双方交往 ");

    }

    private void befor() {
        System.out.println(" 牵线人介入工作");

    }
}
