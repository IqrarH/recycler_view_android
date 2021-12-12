package com.example.recycler_view;

public class Friends {

    private int id;
    private String name;
    private int dob;
    private int image;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public Friends(int id, String name, int dob, String city, int image ) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.image = image;
        this.city = city;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return "Friends { " +
                "id = " + this.id + ", name = " + this.name +
                ", dob = " + this.dob + ", image = " + this.image +
                "}";
    }
}
