package com.example.lenovo.baodingdong;

public class AAProjectItem {
    private String name;
    private int imageId;

    public AAProjectItem (String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
