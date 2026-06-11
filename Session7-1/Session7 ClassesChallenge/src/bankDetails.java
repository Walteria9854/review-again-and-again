public class bankDetails {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public bankDetails(){
        this("56789", 2.50, "default name",
            "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public bankDetails(String number, double balance, String name, String emailTemp, String phoneNumberTemp){
        System.out.println("Account first setup with information");
        setNumber(number);
        this.balance = balance;
        this.name = name;
        email = emailTemp;
        phoneNumber = phoneNumberTemp;
    }

    public bankDetails(String name, String email, String phoneNumber) {
        this("9999", 100.55, name, email , phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit added = " + this.balance);

    }

    public void withDrawAccount(double withDrawAmount){
        if(balance - withDrawAmount < 0){
            System.out.println("Could not withdraw = " + withDrawAmount);
            System.out.println("Please restart again");

        }else{
            balance -= withDrawAmount;
            System.out.println("Success withdraw = " + withDrawAmount);
            System.out.println("Rest of the avaiable amount = " + balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
