package com.example.java.OPP.Lever4.Store_Account;

import static com.example.java.OPP.Lever4.Store_Account.Role.*;

public class Customer  extends User{
    public Customer( String email, String password) {
        super(email, password);

    }
    @Override
    public void ShowRole (){
        Customer customer = new Customer("minhduc@gmai.com","Duc2003@"+CUSTOMER);
    }
}
