package com.dataart.edu.model;

import java.util.Arrays;

/**
 * Created by akuzmenko on 3/6/2017.
 */
public enum RoomView {
    Garbage(1), Pool(2), Sea(3);

    private int id;

    RoomView(int id) {
        this.id = id;
    }

    public static RoomView getView(Integer id) {
        return Arrays.stream(RoomView.values())
                .filter(roomView -> id.equals(roomView.getId()))
                .findFirst()
                .get();
    }

    public int getId() {
        return id;
    }
}
