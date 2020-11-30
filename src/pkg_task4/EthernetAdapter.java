package pkg_task4;

public class EthernetAdapter extends Device {
    protected int speed;
    protected String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString(){
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
        return  "EthernetAdapter: manufacturer=" + super.getManufacturer() + ", price=" + super.getPrice() + ", serialNumber=" + super.getSerialNumber() + ", speed=" + speed + ", mac=" + mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
            boolean resManufacturer = ethernetAdapter.manufacturer.equals(this.manufacturer);
            boolean resPrice = ethernetAdapter.price == this.price;
            boolean resSerialNumber = ethernetAdapter.serialNumber.equals(this.serialNumber);
            boolean resSpeed = ethernetAdapter.speed == this.speed;
            boolean resMac = ethernetAdapter.mac.equals(this.mac);
            return resManufacturer && resPrice && resSerialNumber && resSpeed && resMac;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + (int) price;
        result = 37 * result + serialNumber.hashCode();
        result = 37 * result + speed;
        result = 37 * result + mac.hashCode();
        return result;
    }
}
