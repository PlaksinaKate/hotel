package com.company.services;

import com.company.model.room.Room;
import java.util.Map;

public class InfoServices {

    public void addRoom(Map<Integer,Room> rooms) {
        int qualityRooms = (int)((Math.random()*10) + 20);
        int qualitySingleRoom = (int)((Math.random()*qualityRooms)+1);
        int qualityDoubleRoom = (int)((Math.random()*(qualityRooms - qualitySingleRoom))+1);
        int qualityDoubleLuxRoom = (int)((Math.random()*(qualityRooms - qualitySingleRoom - qualityDoubleRoom))+1);
        int qualityJuniorSuiteRoom = (int)((Math.random()*(qualityRooms - qualitySingleRoom - qualityDoubleRoom - qualityDoubleLuxRoom))+1);
        int qualityLuxRoom = qualityRooms - qualitySingleRoom - qualityDoubleRoom - qualityDoubleLuxRoom - qualityJuniorSuiteRoom;

        System.out.println(qualityRooms);
        System.out.println(qualitySingleRoom);
        System.out.println(qualityDoubleRoom);
        System.out.println(qualityDoubleLuxRoom);
        System.out.println(qualityJuniorSuiteRoom);
        System.out.println(qualityLuxRoom);


    }

}
