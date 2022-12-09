package com.prasath.webtech2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String[] description={"IT","EEE","ECE","CSE","RPT"};
    private String[] departments={"IT","EEE","ECE","CSE","RPT"};
    private String[] images={"it","eee","ece","ct","pt"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String dept=intent.getStringExtra("dept");
        System.out.println(dept);
        for(int i=0;i<departments.length;i++){
            if(departments[i].equals(dept)){
                TextView des=findViewById(R.id.desc);
                ImageView img=findViewById(R.id.img);
                TextView dep=findViewById(R.id.dd);
                System.out.println(description[i]+dept+images[i]);
                des.setText(description[i]);
                dep.setText(dept);
                int id = getResources().getIdentifier("com.prasath.webtech2:drawable/"+images[i], null, null);
                img.setImageResource(id);
                break;
            }
        }
    }
}