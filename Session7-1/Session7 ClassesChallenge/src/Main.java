import java.util.Arrays;

public class Main {

    public static void main(String[] args){

//        bankDetails bobsAccount = new bankDetails("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087)-123-4567");
//        bobsAccount.setNumber("11215105");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setName("Bob Brown");
//        bobsAccount.setEmail("bobemail@gmail.com");
//        bobsAccount.setPhoneNumber("08099998888");

        bankDetails bobsAccount = new bankDetails();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.depositFund(250);
        bobsAccount.withDrawAccount(100.0);

        bobsAccount.withDrawAccount(150);
        bobsAccount.depositFund(100);
        bobsAccount.withDrawAccount(45.55);
        bobsAccount.withDrawAccount(54.45);

        bankDetails timsAccount = new bankDetails(
            "Tim", "tim@gmail.com", "12345");
        System.out.println("AccountNum = " + timsAccount.getNumber() +
            " name " + timsAccount.getName() + "email " + timsAccount.getEmail());


    }
}
