package PrototypeModel;

/**
 * @author zoujl
 * @create 2022-08-22-22:46
 */
//深克隆和浅克隆
//深克隆简单方法，将对象的属性也进行克隆
public class sheep implements Cloneable{

    public sheep(String name) {
        this.name = name;
    }

    String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
class test{
    public static void main(String[] args) throws CloneNotSupportedException {
        sheep sheep = new sheep("多利");
        sheep clone = (sheep)sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
        sheep.setName("多利一号");
        System.out.println(sheep);
        System.out.println(clone);

    }
}
