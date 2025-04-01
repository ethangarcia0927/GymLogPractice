package com.example.gymlogpractice.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.gymlogpractice.Database.entities.GymLog;

import java.util.ArrayList;

@Dao
public interface GymLogDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(GymLog gymlog);

    @Query("Select * from " + GymLogDatabase.GYM_LOG_TABLE)
    ArrayList<GymLog> getAllRecords();
}
