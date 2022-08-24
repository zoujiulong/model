package FactoryModel.SimpleFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-17:05
 */
public class client {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("奔驰");
        System.out.println(car.buy());
    }
}
