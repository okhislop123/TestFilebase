package com.example.demofilebase.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demofilebase.R;
import com.example.demofilebase.student_manager.Models.Student;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Student> students;

    public StudentAdapter(Context context, int layout, List<Student> students) {
        this.context = context;
        this.layout = layout;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);
        TextView txtStudentName = view.findViewById(R.id.txtStudentName);
        TextView txtAgeStudent= view.findViewById(R.id.txtStudentAge);

        Student student = students.get(i);
        txtStudentName.setText(student.getName());
        txtAgeStudent.setText(student.getAge());

        return view;
    }
}
