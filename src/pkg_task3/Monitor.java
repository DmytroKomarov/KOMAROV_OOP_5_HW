package pkg_task3;

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

}
