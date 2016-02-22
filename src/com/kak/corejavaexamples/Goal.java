package com.kak.corejavaexamples;

/**
 * Created by akak on 2/5/2016.
 */
public class Goal {
    private double initialAmount;
    private double interestRate;
    private double targetAmount;
    private double recurringContributions;

    public Goal (double initialAmount,
                    double interestRate,
                    double targetAmount,
                    double recurringContributions) {

        this.initialAmount = initialAmount;
        this.interestRate = interestRate;
        this.targetAmount = targetAmount;
        this.recurringContributions = recurringContributions;
    }

    public double calculateYearsToGoalContribAtEnd () {
        double runningTotal = initialAmount;
        int numIterations = 0;

        while (targetAmount > runningTotal) {
            runningTotal = runningTotal + runningTotal*interestRate + recurringContributions;
            numIterations++;

            if (numIterations > 100) break;
        }

        return numIterations;
    }

    public double calculateYearsToGoalContribAtBegin () {
        double runningTotal = initialAmount;
        int numIterations = 0;

        do {
            runningTotal = runningTotal + recurringContributions;
            runningTotal = runningTotal + runningTotal*interestRate;
            numIterations++;
        } while (targetAmount > runningTotal);

        return numIterations;
    }
}
