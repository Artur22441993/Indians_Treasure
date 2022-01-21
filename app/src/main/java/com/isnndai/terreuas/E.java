package com.isnndai.terreuas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ddddd")
public class E {

    @ColumnInfo(name = "cont")
    public String cccc;

    @PrimaryKey(autoGenerate = true)
    int id;

    public E(String cccc) {
        this.cccc = cccc;
    }
}
