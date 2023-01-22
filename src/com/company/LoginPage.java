package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.company.ScannerGetter.scanString;

public class LoginPage  {
    private String username;
    private String password;
    private String permission;
    private User user;
    private Manager manager;

    public LoginPage() throws SQLException {
        System.out.println("Welcome to the login page!");
        System.out.println("\n");
        String username,password;
        System.out.println("Enter username: ");
        username = scanString();
        System.out.println("Enter password: ");
        password = scanString();
        this.username = username;
        this.password = password;


        MYSQL sql = new MYSQL();
        if(username.contains("EV")){
            this.permission = "User";
            sql.query( "SELECT * FROM bankUsers WHERE name = '" + username + "' AND password = '" + password + "'", (rs) -> {
                while (rs.next()) {
                    this.user = new User(
                            rs.getString("name"),
                            rs.getString("accountNumber"),
                            username,password,
                            rs.getString("id"),
                            rs.getString("phoneNumber"),
                            rs.getString("gender"),
                            rs.getString("email"),
                            rs.getInt("balance"));
                }

                System.out.println("Hello and welcome back "+ user.getName()+ "!");
                UserMenu menu = new UserMenu();
            });
        } else {
            this.permission = "Admin";
            sql.query( "SELECT * FROM bankManagers WHERE name = '" + username + "' AND password = '" + password + "'", (rs) -> {
                while (rs.next()) {
                    this.manager = new Manager(
                            username,password,
                            rs.getString("id"),
                            rs.getString("phoneNumber"),
                            rs.getString("gender"),
                            rs.getInt("age"));
                }
                System.out.println("Hello and welcome back " + manager.getName() + "!");
                ManagerMenu menu = new ManagerMenu();
            });
        }





    }

}
