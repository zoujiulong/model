package struct.Proxy.dynamicProxy;

/**
 * @author zoujl
 * @create 2022-08-28-20:07
 */
public class Cilent {
    public static void main(String[] args) {

        ProxyObject proxy = new ProxyObject(new host());
        rent rent = proxy.GetInstance();
        rent.rent();
    }
}
