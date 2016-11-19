package com.example.android.samplepageui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StoreListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);

        Toast.makeText(this,"success", Toast.LENGTH_SHORT).show();

        final ArrayList<Stores> stores = new ArrayList<Stores>();
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));
        stores.add(new Stores(R.drawable.allen_solly, "Allen Solly", "100 Feet Road", "11:00AM to 6:00PM", 1.2, 103, false, true, true));

        StoreListAdapter mAdapter = new StoreListAdapter(this, stores);
        ListView listView = (ListView) findViewById(R.id.store_list);
        listView.setAdapter(mAdapter);


    }
}
