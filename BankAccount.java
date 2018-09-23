/**
 * trừu tượng hóa đối tượng tài khoản ngân hàng
 * @author nguyễn quang hiệp
 * @since 23-9-2018
 */
public class BankAccount {
    private String name;
    private String id;
    private float balance;
    private int pinCode;
    // hàm khởi tạo
    public BankAccount(String name, String id, float balance, int pinCode) {
        this.name = name;
        this.id = id;
        this.balance =balance;
        this.pinCode = pinCode;
    }
    // set name
    public void setName(String name) {
        this.name = name;
    }
    // get name
    public String getName() {
        return name;
    }
    // set id
    public void setId(String id) {
        this.id = id;
    }
    // get id
    public String getId() {
        return id;
    }
    // set số dư tài khoản
    public void setBalance(float balance) {
        this.balance = balance;
    }
    // get số dư tài khoản
    public float getBalance() {
        return balance;
    }
    // set mã pin
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    // get mã pin
    public int getPinCode() {
        return pinCode;
    }
    // rút tiền
    public void withdrawal(float money) {
        if(money < balance)
            balance -= money;
        else
            System.out.println("Số dư tài khoản không đủ");
    }
    // gửi tiền
    public void sendMoney(float money) {
        balance += money;
    }
}
