package c4q.nyc.ic_12_18.backend;

import c4q.nyc.ic_12_18.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 1/24/18.
 */

public interface UserService {

    /**
     * this service gives us an opportunity to call on  :
     * - getUser() which will make an HTTP GET request for our JSON
     * @return
     */
    @GET("api/?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<User> getUser();


}
