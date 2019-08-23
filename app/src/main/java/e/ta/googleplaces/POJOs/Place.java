package e.ta.googleplaces.POJOs;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Place {


    private String name;

    private String vicinity;
    private GeoMetry geoMetry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public GeoMetry getGeoMetry() {
        return geoMetry;
    }

    public void setGeoMetry(GeoMetry geoMetry) {
        this.geoMetry = geoMetry;
    }
}
