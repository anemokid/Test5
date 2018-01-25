package c4q.nyc.ic_12_18.model;

import java.util.ArrayList;

/**
 * Created by c4q on 1/24/18.
 */

public class User {

    // fields:
    private String gender;
    private FullName fullName; // this holds the title + first + last name of a user
    private Location location; // this holds the street + city + state + postcode of a user
    private String email;
    private String dateOfBirth;
    private String cell;
    private Picture picture; // this holds : mediumURL + largeURL + thumbnail

    // constructor to set all above fields:
    public User( String g, FullName fN, Location l , String e, String dB, String c, Picture p){
        this.gender = g;
        this.fullName = fN;
        this.location = l;
        this.email = e;
        this.dateOfBirth = dB;
        this.cell = c;
        this.picture = p;
    }

    // getters + setters for above field:


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
