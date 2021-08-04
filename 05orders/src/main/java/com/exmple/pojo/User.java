package com.exmple.pojo;

/**
 * @author admin
 */

public class User {
    public int age;
    public String name;
    public String adress;

    public User() {
    }

    public User(int age, String name, String adress) {
        this.age = age;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
