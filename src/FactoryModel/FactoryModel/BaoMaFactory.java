package FactoryModel.FactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-18:57
 */
public class BaoMaFactory implements CarFactory{
    @Override
    public  Car getCar() {
        return new BaoMa();
    }
}
