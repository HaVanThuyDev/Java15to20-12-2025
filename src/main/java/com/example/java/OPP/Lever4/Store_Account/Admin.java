package com.example.java.OPP.Lever4.Store_Account;

public class Admin extends User{
    public Admin(String email, String password) {
        super(email,password);

    }
    @Override
    public void ShowRole() {
        User admin = new Admin("adim@gmail.com","123456");
    }
}
