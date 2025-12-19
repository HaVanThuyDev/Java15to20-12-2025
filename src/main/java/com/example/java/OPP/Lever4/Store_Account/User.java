package com.example.java.OPP.Lever4.Store_Account;
import  com.example.java.OPP.Lever4.Store_Account.Role.*;

public class User {
    private  Long idl;
    private  String name;
    private  String password;
    private  String email;
    private  String phone;
    private Role role;

    public User(String name, String password){
        this.name=name;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdl() {
        return idl;
    }

    public void setIdl(Long idl) {
        this.idl = idl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public void ShowRole (){
        System.out.println(email+password+role);
    }
}
