package com.codedbyte.timestable;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<String> timeArray;

    public CustomAdapter(ArrayList<String> timeArray) {
        this.timeArray = timeArray;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view  = inflater.inflate(R.layout.recyclermodel, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txt.setText(timeArray.get(i));
    }

    @Override
    public int getItemCount() {
        return timeArray.size();
    }
}class ViewHolder extends RecyclerView.ViewHolder{
    TextView txt;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        txt = (TextView)itemView.findViewById(R.id.textViewTimesT);
    }
}
