package ConstructFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-21:00
 */
//给出具体的工作部份（抽象的建造者）
public abstract class menu {
    abstract menu produceA(String a);
    abstract menu produceB(String b);
    abstract menu produceC(String c);
    abstract menu produceD(String d);
    abstract setMeal makeMenu();
}
