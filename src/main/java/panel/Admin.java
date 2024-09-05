package panel;

import dangnhap.dang_nhap;
public class Admin extends dang_nhap {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setup();
        admin.login();
        admin.login_success();
        admin.return_s();
    }
}
