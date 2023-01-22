package com.company;

public class User {
    private String name,accountNumber,password,id,phoneNumber,gender,email,balance;
    private int age;

    public User(String name, String accountNumber, String password, String id, String phoneNumber, String gender, String email, String balance, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
        this.balance = balance;
        this.age = age;
    }
    public User(String name,String accountNumber,String pass){
        this.name=name;
        this.accountNumber=accountNumber;
        this.password=pass;
        this.id = "";
        this.phoneNumber = "";
        this.gender = "";
        this.email = "";
        this.balance = null;
        this.age = 0;
    }

    public User(String accountNumber,String pass){
        this.name="";
        this.accountNumber=accountNumber;
        this.password=pass;
        this.id = "";
        this.phoneNumber = "";
        this.gender = "";
        this.email = "";
        this.balance = null;
        this.age = 0;
    }

    public User(){
        this.name="";
        this.accountNumber="";
        this.password="";
        this.id = "";
        this.phoneNumber = "";
        this.gender = "";
        this.email = "";
        this.balance = null;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                '}';
    }
}
