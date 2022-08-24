package SingletonFactory;

import java.lang.reflect.Constructor;

/**
 * @author zoujl
 * @create 2022-08-22-16:00
 */
//不安全的单重懒汉式模型
public class lazyMan {
    private static lazyMan man;
    private lazyMan(){

    }
    //一重判断
    public static lazyMan getInstance(){
        if(man==null){
            man=new lazyMan();
        }
        return man;
    }
}
//考虑多线程下的单充懒汉式模型
class lazyMan1 {
    //这里volatile用于禁止指令重排序
    private volatile static lazyMan1 man;
    private lazyMan1(){

    }
    //一重判断
    public static lazyMan1 getInstance(){
        synchronized (lazyMan1.class) {
            if(man==null){
                man = new lazyMan1();
            }
        }
        return man;
    }
}
//双重判断
class lazyMan2 {
    //这里volatile用于禁止指令重排序
    private volatile static lazyMan2 man;
    private lazyMan2(){

    }
    //双重判断
    public static lazyMan2 getInstance(){
        if(man==null){
            synchronized (lazyMan1.class) {
                if(man==null){
                    man = new lazyMan2();
                }
            }
        }
        return man;
    }
    //可以看到Singleton.lazyMan2@14ae5a5
    //Singleton.lazyMan2@7f31245a是两个不同的对象，不符合单例模型，有人想那在构造方法中进行添加限制呢
    //即private lazyMan2(){
    //      synchronized(lazyMan2.class){
    //          if(lazyMan2!=null){
    //              throw runtimeException();
    //          }
    //}
    //这种方法是不行的，因为我们这里是用的getInstance方法，若全都用反射是行不通的
    public static void main(String[] args) throws Exception {
        lazyMan2 instance = lazyMan2.getInstance();
        System.out.println(instance);
        Constructor<lazyMan2> declaredConstructor = lazyMan2.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        lazyMan2 lazyMan2 = declaredConstructor.newInstance();
//        lazyMan2 lazyMan3 = declaredConstructor.newInstance();
        System.out.println(lazyMan2);
//        System.out.println(lazyMan3);

    }
}
//最终解决方案，Enum
enum  lazyMan3 {
    INSTANCE;
    public static lazyMan3 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        //这里的构造器是通过反编译发现有个有参构造器
        // Cannot reflectively create enum objects
        Constructor<lazyMan3> declaredConstructor = lazyMan3.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        lazyMan3 lazyMan2 = declaredConstructor.newInstance();
        lazyMan3 lazyMan3 = declaredConstructor.newInstance();
        System.out.println(lazyMan2);
        System.out.println(lazyMan3);

    }
}


