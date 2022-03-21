/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.location;

import java.util.ArrayList;

/**
 *
 * @author bhavinbhatia
 */
public class Community {
    String communityName;
    ArrayList<House> houses;
   
    public Community(String name) {
        this.communityName = name;
        this.houses = new ArrayList<>();
    }

    public Community(String name, ArrayList<House> houses) {
        this.communityName = name;
        this.houses = houses;
    }
    

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    public void addHouse(House house) {
        this.houses.add(house);
    }
    

   
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    
    
    
}
