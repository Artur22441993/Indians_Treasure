package com.isnndai.terreuas;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface D {
    @Insert
    void insert(E e);

    @Query("SELECT * FROM ddddd ORDER BY ID DESC LIMIT 1")
    E getlastWeDao();

    @Query("SELECT COUNT (*) FROM ddddd")
    int gethowMuchWeHaveDao();

}
