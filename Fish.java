/**
 * trừu tượng hóa đối tượng cá
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Fish {
    private String breed;
    private String color;
    private String waterEnvironment;
    private float weight;
    // hàm khởi tạo
    public Fish(String breed, String color, String waterEnvironment, float weight) {
        this.breed = breed;
        this.color = color;
        this.waterEnvironment = waterEnvironment;
        this.weight = weight;
    }
    // set giống
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // get giống
    public String getBreed() {
        return breed;
    }
    // set màu
    public void setColor(String color) {
        this.color = color;
    }
    // get màu
    public String getColor() {
        return color;
    }
    // set môi trường nước
    public void setWaterEnvironment(String waterEnvironment) {
        this.waterEnvironment = waterEnvironment;
    }
    // get môi trường nước
    public String getWaterEnvironment() {
        return waterEnvironment;
    }
    // set cân nặng
    public void setWeight(float weight) {
        this.weight = weight;
    }
    // get môi trường nước
    public float getWeight() {
        return weight;
    }
    // bơi
    public void swim() {
        System.out.println("swim");
    }
    // lặn
    public void dive() {
        System.out.println("Lặn xuống");
    }
}
