package SingletonFactory;

/**
 * @author zoujl
 * @create 2022-08-22-15:54
 */
public class hungryMan {
    private static hungryMan man=new hungryMan();
    //阻止直接用构造函数来创建对象
    private hungryMan(){

    }

    public static hungryMan getInstance(){
        return man;
    }
}
