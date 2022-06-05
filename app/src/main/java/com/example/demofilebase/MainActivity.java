package com.example.demofilebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.edname);
        EditText postion = findViewById(R.id.postion);
        Button btn = findViewById(R.id.btnClick);
        Button show = findViewById(R.id.btnShow);
        DAOEmployee dao = new  DAOEmployee();
        show.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,RVActivity.class);
            startActivity(intent);
        });

        // b1 tao item_layout
        // b2 tao activity,layout
        // b3 tao RVAdapter extends RecycleView.Adapter<Recycleview.ViewHolder>
        // b4 tao class EmployVH
        // b5 tao list activity


        btn.setOnClickListener(v -> {

            // add
            Employee emp = new Employee(name.getText().toString(),postion.getText().toString());
            dao.add(emp).addOnSuccessListener(suc -> {
                Toast.makeText(this,"success" + suc,Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(f -> {
                Toast.makeText(this,"fail" + f,Toast.LENGTH_SHORT).show();
            });

            // update
//            HashMap<String,Object> hashMap = new HashMap<>();
//            hashMap.put("name",name.getText().toString());
//            hashMap.put("postion",postion.getText().toString());
//            dao.update("avd",hashMap).addOnSuccessListener(res -> {
//                Toast.makeText(this,"success" + res,Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(fail -> {
//                Toast.makeText(this,"success" + fail,Toast.LENGTH_SHORT).show();
//            });

            // delete
//            dao.remove("idne").addOnSuccessListener(res -> {
//                Toast.makeText(this,"success" + res,Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(err -> {
//                Toast.makeText(this,"success" + err,Toast.LENGTH_SHORT).show();
//            });
        });
    }
}