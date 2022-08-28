package struct.bridge;

/**
 * @author zoujl
 * @create 2022-08-28-19:57
 */
//用组合的方式实现桥接的方式
public  class computer {
    private brand brand;

    public computer(struct.bridge.brand brand) {
        this.brand = brand;
    }
    void info(){
        brand.name();
        System.out.println("笔记本电脑");
    }

}
class Test{
    public static void main(String[] args) {

        computer computer = new computer(new Apple());
        computer.info();
    }
}
