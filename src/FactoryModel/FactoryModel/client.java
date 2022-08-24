package FactoryModel.FactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-19:02
 */
public class client {
    public static void main(String[] args) {
        BenChiFactory benChiFactory = new BenChiFactory();
        Car car = benChiFactory.getCar();
        System.out.println(car.buy());
    }
}
