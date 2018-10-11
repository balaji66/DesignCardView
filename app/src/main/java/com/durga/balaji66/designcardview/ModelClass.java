package com.durga.balaji66.designcardview;

public class ModelClass {
    private String Title;

    public ModelClass(String title, String name, String phone, String email) {
        Title = title;
        Name = name;
        Phone = phone;
        Email = email;
    }

    public ModelClass() {
    }

    private String Name;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private String Phone;
    private String Email;
}
