package com.swapnil.Main;
import com.swapnil.interf.ATMoperationIMPL;
import com.swapnil.interf.ATMoperationInterf;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ATMoperationInterf op = new ATMoperationIMPL();


        int atmnumber = 8165;
        int atmpin = 816;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to HDFC Bank  !!!");
        System.out.print("Enter ATM No: ");
        int atmNumber = in.nextInt();
        System.out.print("Enter ATM Pin: ");
        int atmPin = in.nextInt();

        if (atmnumber == atmNumber && atmpin == atmPin) {
            System.out.println("Validation Done.");
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();


                } else if (ch == 2) {
                    System.out.println("Enter withdraw Amount: ");
                    double WithdrawAmount = in.nextDouble();
                    op.withdrawAmount(WithdrawAmount);


                } else if (ch == 3) {
                    System.out.println("Enter amount to deposit");
                    double DepositAmount = in.nextDouble();
                    op.depositAmount(DepositAmount);

                } else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect your ATM Card \n Thank You for using HDFC Bank ATM Machine!!");
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }

        }
        else{
            System.out.println("Incorrect ATM Number and Pin");
            System.exit(0);
        }
    }
}
