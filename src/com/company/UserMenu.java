package com.company;

import static com.company.ScannerGetter.scanString;

public class UserMenu {
    private String choice;

    public UserMenu() {
        choice = "";
        while (choice != "0") {
            System.out.println("User Menu: \uD83D\uDC4B\uD83C\uDF8A\uD83C\uDF89\n" +
                    "\n" +
                    "Here you have a menu of actions you can do: \n" +
                    "Choose your action number - \n" +
                    "\n" +
                    "[1] - update account details\n" +
                    "[2] - withdraw \n" +
                    "[3] - commiting \n" +
                    "[4] - take a loan \n" +
                    "[5] - get account details \n" +
                    "[6] -  \n" +
                    "[7] -  \n" +
                    "[8] -  \n" +
                    "[9] -  \n" +
                    "[10] -   \n" +
                    "[11] -  \n" +
                    "[12] -  \n" +
                    "\n" +
                    "[0] - to logout \n");
            choice = scanString();
            switch (choice) {

            }
        }
    }
}
