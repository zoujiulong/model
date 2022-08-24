package FactoryModel.SimpleFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-17:09
 */
public class CarFactory {
    public static Car getCar(String s){
        if(s.equals("奔驰")){
            return new benchi();
        }else if(s.equals("宝马")){
            return new baoma();
        }else {
            return null;
        }
    }
}
