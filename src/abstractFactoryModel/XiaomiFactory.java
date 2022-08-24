package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:35
 */
public class XiaomiFactory implements iphone{
    @Override
    public earphone produceEarPhone() {
        return new XiaomiearPhone();
    }

    @Override
    public phone producePhone() {
        return new XiaomiPhone();
    }
}
