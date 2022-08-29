package struct.Proxy.CGLib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zoujl
 * @create 2022-08-29-9:21
 */
//顾名思义这里的
public class ProxyFactory implements MethodInterceptor {
    private host host;

    public ProxyFactory(struct.Proxy.CGLib.host host) {
        this.host = host;
    }

    host getInstance(){
        //enhancer译为增强
        Enhancer enhancer=new Enhancer();
        //获取父类的字节码对象.class
        enhancer.setSuperclass(host.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        host o = (host) enhancer.create();
        return o;
        //
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取中介费用");
        method.invoke(host,objects);
        return null;
    }
}
