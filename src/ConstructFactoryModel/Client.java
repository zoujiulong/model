package ConstructFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:52
 */
//真正的买单的人（设计者指挥者）
public class Client {
    public static void main(String[] args) {
        waiter waiter = new waiter();
        setMeal setMeal = waiter.produceA("披萨").produceB("鸡翅").makeMenu();
        System.out.println(setMeal);
    }
}
