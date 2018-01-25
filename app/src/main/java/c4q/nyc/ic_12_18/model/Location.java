package c4q.nyc.ic_12_18.model;

/**
 * Created by c4q on 1/24/18.
 */

public class Location {

    // fields:
    private String street;
    private String city;
    private String state;
    private int postcode;

    // constructor:
    public Location(String s, String c, String st, int pc){
        this.street = s;
        this.city = c;
        this.state = st;
        this.postcode = pc;
    }

    // getters + setters for the fields:

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }
}
