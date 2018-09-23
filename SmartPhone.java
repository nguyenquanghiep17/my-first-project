/**
 * trừu tượng hóa đối tượng điện thoại thông minh
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class SmartPhone {
    private String name;
    private String manufacturer;
    private int pointBenMark;
    private int batteryCapacity;
    private int ram;
    private float screenSize;
    private float price;
    // hàm khởi tạo
    public SmartPhone(String name, String manufacturer, int pointBenMark, int batteryCapacity, int ram, float screenSize,
                      float prince) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pointBenMark = pointBenMark;
        this.batteryCapacity =batteryCapacity;
        this.ram = ram;
        this.screenSize = screenSize;
        this.price = prince;
    }
    // set name
    public void setName(String name) {
        this.name = name;
    }
    // get name
    public String getName() {
        return name;
    }
    // set hãng
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    // get hãng
    public String getManufacturer() {
        return manufacturer;
    }
    // set điểm benmark
    public void setPointBenMark(int pointBenMark) {
        this.pointBenMark = pointBenMark;
    }
    // get điểm benmark
    public int getPointBenMark() {
        return pointBenMark;
    }
    // set dung lượng pin
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    // get dung lượng pin
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    //set dung lượng ram
    public void setRam(int ram) {
        this.ram = ram;
    }
    // get dung lượng ram
    public int getRam() {
        return ram;
    }
    // set kích thước màn hình
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
    // get kích thước màn hình
    public float getScreenSize() {
        return screenSize;
    }
    // set giá
    public void setPrince(float prince) {
        this.price = prince;
    }
    // get giá
    public float getPrince() {
        return price;
    }
    // sáng màn hình
    public void brightScreen() {
        System.out.println("Light");
    }
    public void call() {
        System.out.println("Call");
    }
}
