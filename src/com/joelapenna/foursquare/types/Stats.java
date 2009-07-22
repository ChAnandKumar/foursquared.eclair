/**
 * Copyright 2009 Joe LaPenna
 */

package com.joelapenna.foursquare.types;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Auto-generated: 2009-06-09 22:40:21.739999
 *
 * @author Joe LaPenna (joe@joelapenna.com)
 */
public class Stats implements Parcelable, FoursquareType {

    private String mBeenhere;
    private String mCheckins;
    private Mayor mMayor;
    
    public Stats() {
    }
    
    public String getBeenhere() {
        return mBeenhere;
    }
    
    public void setBeenhere(String beenhere) {
        mBeenhere = beenhere;
    }
    
    public String getCheckins() {
        return mCheckins;
    }
    
    public void setCheckins(String checkins) {
        mCheckins = checkins;
    }
    
    public Mayor getMayor() {
        return mMayor;
    }
    
    public void setMayor(Mayor mayor) {
        mMayor = mayor;
    }
    
    /* For Parcelable */
    
    @Override
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        boolean[] booleanArray = {
        
        };
        dest.writeBooleanArray(booleanArray);
        dest.writeString(this.mBeenhere);    
        dest.writeString(this.mCheckins);    
        dest.writeParcelable(this.mMayor, 0);
    }
    
    private void readFromParcel(Parcel source) {
        boolean[] booleanArray = new boolean[0];
        source.readBooleanArray(booleanArray);
        this.mBeenhere = source.readString();    
        this.mCheckins = source.readString();    
        this.mMayor = source.readParcelable(null);
    }
    
    public static final Parcelable.Creator<Stats> CREATOR = new Parcelable.Creator<Stats>() {
    
        @Override
        public Stats createFromParcel(Parcel source) {
            Stats instance = new Stats();
            instance.readFromParcel(source);
            return instance;
        }
    
        @Override
        public Stats[] newArray(int size) {
            return new Stats[size];
        }
    
    };
    
}