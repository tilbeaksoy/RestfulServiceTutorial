package e.ta.googleplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;

import e.ta.googleplaces.POJOs.Place;
import e.ta.googleplaces.POJOs.Places;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.sp1);
        lv=findViewById(R.id.lview1);


    }
    public void getPlaces(View view){
        Retrofit r = new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        final PlacesAPI places = r.create(PlacesAPI.class);
        Call<Places> call = places.getPlaces();
        call.enqueue(new Callback<Places>() {
            @Override
            public void onResponse(Call<Places> call, Response<Places> response) {
               Places _places = response.body();
               lv.setAdapter(new MyAdapter(MainActivity.this,_places));
            }

            @Override
            public void onFailure(Call<Places> call, Throwable t) {

            }
        });

    }
}
