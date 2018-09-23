import java.util.Scanner;

/**
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 * @
 *
 */
public class Exercise_1 {
    /**
     * tính ước chung lớn nhất của 2 số nguyên
     * @param a
     * @param b
     * @return ước chung lớn nhất
     */
    int greatestCommonDivisor (int a, int b) {
        if (b == 0)
            return a;
        else
            return greatestCommonDivisor(b, a % b);
    }

    /**
     *
     * @param n
     * @return số fibonaxi ở vị trí n trong dãy
     */
    int fibonaxi (int n) {
        if (n <= 2)
            return 1;
        else
            return fibonaxi(n - 2) + fibonaxi(n-1);
    }

    /**
     * hàm dùng để chạy thử các test cho từng phương thức
     * @param args không sử dụng
     */
    public static void main(String[] args) {
        Exercise_1 ex1 = new Exercise_1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ex1.greatestCommonDivisor(a,b)); // in ra ước chung lớn nhất của a và b
        int n = sc.nextInt();
        System.out.println(ex1.fibonaxi(n)); //in ra số fibonaxi ở vị trí n
    }
}
