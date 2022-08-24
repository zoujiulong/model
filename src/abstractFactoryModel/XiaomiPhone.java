package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:35
 */
public class XiaomiPhone implements phone{
    @Override
    public String producePhone() {
        return "成功购买小米手机";
    }
}
