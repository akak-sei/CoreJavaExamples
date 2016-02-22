package com.kak.corejavaexamples;

/**
 * Created by akak on 2/5/2016.
 */
public class DepositAccount {

    private double initialDeposit;
    private double interestRate;
    private int termInYears;

    public DepositAccount(double initialDeposit, double interestRate, int termInYears) {
        this.interestRate = interestRate;
        this.initialDeposit = initialDeposit;
        this.termInYears = termInYears;
    }

    public  double calculateEndValue () {
        double endValue = initialDeposit;

        for (int i=0; i < termInYears; i++) {
            endValue = endValue +endValue*interestRate;
        }

        return endValue;
    }
}
