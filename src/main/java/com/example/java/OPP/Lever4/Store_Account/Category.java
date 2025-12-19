package com.example.java.OPP.Lever4.Store_Account;

public class Category {
    private int id;
    private String name;
    private  String Description;

    public Category(int id,String name,  String Description) {
        this.id = id;
        this.name = name;
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
