package com.eldor.hitorch.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.eldor.hitorch.R;
import com.eldor.hitorch.adapter.HotelListAdapter;
import com.eldor.hitorch.model.Hotels;

import java.util.ArrayList;

public class HotelListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HotelListAdapter adapter;
    private ArrayList<Hotels> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView_hotellist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        list = new ArrayList<>();
        recyclerView.setAdapter(new HotelListAdapter(list, new HotelListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Hotels hotels) {
                showDetailData(hotels);
            }
        }));

        createFakeList();
    }

    private void showDetailData(Hotels hotels) {
        Intent intent = new Intent(this, Hotel_previewActivity.class);
        startActivity(intent);
    }

    private void createFakeList() {
        Hotels hotels = new Hotels("City Palace", "", (float)4.2, "UZS 3 000 000", "www.citypalace.uz");
        list.add(hotels);
        Hotels hotels2 = new Hotels("City ", "", (float)3.2, "UZS 3 000 000", "www.citypalace.uz");
        list.add(hotels2);
    }
}
