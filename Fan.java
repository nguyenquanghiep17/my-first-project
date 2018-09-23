/**
 * trừu tượng hóa đối tượng quạt
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Fan {
    private String type;
    private String manufacturer;
    private float price;
    private float[] windSpeed;
    // hàm khởi tạo
    public Fan(String type, String manufacturer, float price, float[] windSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.price = price;
        this.windSpeed = windSpeed[];
    }
    // set loại quạt
    public void setType(String type) {
        this.type = type;
    }
    // get loại quạt
    public String getType() {
        return type;
    }
    // set hãng
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    // get hãng
    public String getManufacturer() {
        return manufacturer;
    }
    // set giá tiền
    public void setPrice(float price) {
        this.price = price;
    }
    // get giá tiền
    public float getPrice() {
        return price;
    }
    // set tốc độ quạt
    public void setWindSpeed(float[] windSpeed) {
        this.windSpeed = windSpeed;
    }
    // get tốc độ quạt
    public float[] getWindSpeed() {
        return windSpeed;
    }
    // bật quạt
    public void turnOnTheFan(int n) {
        System.out.println("Quạt " + windSpeed[n]);
    }
}
