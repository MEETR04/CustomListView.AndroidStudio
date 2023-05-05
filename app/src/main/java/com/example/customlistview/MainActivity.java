package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String pname[] = {"BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar"};

    String pprice[] = {"1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR"};

    Integer pimage[] = {R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
    R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        MyListAdapter myListAdapter = new MyListAdapter(this,pname,pprice,pimage);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                    intent.putExtra("name",pname[0]);
                    intent.putExtra("price",pprice[0]);
                    intent.putExtra("image",pimage[0]);
                    startActivity(intent);
                }
                if (i == 1){
                    Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                    intent.putExtra("name",pname[1]);
                    intent.putExtra("price",pprice[1]);
                    intent.putExtra("image",pimage[1]);
                    startActivity(intent);
                }
                if (i == 2){
                    Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                    intent.putExtra("name",pname[2]);
                    intent.putExtra("price",pprice[2]);
                    intent.putExtra("image",pimage[2]);
                    startActivity(intent);
                }
                if (i == 3){
                    Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                    intent.putExtra("name",pname[3]);
                    intent.putExtra("price",pprice[3]);
                    intent.putExtra("image",pimage[3]);
                    startActivity(intent);
                }
            }
        });
    }
}