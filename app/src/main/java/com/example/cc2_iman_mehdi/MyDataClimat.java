package com.example.cc2_iman_mehdi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDataClimat extends SQLiteOpenHelper {
    public MyDataClimat(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    public static String DB_NAME = "Climat.db";
    public static String TABLE_NAME = "CLIMAT";
    public static String COL1 = "ID";
    public static String COL2 = "VILLE";
    public static String COL3 = "PAYS";
    public static String COL4 = "TEMPERATURE";
    public static String COL5 = "POURCNUAGE";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE " + TABLE_NAME + " (" + COL1 + " integer primary key autoincrement," + COL2 + " text," + COL3 + " text," + COL4 + " integer," + COL5 + " integer)";
        SQLiteDatabase db = null;
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public static long AddClimat(SQLiteDatabase sql, Climat e){
        ContentValues c = new ContentValues();
        c.put(COL2,e.getNom_ville());
        c.put(COL3,e.getPays());
        c.put(COL4,e.getTemperature());
        c.put(COL5,e.getPourcentage());
        return sql.insert(TABLE_NAME,null,c);
    }



}
