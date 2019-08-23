package e.ta.googleplaces.POJOs;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("lat")
    double lati;
    @SerializedName("lng")
    double longi;

    public Location() {
    }

    public Location(double lati, double longi) {
        this.lati = lati;
        this.longi = longi;
    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }
}
