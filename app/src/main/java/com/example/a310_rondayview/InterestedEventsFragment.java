package com.example.a310_rondayview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a310_rondayview.ui.InterestedEventsAdapter;

import java.util.List;

public class InterestedEventsFragment extends Fragment {

    List<Event> eventsList;

    private class ViewHolder {

        RecyclerView interestedRecyclerView;

        public ViewHolder(View view) {
            interestedRecyclerView = view.findViewById(R.id.interested_events_recycler_view);
        }
    }

    InterestedEventsFragment.ViewHolder vh;

    public InterestedEventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_interested_events, container, false);

        vh = new ViewHolder(view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // load in the list of interested events from the database
        eventsList = FireBaseUserDataManager.getInstance().InterestedEvents;

        // setup the recycler view
        vh.interestedRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vh.interestedRecyclerView.setHasFixedSize(true);

        // populate the recycler view
        InterestedEventsAdapter interestedEventsAdapter = new InterestedEventsAdapter(getContext(), eventsList);
        vh.interestedRecyclerView.setAdapter(interestedEventsAdapter);
        interestedEventsAdapter.notifyDataSetChanged();
    }
}
