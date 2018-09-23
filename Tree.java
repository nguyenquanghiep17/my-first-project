/**
 * trừu tượng hóa đối tượng cây
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Tree {
    private String name;
    private String breed;
    private String leafColor;
    private float height;
    // hàm khởi tạo
    public Tree(String name, String breed, String leafColor, float height) {
        this.name = name;
        this.breed = breed;
        this.leafColor = leafColor;
        this.height = height;
    }
    // set name
    public void setName(String name) {
        this.name = name;
    }
    // get name
    public String getName() {
        return name;
    }
    // set giống
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // get giống
    public String getBreed() {
        return breed;
    }
    // set màu lá
    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
    // get màu lá
    public String getLeafColor() {
        return leafColor;
    }
    // set chiều cao
    public void setHeight(float height) {
        this.height = height;
    }
    // get chiều cao
    public float getHeight() {
        return height;
    }
    // quang hợp
    public void photosynthesis() {
        System.out.println("O2");
    }
    // hô hấp
    public  void respiratory() {
        System.out.println("Co2");
    }

}
