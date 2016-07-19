package com.aosibd.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView= (TextView) findViewById(R.id.arrayid);
        editText= (EditText) findViewById(R.id.editDataEditText);
        intent=getIntent();
        Bundle bundle=intent.getExtras();
        editText.setText(bundle.getString("name")+"  "+bundle.getString("age"));

        int[] list=intent.getIntArrayExtra("array");

        for (int i:list) {
            textView.setText(textView.getText()+" "+i);
        }

        textView.setText(textView.getText()+"\n");

        for (int i:bundle.getIntegerArrayList("myList")){
            textView.setText(textView.getText()+" "+i);
        }


    }
}
