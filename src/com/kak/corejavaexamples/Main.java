package com.kak.corejavaexamples;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println ("Hello World");

        runSwitchStatementExample ();

        runForLoopExample ();

        runWhileLoopExample ();

        runDoWhileLoopExample ();

        runIfExample ();

        runArrayIterationExample();

        runInnerClassExample();

       runGenericClassExample ();
    }

    public static String scannerUtility (Scanner sc, String message) {
        System.out.print (message +"\t");
        return sc.nextLine();
    }

    public static void runArrayIterationExample () {
        ArrayIteration arr = new ArrayIteration();
    }

    public static void runInnerClassExample () {
        InnerClassButton button = new InnerClassButton("Print");
        InnerClassButton anonClassExampleButton = new InnerClassButton("Yuhu");

        InnerClassGearBox mcLaren = new InnerClassGearBox(6);
        InnerClassGearBox.Gear first = mcLaren.new Gear(1, 12.3);
        InnerClassGearBox.Gear second = mcLaren.new Gear (2, 15.4);

        System.out.println (first.driveSpeed(1000));

        class ClickListener implements InnerClassButton.OnClickListener {
            public ClickListener () {
                System.out.println ("I've been attached");
            }

            public void onClick (String title) {
                System.out.println (title + " was clicked");
            }
        }

        button.setOnClickListener (new ClickListener());

        button.onClick();

        anonClassExampleButton.setOnClickListener(new InnerClassButton.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println (title +" was clicked");
            }
        });

        anonClassExampleButton.onClick();
    }

    public static void runGenericClassExample () {
        GenericClassBaseballPlayer joe = new GenericClassBaseballPlayer("Joe");
        GenericClassFootballPlayer mark = new GenericClassFootballPlayer("Mark");

        GenericClassTeam<GenericClassBaseballPlayer> baseballTeam = new GenericClassTeam<>("Chicago Cubs");
        baseballTeam.addPlayer(joe);

        GenericClassTeam<GenericClassFootballPlayer> footballTeam = new GenericClassTeam<>("SF Giants");
        footballTeam.addPlayer(mark);

    }

    public static void runSwitchStatementExample () {
        int numberToTest;
        String monthToTest;

        Scanner sc = new Scanner (System.in);

        numberToTest = Integer.parseInt(scannerUtility (sc, "Enter an integer greater than zero:"));
        switch (numberToTest) {
            case 1:
                System.out.println ("Value was 1");
                break;
            case 2:
                System.out.println ("Value was 2");
                break;
            case 3:
                System.out.println ("Value was 3");
                break;
            default:
                System.out.println ("Value was greater than 3");
                break;
        }

        monthToTest = scannerUtility (sc, "Enter three letter month abbreviation:");
        switch (monthToTest.toLowerCase()) {
            case "jan":
                System.out.println ("Month is Jan");
                break;
            case "feb":
                System.out.println ("Month is Feb");
                //break;
            default:
                System.out.println ("Month is later than January");
                break;
        }

    }

    public static void runForLoopExample () {
        DepositAccount da = new DepositAccount (60000, 0.05, 18);

        System.out.println ("Final account value is " +da.calculateEndValue());
    }

    public static void runWhileLoopExample () {
        Goal g = new Goal (30000, 0.07, 250000, 11000);

        System.out.println ("You will get to your goal in " +g.calculateYearsToGoalContribAtEnd ());
    }

    public static void runDoWhileLoopExample () {
        Goal g = new Goal (30000, 0.07, 250000, 11000);

        System.out.println ("You will get to your goal in " +g.calculateYearsToGoalContribAtBegin ());
    }

    public static void runIfExample () {
        int number = 5;
        int finishNumber = 20;

        while (number <= finishNumber) {
            if (!isEvenNumber (number)) {
                number++;
                continue;
            }

            System.out.println ("Even number " +number);
            number++;
        }
    }

    private static boolean isEvenNumber (int number) {
        if (number % 2 == 0) return true;

        return false;
    }

}
