package pkg_task4;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        return  "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Device device = (Device) obj;
            boolean resManufacturer = device.manufacturer.equals(this.manufacturer);
            boolean resPrice = device.price == this.price;
            boolean resSerialNumber = device.serialNumber.equals(this.serialNumber);
            return resManufacturer && resPrice && resSerialNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + (int) price;
        result = 37 * result + serialNumber.hashCode();
        return result;
    }

}
