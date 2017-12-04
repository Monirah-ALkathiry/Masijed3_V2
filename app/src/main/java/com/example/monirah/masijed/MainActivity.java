package com.example.monirah.masijed;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

     ListView listView;

    public static final String KEY_MASIJED_region = "region";
    public static final String  KEY_MASIJED_cityVillage = "cityVillage";
    public static final String  KEY_MASIJED_district = "district";
    public static final String  KEY_MASIJED_ID = "id";
    public static final String  KEY_MASIJED_Latitude ="Latitude";
    public static final String  KEY_MASIJED_Longitude ="Longitude";
    public static final String  KEY_MASIJED_MOSQUENAME ="mosqueName";
    private List<ResponceServer> ResponceServer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        final ProgressDialog loading = ProgressDialog.show(this,"Fetching Data","Please wait...",false,false);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.pagination);
        listView.setOnItemClickListener(this);


        Retrofit builder = new Retrofit.Builder()
                .baseUrl("http://mosquesapi.azurewebsites.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        final User masijed =  builder.create(User.class);
        Call<List<ResponceServer>> call = masijed.Region("1", "الرياض","الربوة");

        call.enqueue(new Callback<List<ResponceServer>>() {

            @Override
            public void onResponse(Call<List<ResponceServer>> call, Response<List<ResponceServer>> response) {

              //   List<ResponceServer> Responce_Server;


              Toast.makeText(MainActivity.this,"Yes :)",Toast.LENGTH_LONG).show();
             System.out.println(response.body().toString());
                //Dismissing the loading progressbar
                loading.dismiss();

                //Storing the data in our list
                ResponceServer = response.body();

                System.out.println("Responce toString"+ response.toString());
                System.out.println("Responce body"+ response.body());
                System.out.println("Responce headers"+ response.headers());
                System.out.println("Responce errorBody"+ response.errorBody());
                System.out.print("URL" + response.isSuccessful());
                //Storing the data in our list

                System.out.println("Size Is onResponce :----" +ResponceServer.size());

               showList();
                }

            @Override
            public void onFailure(Call<List<ResponceServer>> call, Throwable t) {

                Toast.makeText(MainActivity.this,"Error :(",Toast.LENGTH_LONG).show();
            }
        });

    }

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //declare Intent ot move between Activates
        Intent intent = new Intent(this,Masijed_Information_Activity.class);

        System.out.println("INTENT toString------------------"+ intent.toString());


        ResponceServer ResponceMasijed = ResponceServer.get(position);

        intent.putExtra(KEY_MASIJED_MOSQUENAME,ResponceMasijed.getMosqueName());
        intent.putExtra(KEY_MASIJED_region,ResponceMasijed.getRegion());
        intent.putExtra(KEY_MASIJED_cityVillage,ResponceMasijed.getCityVillage());

        intent.putExtra(KEY_MASIJED_district,ResponceMasijed.getDistrict());
        intent.putExtra(KEY_MASIJED_ID,ResponceMasijed.getId());
        intent.putExtra(KEY_MASIJED_Latitude,ResponceMasijed.getLatitude());
        intent.putExtra(KEY_MASIJED_Longitude,ResponceMasijed.getLongitude());


        startActivity(intent);

    }




    private void showList() {
        System.out.println("Size Is :----" +ResponceServer.size());


        String[] item = new String[ResponceServer.size()];


        for(int i =0; i<ResponceServer.size() ; i++){

            item[i] = ResponceServer.get(i).getRegion() + " " + ResponceServer.get(i).getDistrict();
            // Toast.makeText(getApplicationContext(),ResponceServer.get(i).getCityVillage(), Toast.LENGTH_LONG).show();
        }//end for

        //Creating an array adapter for list view

        ArrayAdapter adapter = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1,item);
        System.out.println("Adapter :----" +adapter);

        //Setting adapter to listview
       listView.setAdapter(adapter);
    }

}

