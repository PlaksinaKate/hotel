package com.company;

import com.company.model.room.Room;
import com.company.services.InfoServices;

import java.util.HashMap;
import java.util.Map;

public class HotelService {
    private InfoServices infoServices = new InfoServices();
    private Map<Integer, Room> rooms;

    public HotelService() {
        rooms = new HashMap<>();
    }

    public void setupHotelService() {
        infoServices.addRoom(rooms);
    }

}
