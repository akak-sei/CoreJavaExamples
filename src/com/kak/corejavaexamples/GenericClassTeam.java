package com.kak.corejavaexamples;

import java.util.ArrayList;

/**
 * Created by akak on 2/4/2016.
 */
public class GenericClassTeam<T extends GenericClassPlayer> {
    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public GenericClassTeam (String name) {
        this.name = name;
    }

    public boolean addPlayer (T player) {
        if (members.contains(player)) {
            System.out.println (((GenericClassPlayer) player).getName() + " is already on this team");
            return false;
        } else {
            members.add (player);
            System.out.println (((GenericClassPlayer) player).getName() + " picked for this team");
            return true;
        }
    }
}
