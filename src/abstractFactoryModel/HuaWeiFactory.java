package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:32
 */
public class HuaWeiFactory implements iphone{
    @Override
    public earphone produceEarPhone() {
        return new HuaweiearPhone();
    }

    @Override
    public phone producePhone() {
        return new HuaweiPhone();
    }
}
