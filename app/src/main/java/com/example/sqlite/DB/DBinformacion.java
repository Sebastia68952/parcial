package com.example.sqlite.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DBinformacion extends DBHelper
{
    Context context;

    public DBinformacion(@Nullable Context context) {
        super(context);
        this.context=context;
    }
    public long insertInfo(String Correo, String contraseña)
    {
        long id = 0;
        try{
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase DB = dbHelper.getWritableDatabase();

            ContentValues Values = new ContentValues();
            Values.put("Correo", Correo);
            Values.put("contraseña", contraseña);

            id = DB.insert(DATABASE_TABLE,null,Values);
        }catch (Exception ex){
            ex.toString();
        }
        return  id;
    }

}
