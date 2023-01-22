package com.company;

import static com.company.ScannerGetter.scanString;

public class ManagerMenu {
    private String choice;
    public ManagerMenu() {
        choice = "";
        while (choice != "0") {
            System.out.println("Manager Menu: \uD83D\uDC4B\uD83C\uDF8A\uD83C\uDF89\n" +
                    "\n" +
                    "Here you have a menu of actions you can do: \n" +
                    "Choose your action number - \n" +
                    "\n" +
                    "[1] - get specific account details\n" +
                    "[2] - get all accounts in bank \n" +
                    "[3] - get a list of all the accounts with balance above X \n" +
                    "[4] - get a list of all the accounts with balance under X \n" +
                    "[5] - get all accounts with negative balance \n" +
                    "[6] - get a list of all the accounts with open loan and the amount \n" +
                    "[7] - get the account with the highest balance \n" +
                    "[8] - get the account with the lowest balance \n" +
                    "[9] - repayment of loan for a specific account \n" +
                    "[10] - get the account with the highest loan  \n" +
                    "[11] - get the account with the lowest loan \n" +
                    "[12] - remove account from the bank \n" +
                    "\n" +
                    "[0] - to logout \n");
            choice = scanString();
            switch (choice) {

            }


        }
    }
}
