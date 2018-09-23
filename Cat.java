/**
 * trừu tượng hóa đối tượng mèo
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Cat {
    private String name;
    private String breed;
    private String coatColor;
    private String sex;
    private int age;
    // hàm khởi tạo
    public Cat(String name, String breed, String coatColor, String sex, int age) {
        this.name = name;
        this.breed =breed;
        this.coatColor = coatColor;
        this.sex = sex;
        this.age = age;
    }
    // set tên
    public void setName(String name) {
        this.name = name;
    }
    // get tên
    public String getName() {
        return name;
    }
    // set giống mèo
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // get giống mèo
    public String getBreed() {
        return breed;
    }
    // set màu lông
    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
    // get màu lông
    public String getCoatColor() {
        return coatColor;
    }
    // set giới tính
    public void setSex(String sex) {
        this.sex = sex;
    }
    // get giới tính
    public String getSex() {
        return sex;
    }
    // set tuổi
    public void setAge(int age) {
        this.age = age;
    }
    // get tuổi
    public int getAge() {
        return age;
    }
    // đuổi chuột
    public void huntMouse() {
        System.out.println("Đuổi chuột");
    }
    // tiếng kêu
    public void exclamation() {
        System.out.println("Meoooo");
    }
}
