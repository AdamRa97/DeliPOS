package com.example;
import com.google.gson.Gson;

public class ConvertJSON {
    public static Hoagie getHoagie(Hoagie hoagie) {
        hoagie.setBread("White");
        hoagie.setCheese("American");
        hoagie.setCondiments("Mustard");
        hoagie.setMeat("Ham");
        hoagie.setSeasoning("Salt");
        hoagie.setSize("Small");
        hoagie.setVegatables("Onions");
        return hoagie;
    }

    public static void main(String[] args){
        Hoagie hoagie = new Hoagie();
        hoagie = getHoagie(hoagie);
        System.out.println("The JSON representation of object hoagie is ");
        System.out.println(new Gson().toJson(hoagie));
    }
    
}
