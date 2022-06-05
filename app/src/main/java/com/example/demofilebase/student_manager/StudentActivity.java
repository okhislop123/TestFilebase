package com.example.demofilebase.student_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.demofilebase.Adapter.StudentAdapter;
import com.example.demofilebase.Database.Dao.DAOStudent;
import com.example.demofilebase.R;
import com.example.demofilebase.student_manager.Models.Student;
import com.google.android.gms.tasks.OnSuccessListener;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    EditText txtName,txtAge;
    Button btnAdd,btnGo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        btnAdd = findViewById(R.id.btnAdd);
        btnGo = findViewById(R.id.btnGo);
        //DAOStudent dao = new DAOStudent();
//        lvStudent = findViewById(R.id.lvStudent);
//        studentList = new ArrayList<>();
//        for (int i = 0; i < 2 ;i++) {
//            studentList.add(new Student("Nguyen Van La " + i,i + 1));
//        }
//        adapter = new StudentAdapter(this,R.layout.student_component,studentList);
//        lvStudent.setAdapter(adapter);
//        setListStudent();

        btnGo.setOnClickListener(view -> {
            Intent intent = new Intent(this,StudentListActivity.class);
            startActivity(intent);
        });

//        btnAdd.setOnClickListener(v -> {
//            Student student = new Student(txtName.getText().toString(),Integer.parseInt(txtAge.getText().toString()));
//            dao.add(student).addOnSuccessListener(res -> {
//                Toast.makeText(this,"Add Success",Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(err -> {
//                Toast.makeText(this,"Add Failed",Toast.LENGTH_SHORT).show();
//            });
//        });
    }

//    void setListStudent() {
//        ListView lvStudent = findViewById(R.id.lvStudent);
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        for (int i = 0; i < 2 ;i++) {
//            studentList.add(new Student("Nguyen Van La " + i,i + 1));
//        }
//        StudentAdapter adapter = new StudentAdapter(this,R.layout.student_component,studentList);
//        lvStudent.setAdapter(adapter);
////        lvStudent.setAdapter(adapter);
//    }
}