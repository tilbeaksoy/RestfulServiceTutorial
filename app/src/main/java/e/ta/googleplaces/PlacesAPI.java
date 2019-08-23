package e.ta.googleplaces;

import e.ta.googleplaces.POJOs.Place;
import e.ta.googleplaces.POJOs.Places;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PlacesAPI {
    @GET("maps/api/place/nearbysearch/json?location=-33.8670,151.1957&radius=500&types=atm&key=AIzaSyCf_MjCA1D6TMNVe6_KofhR387FNZgZARc")
   Call<Places> getPlaces();
}
