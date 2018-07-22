 package com.codedbyte.timestable;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
     RelativeLayout relativeLayout;
     RecyclerView recycler;
     CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.rec);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        customAdapter = new CustomAdapter(ArrayList(5));
        recycler.setAdapter(customAdapter);
        relativeLayout = (RelativeLayout)findViewById(R.id.relative);

        LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(recycler.getContext(),R.anim.layout_animation_fall);

        recycler.setLayoutAnimation(controller);
    }


    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void buttons(View view){
        TextView button = (TextView) view;
        int tag = Integer.parseInt(button.getTag().toString());
        switch (tag){
            case 1:
                customAdapter = new CustomAdapter(ArrayList(1));
                recycler.setAdapter(customAdapter);
                break;
            case 2:
                customAdapter = new CustomAdapter(ArrayList(2));
                recycler.setAdapter(customAdapter);
                break;
            case 3:
                customAdapter = new CustomAdapter(ArrayList(3));
                recycler.setAdapter(customAdapter);
                break;
            case 4:
                customAdapter = new CustomAdapter(ArrayList(4));
                recycler.setAdapter(customAdapter);
                break;
            case 5:
                customAdapter = new CustomAdapter(ArrayList(5));
                recycler.setAdapter(customAdapter);
                break;
            case 6:
                customAdapter = new CustomAdapter(ArrayList(6));
                recycler.setAdapter(customAdapter);
                break;
            case 7:
                customAdapter = new CustomAdapter(ArrayList(7));
                recycler.setAdapter(customAdapter);
                break;
            case 8:
                customAdapter = new CustomAdapter(ArrayList(8));
                recycler.setAdapter(customAdapter);
                break;
            case 9:
                customAdapter = new CustomAdapter(ArrayList(9));
                recycler.setAdapter(customAdapter);
                break;
            case 10:
                customAdapter = new CustomAdapter(ArrayList(10));
                recycler.setAdapter(customAdapter);
                break;
            case 11:
                customAdapter = new CustomAdapter(ArrayList(11));
                recycler.setAdapter(customAdapter);
                break;
            case 12:
                customAdapter = new CustomAdapter(ArrayList(12));
                recycler.setAdapter(customAdapter);
                break;
            case 13:
                customAdapter = new CustomAdapter(ArrayList(13));
                recycler.setAdapter(customAdapter);
                break;
            case 14:
                customAdapter = new CustomAdapter(ArrayList(14));
                recycler.setAdapter(customAdapter);
                break;
            case 15:
                customAdapter = new CustomAdapter(ArrayList(15));
                recycler.setAdapter(customAdapter);
                break;
            case 16:
                customAdapter = new CustomAdapter(ArrayList(16));
                recycler.setAdapter(customAdapter);
                break;
            case 17:
                customAdapter = new CustomAdapter(ArrayList(17));
                recycler.setAdapter(customAdapter);
                break;
            case 18:
                customAdapter = new CustomAdapter(ArrayList(18));
                recycler.setAdapter(customAdapter);
                break;
            case 19:
                customAdapter = new CustomAdapter(ArrayList(19));
                recycler.setAdapter(customAdapter);
                break;
            case 20:
                customAdapter = new CustomAdapter(ArrayList(20));
                recycler.setAdapter(customAdapter);
                break;
        }


        if (tag <= 10){
            relativeLayout.setBackgroundColor(getColor(R.color.first));
        }else {
            relativeLayout.setBackgroundColor(getColor(R.color.second));
        }
        recycler.getAdapter().notifyDataSetChanged();
        recycler.scheduleLayoutAnimation();


    }


    private ArrayList<String> ArrayList(int num){
        ArrayList<String> myArray = new ArrayList<String>();
        for(int x = 1; x <=  20; x++){
            String ans = String.valueOf(x * num);
            myArray.add(String.valueOf(x) + " X " + String.valueOf(num) + " = " + ans);
        }
        return myArray;
     }


}
