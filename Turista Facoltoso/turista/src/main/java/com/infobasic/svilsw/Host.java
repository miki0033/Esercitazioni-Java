package com.infobasic.svilsw;

import java.util.ArrayList;
import java.util.List;

public class Host extends User {

    ArrayList<Habitation> habitations = new ArrayList<Habitation>();
    int nreservation = 0;

    public Host(String name, String surname, String email, String address) {
        super(name, surname, email, address);
    }
    /*
     * public List<Habitation> getHabitations() {
     * // TODO
     * }
     */

    public int addNreservation() {
        return nreservation++;
    }

    public void addHabitations(List<Habitation> habitations) {
        // TODO
    }

}
