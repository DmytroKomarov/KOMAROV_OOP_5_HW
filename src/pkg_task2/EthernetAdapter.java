package pkg_task2;

public class EthernetAdapter extends Device {
    protected int speed;
    protected String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
}
