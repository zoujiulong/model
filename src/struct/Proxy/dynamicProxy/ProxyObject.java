package struct.Proxy.dynamicProxy;

import sun.security.jca.GetInstance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zoujl
 * @create 2022-08-28-20:10
 */
public class ProxyObject {
    private host host;

    public ProxyObject(struct.Proxy.dynamicProxy.host host) {
        this.host = host;
    }

    rent GetInstance(){
        //这个类并不是真正的代理类，代理类是在运行过程在内存中形成的，我们是看不到的，只能得到代理对象，而形成类之后需要jvm
        //类的加载，第二个参数是实现的接口数组，第三个参数是处理程序，可以通过反编译得知该过程其实就是Proxy.InvacationHandler.invoke()
       rent o = (rent) Proxy.newProxyInstance(host.class.getClassLoader(), host.class.getInterfaces(), new InvocationHandler() {
           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               System.out.println("动态代理");
               method.invoke(host,args);
               return null;
           }
       });
       return o;
   }

}
