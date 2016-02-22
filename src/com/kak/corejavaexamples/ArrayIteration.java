package com.kak.corejavaexamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akak on 2/4/2016.
 */
public class ArrayIteration {
    private ArrayList<Integer> items = new ArrayList<>();

    public ArrayIteration () {
        items = new ArrayList ();
        //The add passing in an int is an example of AutoBoxing. It is being converted to an Integer.
        items.add (1);
        items.add (2);
        items.add (3);
        items.add (4);
        items.add (5);

        printDoubledItems (items);
    }

    private void printDoubledItems (List<Integer> items) {
        for (int i : items) {
            System.out.println (i*2);
        }
    }
}
