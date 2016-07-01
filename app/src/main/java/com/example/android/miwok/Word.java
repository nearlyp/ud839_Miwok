package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Joe on 6/30/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
