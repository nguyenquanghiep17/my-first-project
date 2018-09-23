/**
 * trừu tượng hóa đối tượng giáo viên
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class Teacher {

    private String name;
    private String school;
    private String level;
    private String sex;
    private String subjects;
    private int age;
    private float salary;
    // hàm khởi tạo
    public Teacher(String name, String school, String level, String sex, String subjects, int age, float salary) {
        this.name = name;
        this.school = school;
        this.level = level;
        this.subjects = subjects;
        this.age = age;
        this.salary = salary;
    }
    // set tên
    public void setName(String name) {
        this.name = name;
    }
    // get tên
    public String getName() {
        return name;
    }
    // set trường
    public void setSchool(String school) {
        this.school = school;
    }
    // get trường
    public String getSchool() {
        return school;
    }
    // set trình độ
    public void setLevel(String level) {
        this.level = level;
    }
    // get trình độ
    public String getLevel() {
        return level;
    }
    // set giới tính
    public void setSex(String sex) {
        this.sex = sex;
    }
    // get giới tính
    public String getSex() {
        return sex;
    }
    // set môn dạy
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
    // get môn dạy
    public String getSubjects() {
        return subjects;
    }
    // set tuổi
    public void setAge(int age) {
        this.age = age;
    }
    // get tuổi
    public int getAge() {
        return age;
    }
    // set lương
    public void setSalary(float salary) {
        this.salary = salary;
    }
    // get lương
    public float getSalary() {
        return salary;
    }
    // dạy học
    public void teaching(String subjects) {
        System.out.println("Teaching " + subjects);
    }
}
