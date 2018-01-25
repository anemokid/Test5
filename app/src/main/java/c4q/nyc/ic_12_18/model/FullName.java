package c4q.nyc.ic_12_18.model;

/**
 * Created by c4q on 1/24/18.
 */

public class FullName {

    // fields:
    private String title;
    private String first;
    private String last;

    // constructor:
    public FullName(String t, String f, String l ){
        this.title = t;
        this.first = f;
        this.last = l;
    }
    // getters + setters for the title + first + last :
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
