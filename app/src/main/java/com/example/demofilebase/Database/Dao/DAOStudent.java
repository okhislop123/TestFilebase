package com.example.demofilebase.Database.Dao;

import com.example.demofilebase.Employee;
import com.example.demofilebase.student_manager.Models.Student;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

public class DAOStudent {

    private DatabaseReference ref;
    public DAOStudent() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        ref = db.getReference(Student.class.getSimpleName());
    }

    public Task<Void> add(Student std) {
        return ref.push().setValue(std);
    }

    public Task<Void> update(String id, Map<String,Object> obj){
        return null;
    }

}
