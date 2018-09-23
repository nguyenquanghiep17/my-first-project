/**
 * trừu tượng hóa đối tượng bò sữa
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class DairyCow {
    private String id;
    private String breed;
    private int age;
    private float milkPerDay;
    private float weight;
    private boolean healthy;
    // phương thức khởi tạo
    public DairyCow(String id, String breed, int age, float milkPerDay, float weight, boolean healthy) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.milkPerDay = milkPerDay;
        this.weight = weight;
        this.healthy = healthy;
    }
    // set id
    public void setId(String id) {
        this.id = id;
    }
    // set giống bò
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // set tuổi bò
    public void setAge(int age) {
        this.age = age;
    }
    // set lượng sữa mỗi ngày
    public void setMilkPerDay(float milkPerDay) {
        this.milkPerDay = milkPerDay;
    }
    // set câng nặng
    public void setWeight(float weight) {
        this.weight = weight;
    }
    // set tình trạng sức khỏe

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
    // get tuổi
    public int getAge() {
        return age;
    }
    // get id
    public String getId() {
        return id;
    }
    // get giống bò
    public String getBreed() {
        return breed;
    }
    // get lượng sữa mỗi ngày
    public float getMilkPerDay() {
        return milkPerDay;
    }
    // get cân nặng
    public float getWeight() {
        return weight;
    }
    // get tình trạng sức khỏe
    public boolean isHealthy() {
        return healthy;
    }
    // tiếng kêu của bò
    public void moo () {
        if (healthy)
            System.out.println("Moooooooooo");
        else
            System.out.println("Mo");
    }
}
