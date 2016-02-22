package com.kak.corejavaexamples;

import java.util.ArrayList;

/**
 * Created by akak on 2/4/2016.
 */
public class InnerClassGearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public InnerClassGearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear (0, 0.0);
        this.gears.add (neutral);
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear (int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed (int revs) {
            return revs*( this.ratio);
        }
    }

    private class BoxCap {
        private int capSpokes = 0;

        public BoxCap () {

        }

        public double getCapSpokes () {
            return capSpokes;
        }
    }


}
