package com.fatjoni.droid.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ListView listView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] strings = {"Item 1", "Item 2", "Item3", "Item 4"};
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(strings));

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, stringArrayList);

        listView = (ListView) rootView.findViewById(R.id.list_view_forecast);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
