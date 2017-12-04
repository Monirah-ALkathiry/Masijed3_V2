package com.example.monirah.masijed;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Fragment;
import android.app.FragmentManager;//add or remove fragment
import android.app.FragmentTransaction;


public class Masijed_Information_Activity extends AppCompatActivity {


    public static final String KEY_MASIJED_region = "region";
    public static final String  KEY_MASIJED_cityVillage = "cityVillage";
    public static final String  KEY_MASIJED_district = "district";
    public static final String  KEY_MASIJED_ID = "id";
       public static final String  KEY_MASIJED_MOSQUENAME ="mosqueName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masijed_information);

        Intent intent = getIntent();

       System.out.println("Responce toString"+ intent.toString());

        TextView MasijedName = (TextView) findViewById(R.id.MasijedName);//Masijed Name
        ListView MasiedinformationList  = (ListView) findViewById(R.id.Information);



//Displaying values by fetching from intent
        //MasijedNameTag.setText(String.valueOf(intent.getIntExtra(Masijed_Information_Activity.KEY_MASIJED_MOSQUENAME,)));
        MasijedName.setText(intent.getStringExtra(Masijed_Information_Activity.KEY_MASIJED_MOSQUENAME));



    }//end on_create

   public void ViewMasijedInfo(View view){

        Fragment fragment;

        if(view == findViewById(R.id.button3)){
            fragment = new Fragment();
            FragmentManager Fm = getFragmentManager();
            FragmentTransaction Ft= Fm.beginTransaction();
            Ft.replace(R.id.GeneralInformation,fragment);
            Ft.commit();

        }//end If Button3
     /* if(view == findViewById(R.id.button2)){
          // fragment = new Fragment_Masijed_Imag();
           fragment = new Fragment();
           FragmentManager Fm = getFragmentManager();
           FragmentTransaction Ft= Fm.beginTransaction();
           Ft.replace(R.id.GeneralInformation,fragment);
           Ft.commit();

       }//end if Button 2
       if(view == findViewById(R.id.button1)){
           fragment = new Fragment();
           FragmentManager Fm = getFragmentManager();
           FragmentTransaction Ft= Fm.beginTransaction();
           Ft.replace(R.id.GeneralInformation,fragment);
           Ft.commit();

       }//end if Button 1
       */

    }//end on chnge


}
