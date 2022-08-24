package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:46
 */
public class client {
    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        String buyearphone = huaWeiFactory.produceEarPhone().buyearphone();
        System.out.println(buyearphone);
    }
}
