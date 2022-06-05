package com.example.demofilebase;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeVH extends RecyclerView.ViewHolder {
    TextView txtName,txtPostion;
    public EmployeeVH(@NonNull View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtName);
        txtPostion = itemView.findViewById(R.id.txtPosition);
    }
}
