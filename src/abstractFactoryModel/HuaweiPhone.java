package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:35
 */
public class HuaweiPhone implements phone{

    @Override
    public String producePhone() {
        return "购买华为手机";
    }
}
