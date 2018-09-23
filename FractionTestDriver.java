/**
 * class này dùng để chạy thử các phương thức của class Fraction
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class FractionTestDriver {
    /**
     * chạy thử các phương thức
     * @param args không sử dụng
     */
    public static void main(String[] args) {
        Fraction a = new Fraction(1,2); // khởi tạo phân số 1
        Fraction b = new Fraction(3,4); // khởi tạo phân số 2
        System.out.println(a.equals(b)); // in ra true nếu a == b và ngược lại
        a.plusFraction(b).printfFraction(); // in ra giá trị a cộng b
        a.minusFractions(b).printfFraction(); // in ra giá trị a trừ b
        a.multiplicationFraction(b).printfFraction(); // in ra giá trị a nhân b
        a.splitFractions(b).printfFraction(); // in ra giá trị a chia b
    }
}
