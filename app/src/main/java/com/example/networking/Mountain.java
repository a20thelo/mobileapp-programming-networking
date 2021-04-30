package com.example.networking;

public class Mountain {


    //Genom denna koden har vi gett förutsättningarna för att kunna låta gson biblioteket skapa våra berg

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;

    private int size;
    private int cost;

    private Auxdata auxdata;


    public Mountain(String name,String type,String location){
        this.name = name;
        this.type = type;
        this.location= location;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return name;
    }

}