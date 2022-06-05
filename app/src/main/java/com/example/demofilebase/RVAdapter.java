package com.example.demofilebase;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    ArrayList<Employee> list = new ArrayList<>();
    public RVAdapter(Context context) {
        this.context = context;
    }

    public void setItems(ArrayList<Employee> emp) {
        list.addAll(emp);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new EmployeeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EmployeeVH vh = (EmployeeVH) holder;
        Employee emp = list.get(position);
        vh.txtPostion.setText(emp.getName());
        vh.txtName.setText(emp.getPostion());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
