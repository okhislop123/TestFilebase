package com.example.demofilebase.Database;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

abstract  public class FirebaseDb {

    protected void initDb(String dbName) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference ref = db.getReference(dbName);
    }

    public Task<Void> add() {
       return null;
    }

    public Task<Void> update() {
        return null;
    }

}
