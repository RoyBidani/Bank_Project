package com.company;

import java.sql.SQLException;

public class UserDataCheck {
    MYSQL sql = new MYSQL();

    public UserDataCheck() throws SQLException {
    }

    public boolean checkUser(String userName, String password) {
        String sql = "SELECT * FROM bankUsers WHERE userName = '" + userName + "' AND password = '" + password + "'";
        if (sql.equals("")) {
            return false;
        } else {
            return true;
        }
    }
    public boolean checkManager(String userName, String password) {
        String sql = "SELECT * FROM BankManagers WHERE userName = '" + userName + "' AND password = '" + password + "'";
        if (sql.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
