package c4q.nyc.ic_12_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creates retrofit :
        createRetroService();
    }

    /**
     *
     */
    public void createRetroService(){

        // instantiate the retrofit service:
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://randomuser.me/api/?nat=us&inc=name,location,cell,email,dob,picture&results=20").addConverterFactory(GsonConverterFactory.create()).build();

        // this line creates the service so we can use it to make requests


    }
}
