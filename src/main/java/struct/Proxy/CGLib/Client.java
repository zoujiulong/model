package struct.Proxy.CGLib;

/**
 * @author zoujl
 * @create 2022-08-29-10:14
 */
public class Client {
    public static void main(String[] args) {
        host host = new host();
        ProxyFactory proxyFactory = new ProxyFactory(host);
        host instance = proxyFactory.getInstance();
        instance.rent();
    }
}
