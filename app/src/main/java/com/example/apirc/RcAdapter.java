package com.example.apirc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RcAdapter extends RecyclerView.Adapter  <RcAdapter.ViewHolder>{
    Context context;
    ArrayList<model> arrModel;
    RcAdapter (Context context,ArrayList<model>arrModel){
        this.context= context;
        this.arrModel=arrModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_user,parent,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setText((int) arrModel.get(position).getId());
        holder.name.setText(arrModel.get(position).getName());
        holder.email.setText(arrModel.get(position).getEmail());
        holder.gender.setText(arrModel.get(position).getGender());
        holder.status.setText(arrModel.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return arrModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id,name,email,gender,status;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id= itemView.findViewById(R.id.txt_id);
            name= itemView.findViewById(R.id.txt_name);
            email= itemView.findViewById(R.id.txt_email);
            gender= itemView.findViewById(R.id.txt_gender);
            status = itemView.findViewById(R.id.txt_status);
        }
    }
}
