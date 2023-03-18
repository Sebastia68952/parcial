package com.example.sqlite.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DBcalculo extends DBHelper
{
    Context context;

    public DBcalculo(@Nullable Context context) {
        super(context);
        this.context=context;
    }
    public long insertCalculo(String sum, String rest, String mult, String Div, String Fact)
    {
        long id = 0;
        try{
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase DB = dbHelper.getWritableDatabase();

            ContentValues Values = new ContentValues();
            Values.put("Suma", sum);
            Values.put("Resta", rest);
            Values.put("multiplicacion", mult);
            Values.put("Divicion", Div);
            Values.put("Factorial", Fact);

            id = DB.insert(DATABASE_TABLE,null,Values);
        }catch (Exception ex){
            ex.toString();
        }
        return  id;
    }

}