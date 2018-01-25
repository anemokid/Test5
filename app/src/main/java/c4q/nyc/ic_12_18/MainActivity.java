package c4q.nyc.ic_12_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import c4q.nyc.ic_12_18.backend.UserService;
import c4q.nyc.ic_12_18.model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    // fields:
    private static final String TAG = "JSON: ";
    private UserService userService;


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
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://randomuser.me/").addConverterFactory(GsonConverterFactory.create()).build();

        // this line creates the service so we can use it to make requests
        userService = retrofit.create(UserService.class);

        // this call gets us all user info:
        Call<User> user = userService.getUser();

        user.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                Log.d(TAG, "onResponse: " + response.body().getUser());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    } // ends createRetroService


}
