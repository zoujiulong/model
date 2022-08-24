package ConstructFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:58
 */
//具体的建造者，可以根据setMeal的不同而增加新的具体建造者，实现了开闭原则
public class waiter extends menu{
    private setMeal meal;

    public waiter() {
        this.meal =new setMeal();
    }

    @Override
    menu produceA(String a) {
        meal.setProductA(a);
        return this;
    }

    @Override
    menu produceB(String b) {
        meal.setProductB(b);
        return this;
    }

    @Override
    menu produceC(String c) {
        meal.setProductC(c);
        return this;
    }

    @Override
    menu produceD(String d) {
        meal.setProductD(d);
        return this;
    }

    @Override
    setMeal makeMenu() {
        return meal;
    }
}
