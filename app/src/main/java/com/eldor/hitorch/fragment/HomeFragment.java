package com.eldor.hitorch.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class HomeFragment extends Fragment implements TextView.OnEditorActionListener {


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

        //hidekeyboard();

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
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


}
