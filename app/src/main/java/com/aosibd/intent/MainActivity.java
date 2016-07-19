package com.aosibd.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.sentButton);


    }

    public void Sent(View view) {
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        //intent.putExtras()

        Bundle bundle=new Bundle();
        bundle.putString("name","Arif");
        bundle.putString("age","40");


        ArrayList<Integer> integers=new ArrayList<Integer>();
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        bundle.putIntegerArrayList("myList",integers);

        intent.putExtras(bundle);
        int[] list=new int[]{1,2,3,4,10};

        intent.putExtra("array",list);
        startActivity(intent);

    }
}
