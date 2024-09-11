package Thuchanh;

public class Du_an_test extends setup {


    public static void main(String[] args) throws InterruptedException {
       Du_an_test d1 = new Du_an_test();
       d1.setups();
       d1.Forgot_password();
       d1.login("Admin","admin123");
    }


}

