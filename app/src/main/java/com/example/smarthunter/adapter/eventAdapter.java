package com.example.smarthunter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthunter.R;
import com.example.smarthunter.model.event;

import java.util.ArrayList;

public class eventAdapter
        extends RecyclerView.Adapter<eventAdapter.eventViewHolder>{

    public class eventViewHolder extends RecyclerView.ViewHolder{

        TextView myevent_nama,myevent_jenis,myevent_detail;
        ImageView myevent_poster;

        public eventViewHolder(@NonNull View itemView) {
            super(itemView);
            myevent_nama = itemView.findViewById(R.id.nama_sv);
            myevent_jenis =  itemView.findViewById(R.id.jenis_sv);
            myevent_detail = itemView.findViewById(R.id.detail_sv);
            myevent_poster = itemView.findViewById(R.id.image_saved);
        }
    }

    ArrayList<event> listEvent = new ArrayList<>();
    public void setListEvent(ArrayList<event> listEvent) {
        this.listEvent = listEvent;
    }

    @NonNull
    @Override
    public eventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_event, parent, false);
        eventViewHolder viewHolder = new eventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull eventViewHolder viewHolder, int position) {
        event myev = listEvent.get(position);
        viewHolder.myevent_nama.setText(myev.nama_event);
        viewHolder.myevent_jenis.setText(myev.jenis_event);
        viewHolder.myevent_detail.setText(myev.detail_event);
        viewHolder.myevent_poster.setImageResource(myev.image_poster.intValue());

    }

    @Override
    public int getItemCount() {
        return listEvent.size(); }

}

