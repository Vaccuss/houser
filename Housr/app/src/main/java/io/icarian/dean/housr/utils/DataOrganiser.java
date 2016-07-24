package io.icarian.dean.housr.utils;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Dean on 24-Jul-16.
 * Single point for storing data in the application that can be accessed
 * across all activities.
 */
public class DataOrganiser {
    private static DataOrganiser mInstance;

    ArrayList<HouseModel> allHouses;


    protected DataOrganiser() {
        // Exists only to defeat instantiation.
    }

    public static synchronized DataOrganiser getInstance() {
        if (mInstance == null) {
            mInstance = new DataOrganiser();
        }
        return mInstance;
    }









}

