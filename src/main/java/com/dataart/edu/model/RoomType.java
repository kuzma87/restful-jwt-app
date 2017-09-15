package com.dataart.edu.model;

import java.util.Arrays;

/**
 * Created by akuzmenko on 3/6/2017.
 */
public enum RoomType {
    Single(1), Double(2), Twin(3);

    private int id;

    RoomType(int id) {
        this.id = id;
    }

    public static RoomType getType(Integer id) {
        return Arrays.stream(RoomType.values())
                .filter(roomType -> id.equals(roomType.getId()))
                .findFirst()
                .get();
    }

    public int getId() {
        return id;
    }
}
