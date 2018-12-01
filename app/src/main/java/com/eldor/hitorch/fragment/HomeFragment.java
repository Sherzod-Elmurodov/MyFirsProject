package com.eldor.hitorch.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.eldor.hitorch.R;
import com.eldor.hitorch.activity.HotelListActivity;

public class HomeFragment extends Fragment implements TextView.OnEditorActionListener, View.OnClickListener {


    private CardView cardView_hotel;
    private CardView cardView_things_to_do;
    private CardView cardView_rentals;
    private CardView cardView_flight;
    private CardView cardView_restaurant;
    private CardView cardView_reviews;

    private AutoCompleteTextView textView = null;
    private LinearLayoutManager layoutManager = null;

    private ArrayAdapter<String> autocompletetexts = null;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        textView = view.findViewById(R.id.find_place);
        textView.setCursorVisible(false);
        autocompletetexts = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.regions));
        textView.setThreshold(1);
        textView.setAdapter(autocompletetexts);
        textView.setOnEditorActionListener(this);

        initButton(view);

        //hidekeyboard();

        return view;
    }

    private void initButton(View view) {

        cardView_hotel = view.findViewById(R.id.cdv_hotel);
        cardView_things_to_do = view.findViewById(R.id.cdv_things_to_do);
        cardView_rentals = view.findViewById(R.id.cdv_rentals);
        cardView_flight = view.findViewById(R.id.cdv_flight);
        cardView_restaurant = view.findViewById(R.id.cdv_restaurant);
        cardView_reviews = view.findViewById(R.id.cdv_reviews);

        cardView_hotel.setOnClickListener(this);
        cardView_things_to_do.setOnClickListener(this);
        cardView_rentals.setOnClickListener(this);
        cardView_flight.setOnClickListener(this);
        cardView_restaurant.setOnClickListener(this);
        cardView_reviews.setOnClickListener(this);

    }


    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if(i == EditorInfo.IME_ACTION_GO){
            hidekeyboard();
        }
        return false;
    }

    private void hidekeyboard() {
        InputMethodManager imm = (InputMethodManager)getActivity()
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),0);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.cdv_hotel:
                Intent intent = new Intent(getContext(), HotelListActivity.class);
                startActivity(intent);
                break;
            case R.id.cdv_things_to_do:

                break;
            case R.id.cdv_rentals:

                break;
            case R.id.cdv_flight:

                break;
            case R.id.cdv_restaurant:

                break;
            case R.id.cdv_reviews:

                break;

        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
