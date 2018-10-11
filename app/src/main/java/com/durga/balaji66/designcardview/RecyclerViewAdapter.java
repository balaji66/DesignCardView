package com.durga.balaji66.designcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<ModelClass> list;
    private Context context;

    RecyclerViewAdapter(Context context, List<ModelClass> list) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view =  LayoutInflater.from(context).inflate(R.layout.list_details,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ModelClass details = list.get(i);
        myViewHolder.title.setText(details.getTitle());
        myViewHolder.name.setText(details.getName());
        myViewHolder.phone.setText(details.getPhone());
        myViewHolder.email.setText(details.getEmail());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

       private TextView title,name,phone,email;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title =itemView.findViewById(R.id.textViewTitle);
            name =itemView.findViewById(R.id.textViewName);
            phone =itemView.findViewById(R.id.textViewPhone);
            email =itemView.findViewById(R.id.textViewEmail);



        }
    }
}
