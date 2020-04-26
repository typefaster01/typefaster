package com.example.typefaster.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name;

     public User (String name){
         this.name = name;
     }

    protected User(Parcel in) {
        name = in.readString();
    }

    public String getName() {
        return name;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
