package e.ta.googleplaces.POJOs;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Places {
    @SerializedName("results")
    private ArrayList<Place> list;

    public ArrayList<Place> getList() {
        return list;
    }

    public void setList(ArrayList<Place> list) {
        this.list = list;
    }
}
