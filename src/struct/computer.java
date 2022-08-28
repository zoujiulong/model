package struct;

/**
 * @author zoujl
 * @create 2022-08-28-15:45
 */
public class computer {
    public void network(adapter adapter){
        adapter.receiveRequest();
    }

    public static void main(String[] args) {
        computer computer = new computer();//电脑需要适配器才能连网线
        cable cable = new cable();
        adapter adapter = new adapter(cable);//将适配器插上网线
        computer.network(adapter);//电脑通过usb线连接适配器（适配器实现了usb接口）；
    }
}
