package com.infobasic.svilsw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Habitation {
    UUID id;
    double dailyprice;
    LocalDateTime startDate;
    LocalDateTime endDate;
    String name;
    String address;
    int nrooms;
    int beds;
    int floor;
    ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();

    public Habitation(double dailyprice, LocalDateTime startDate, LocalDateTime endDate, String name,
            String address, int nrooms, int beds, int floor) {
        this.id = UUID.randomUUID();
        this.dailyprice = dailyprice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.address = address;
        this.nrooms = nrooms;
        this.beds = beds;
        this.floor = floor;
    }

    // GETTER
    public UUID getId() {
        return id;
    }

    public double getDailyprice() {
        return dailyprice;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNrooms() {
        return nrooms;
    }

    public int getBeds() {
        return beds;
    }

    public int getFloor() {
        return floor;
    }

    /*
     * public List<Feedback> getFeedbacks() {
     * // TODO
     * }
     */

    // SETTER
    public void setDailyprice(double dailyprice) {
        this.dailyprice = dailyprice;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void addFeedbacks(List<Feedback> feedbacks) {
        // TODO
    }

}
