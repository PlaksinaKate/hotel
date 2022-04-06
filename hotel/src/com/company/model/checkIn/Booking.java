package com.company.model.checkIn;

import com.company.model.client.Client;
import com.company.model.room.Room;

public class Booking {
    private Client client;
    private Room room;
    private int dates;

    public Booking(Client client, Room room, int dates) {
        this.client = client;
        this.room = room;
        this.dates = dates;
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
}
