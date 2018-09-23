/**
 * trừu tượng hóa đối tượng xe ô tô
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Car {
    private String name;
    private String manufacturer;
    private String color;
    private int maxSpeed;
    private int horsePower;
    private float price;
    // hàm khởi tạo
    public Car(String name, String manufacturer, String color, int maxSpeed, int horsePower, float price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.price = price;
    }
    // set tên
    public void setName(String name) {
        this.name = name;
    }
    // get tên
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
    // set màu
    public void setColor(String color) {
        this.color = color;
    }
    // get màu
    public String getColor() {
        return color;
    }
    // set max tốc độ
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    // get max tốc độ
    public int getMaxSpeed() {
        return maxSpeed;
    }
    // set mã lực
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    // get mã lực
    public int getHorsePower() {
        return horsePower;
    }
    // set giá
    public void setPrice(float price) {
        this.price = price;
    }
    // get giá
    public float getPrice() {
        return price;
    }
    public void run() {
        System.out.println("Run");
    }
}
