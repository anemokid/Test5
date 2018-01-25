package c4q.nyc.ic_12_18.model;

/**
 * Created by c4q on 1/24/18.
 */

/**
 * this class holds the picture url data from the json data
 */
public class Picture {

    // fields:
    private String largeURL;
    private String mediumURL;
    private String thumbnail;

    // constructor:
    public Picture(String l, String m, String t){
        this.largeURL = l;
        this.mediumURL = m;
        this.thumbnail = t;
    }

    // getters + setters for large url + medium url + thumbnail

    public String getLargeURL() {
        return largeURL;
    }

    public void setLargeURL(String largeURL) {
        this.largeURL = largeURL;
    }

    public String getMediumURL() {
        return mediumURL;
    }

    public void setMediumURL(String mediumURL) {
        this.mediumURL = mediumURL;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
