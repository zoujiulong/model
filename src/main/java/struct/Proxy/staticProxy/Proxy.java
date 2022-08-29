package struct.Proxy.staticProxy;

/**
 * @author zoujl
 * @create 2022-08-28-20:10
 */
public class Proxy implements rent{
    private host host;

    public Proxy(struct.Proxy.staticProxy.host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("这里是中介");
        host.rent();
    }
}
