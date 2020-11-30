package pkg_task4;

public class Monitor extends Device {
    protected int resolutionX;
    protected int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
        return  "Monitor: manufacturer=" + super.getManufacturer() + ", price=" + super.getPrice() + ", serialNumber=" + super.getSerialNumber() + ", X=" + resolutionX + ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Monitor monitor = (Monitor) obj;
            boolean resManufacturer = monitor.manufacturer.equals(this.manufacturer);
            boolean resPrice = monitor.price == this.price;
            boolean resSerialNumber = monitor.serialNumber.equals(this.serialNumber);
            boolean resResolutionX = monitor.resolutionX == this.resolutionX;
            boolean resResolutionY = monitor.resolutionY == this.resolutionY;
            return resManufacturer && resPrice && resSerialNumber && resResolutionX && resResolutionY;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + (int) price;
        result = 37 * result + serialNumber.hashCode();
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }

}
