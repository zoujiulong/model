package FactoryModel.SimpleFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-17:11
 */
public class benchi implements Car{
    @Override
    public String buy() {
        return "成功购买一台奔驰";
    }
}
