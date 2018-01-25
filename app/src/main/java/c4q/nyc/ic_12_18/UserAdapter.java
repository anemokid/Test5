package c4q.nyc.ic_12_18;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import c4q.nyc.ic_12_18.model.User;

/**
 * Created by c4q on 1/24/18.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {


    // fields:

    // this member var is for the users:
    private List< User > users;

    // store the context for easy acces:
    private Context mContext;

    public UserAdapter( Context context, List<User> users){
        this.mContext = context;
        this.users = users;
    }

    // easy access to the context object in the recycler view
    private Context getmContext(){
        return mContext;
    }

    /**
     * to inflate the item layout and create the viewholder
     * - this usually involves inflating a layout from XML and returning the holder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout:
        View contactView = inflater.inflate(R.layout.user_rv_item, parent, false);

        // return a new holder instance:
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    /**
     * to set the view attributes based on the data
     * - this involves populating data
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // get the data model based on position:
        User user = users.get(position);

        // set item views based on the views + data model:

        // text view:
        TextView textView = holder.userName;
        // image view:
        ImageView imageView = holder.userImage;

        /**
         * These lines were supposed to set the text + image fields of the certain position
         */
        // textView.setText(user.getFullName());
        // imageView.setImageResource(user.getPicture());

            }

    /**
     * determines the number of items
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }

    // this provides a direct reference to each of the views within a data item
    // used to cache the views within the item layout for fast access:

    public class ViewHolder extends RecyclerView.ViewHolder {


        // the holder should contain a member variable for any view that will be set as i render a row:
        private ImageView userImage;
        private TextView userName;

        // also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview:
        public ViewHolder(View itemView){

            // this stores the itemView in a public final member variable that can
            // be used to access the context from any ViewHolder instance.
            super(itemView);

            userImage = (ImageView)itemView.findViewById(R.id.user_imageview);
            userName = (TextView)itemView.findViewById(R.id.fullname_textview);


        } // ends ViewHolder constructor


    } // ends ViewHolder class
} // ends UserAdapater.java
