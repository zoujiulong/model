package abstractFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:30
 */
//抽象中的抽象
public interface iphone {
    earphone produceEarPhone();
    phone producePhone();
}
