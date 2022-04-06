package com.company.model.checkIn;

import com.company.model.client.Client;
import com.company.model.room.Room;

public class Populated {
    private Client client;
    private Room room;
    private int dates;
    private int amountPaid;
    private int numberPeople;

    public Populated(Client client, Room room, int dates, int amountPaid, int numberPeople) {
        this.client = client;
        this.room = room;
        this.dates = dates;
        this.amountPaid = amountPaid;
        this.numberPeople = numberPeople;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getDates() {
        return dates;
    }

    public void setDates(int dates) {
        this.dates = dates;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }
}
