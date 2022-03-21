/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.location;

import java.util.ArrayList;
import model.person.Person;

/**
 *
 * @author bhavinbhatia
 */
public class City {
   
    
    
    ArrayList<Community> communities;
    String cityName;

    public City(String cityName) {
        this.cityName = cityName;
        this.communities = new ArrayList<>();
    }
    
    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void addCommunity(Community community) {
        this.communities.add(community);
    }
    
}
