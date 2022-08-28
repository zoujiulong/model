package struct;

/**
 * @author zoujl
 * @create 2022-08-28-15:52
 */
public class adapter implements adapterUsb{
    private cable c;

    public adapter(cable c) {
        this.c = c;
    }

    @Override
    public void receiveRequest() {
        c.online();
    }

}
