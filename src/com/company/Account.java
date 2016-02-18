package com.company;

/**
 * Created by michaelhilton on 2/18/16.
 */

public class Account {
    double principal,rate; int daysActive,accountType;
    public static final int STANDARD = 0, BUDGET=1,
            PREMIUM=2, PREMIUM_PLUS = 3;

    public static double calculateFee(Account[] accounts)
    {
        double totalFee = 0.0;
        Account account;
        for (int i=0;i<accounts.length;i++) {
            account=accounts[i];
            if ( account.accountType == Account.PREMIUM ||
            account.accountType == Account.PREMIUM_PLUS )
              totalFee += .0124 * ( // 1.25% broker's fee
              account.principal * Math.pow(account.rate,
              (account.daysActive/365.25))
              - account.principal); // interest-principal
        }
        return totalFee;
    }
}

