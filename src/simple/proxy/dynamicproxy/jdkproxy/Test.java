package simple.proxy.dynamicproxy.jdkproxy;

public class Test {
    public static void main(String[] args) {

        JDKMeipo meipo = new JDKMeipo();
        IPerson lin = meipo.getInstance(new Linzhenhuan());
        lin.findLove();
//        lin是meipo的代理对象，所以上面一行运我们运行的findlove()方法，实际是执行代理类的method.invok();
    }
}
