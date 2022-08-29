package struct.Proxy.staticProxy;

import ConstructFactoryModel.Client;

/**
 * @author zoujl
 * @create 2022-08-28-20:07
 */
public class Cilent {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new host());
        proxy.rent();
    }
}
