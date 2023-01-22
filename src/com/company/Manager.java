package com.company;

public class Manager {
    private String name,password,id,phoneNumber,gender;
    int age;

    public Manager(String name, String password, String id, String phoneNumber, String gender, int age) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    public Manager(String name,String password){
        this.name = name;
        this.password = password;
        this.id = "";
        this.phoneNumber = "";
        this.gender = "";
        this.age = 0;
    }

    public Manager(){
        this.name = "";
        this.password = "";
        this.id = "";
        this.phoneNumber = "";
        this.gender = "";
        this.age = 0;

    }

    public String getName() {
        return name;
    }

    public Manager setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Manager setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getId() {
        return id;
    }

    public Manager setId(String id) {
        this.id = id;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Manager setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Manager setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Manager setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
