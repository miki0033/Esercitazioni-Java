package com.infobasic.svilsw;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    UUID id;
    LocalDateTime startDate;
    LocalDateTime endDate;
    Habitation habitation = null;
    Habitation client = null;

    public Reservation(UUID id, LocalDateTime startDate, LocalDateTime endDate, Habitation habitation,
            Habitation client) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.habitation = habitation;
        this.client = client;
    }

    // GETTER
    public UUID getId() {
        return id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Habitation getHabitation() {
        return habitation;
    }

    public Habitation getClient() {
        return client;
    }

    // SETTER
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setHabitation(Habitation habitation) {
        this.habitation = habitation;
    }

    public void setClient(Habitation client) {
        this.client = client;
    }

}
