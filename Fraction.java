/**
 * class phân số và các phương thức tương ứng
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */

public class Fraction {
    private int numerator;
    private int denominator ;

    // set giá trị tử số
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    //set giá trị mẫu số
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    //get giá trị tử số
    public int getNumerator() {
        return numerator;
    }
    //get giá trị mẫu số
    public int getDenominator() {
        return denominator;
    }
    // phương thức khởi tạo
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // in ra phân số theo định dạng tử \ mẫu
    public void printfFraction() {
        System.out.println(this.numerator + " \\ " + this.denominator);
    }

    /**
     * nhân 2 phân số
     * @param fraction là 1 phân số
     * @return 1 phân số là tổng của 2 phân số đã cho
     */
    public Fraction plusFraction(Fraction fraction) {
        Fraction a = new Fraction(this.numerator * fraction.denominator + fraction.numerator * this.denominator,
                this.denominator * fraction.denominator);
        return a;
    }

    /**
     * trừ 2 phân số
     * @param fraction là 1 phân số
     * @return 1 phân số là hiệu 2 phân số đã cho
     */
    public Fraction minusFractions(Fraction fraction) {
        Fraction a = new Fraction(this.numerator * fraction.denominator - fraction.numerator * this.denominator,
                this.denominator * fraction.denominator);
        return a;
    }

    /**
     * nhân 2 phân số
     * @param fraction là 1 phân số
     * @return 1 phân số là tích của 2 phân số đã cho
     */
    public Fraction multiplicationFraction(Fraction fraction) {
        Fraction a = new Fraction(this.numerator * fraction.numerator,
                this.denominator * fraction.denominator);
        return a;
    }

    /**
     * chia 2 phân số
     * @param fraction là 1 phân số
     * @return 1 phân số là thương của 2 phân số đã cho
     */
    public Fraction splitFractions(Fraction fraction) {
        Fraction a = new Fraction(this.numerator * fraction.denominator,
                this.denominator * fraction.numerator);
        return a;
    }

    /**
     * so sánh 2 phân số
     * @param fraction là 1 phân số
     * @return true nếu 2 phân số giống nhau và ngược lại
     */
    public boolean equals(Fraction fraction) {
        return (double)this.numerator / this.denominator == (double)fraction.numerator / fraction.denominator;
    }
}
