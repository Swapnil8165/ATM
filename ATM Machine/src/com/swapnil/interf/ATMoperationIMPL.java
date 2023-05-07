package com.swapnil.interf;

import com.swapnil.ATM.ATM;

import java.util.HashMap;
import java.util.Map;

public class ATMoperationIMPL implements ATMoperationInterf {
    ATM atm = new ATM();
    HashMap<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Avaliable balance is : "+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()) {
            ministmt.put(withdrawAmount," Amount Withdrawn");
            System.out.println(withdrawAmount + " Withdrawn successfull,please collect your cash!!");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();

        }
        else{
            System.out.println("Transaction failed !! \nYou do not have sufficient balance!!!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
       ministmt.put(depositAmount," Amount deposited"); 
        System.out.println(depositAmount+" Amount deposited successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
