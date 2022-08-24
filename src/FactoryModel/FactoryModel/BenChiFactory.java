package FactoryModel.FactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-18:56
 */
public class BenChiFactory implements CarFactory{
    @Override
    public  Car getCar() {
        return new BenChi();
    }
}
