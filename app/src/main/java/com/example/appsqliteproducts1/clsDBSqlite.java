package com.example.appsqliteproducts1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class clsDBSqlite extends SQLiteOpenHelper {
    //Definir la (s) variables para la creación de las tablas
    String tblproduct = "Create Table product(refrence text, description text, price integer, reftype integer)";
    String tblUser = "Create Table user(user text, fullname text, password text)";
    public clsDBSqlite(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //Crear las tablas
        db.execSQL(tblproduct);
        db.execSQL(tblUser);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1){
        db.execSQL("Drop table product");
        db.execSQL(tblproduct);
        db.execSQL("Drop table User");
        db.execSQL(tblUser);

    }
}
