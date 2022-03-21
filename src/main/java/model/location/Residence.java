/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.location;

/**
 *
 * @author bhavinbhatia
 */
public class Residence {
    
    private City city;
    private Community community;
    private House house;

    public Residence(City city, Community community, House house) {
        this.city = city;
        this.community = community;
        this.house = house;
    }
    
    

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    
}
