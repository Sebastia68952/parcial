package com.example.sqlite.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static int DATABASE_VERSION=1;
    private static String DATABASE_NAME="parcial.db";
    public static String DATABASE_TABLE="datos";
    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + DATABASE_TABLE + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name_estuandiante TEXT," +
                "cantidad INTEGER)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+ DATABASE_TABLE );
        onCreate(sqLiteDatabase);
    }
}
