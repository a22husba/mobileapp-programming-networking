package com.example.networking;

public class Mountain {
    String name;
    String location;
    int image;

    public Mountain(String name, String location, int image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }

    public CharSequence getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharSequence getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name=" + name +
                ", location=" + location +
                ", image=" + image +
                '}';
    }
}
