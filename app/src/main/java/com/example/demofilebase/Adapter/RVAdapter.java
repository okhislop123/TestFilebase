package com.example.demofilebase.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demofilebase.Employee;
import com.example.demofilebase.R;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    ArrayList<Employee> list = new ArrayList<>();
    public RVAdapter(Context ctx){
        this.context = ctx;
    }

    public void setItems(ArrayList<Employee> emp) {
        list.addAll(emp);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new EmployeeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EmployeeVH vh = (EmployeeVH) holder;
        Employee emp = list.get(position);
        vh.txt_name.setText(emp.getName());
        vh.txt_position.setText(emp.getPostion());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
