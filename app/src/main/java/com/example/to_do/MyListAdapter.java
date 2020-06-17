package com.example.to_do;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.NumberViewHolder> {
    private String mItemsList;
    public MyListAdapter(String numberOfItems) {
        mItemsList = numberOfItems;
    }

    }


