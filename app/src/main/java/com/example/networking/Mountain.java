package com.example.networking;

public class Mountain {
    string name;
    string location;
    int image;

    public Mountain(string name, string location, int image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getLocation() {
        return location;
    }

    public void setLocation(string location) {
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
