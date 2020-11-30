package pkg_task4;

public class Main {
    public static void main(String[] args) {
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
        Device device1 = new Device("Samsung",120,"AB1234567CD");
        Device device2 = new Device("Samsung",120,"AB1234567CD");
        Monitor monitor1 = new Monitor("Samsung",120,"AB1234567CD",1920,1080);
        Monitor monitor2 = new Monitor("Samsung",120,"AB1234567CD",1920,1080);
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("D-Link",10,"A1234B123", 2000,"15-EF-A3-45-9B-57");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("D-Link",10,"A1234B123", 2000,"15-EF-A3-45-9B-57");

        System.out.println(device1.toString());
        System.out.println(monitor1.toString());
        System.out.println(ethernetAdapter1.toString());
        System.out.println();
        System.out.println("device1 = device2: " + (device1.equals(device2) ? "yes":"no"));
        System.out.println("monitor1 = monitor1: " + (monitor1.equals(monitor2) ? "yes":"no"));
        System.out.println("ethernetAdapter1 = ethernetAdapter2: " + (ethernetAdapter1.equals(ethernetAdapter2) ? "yes":"no"));
        System.out.println();
        System.out.println("device1 hashCode: " + device1.hashCode());
        System.out.println("monitor1 hashCode: " + monitor1.hashCode());
        System.out.println("ethernetAdapter1 hashCode: " + ethernetAdapter1.hashCode());
    }
}
