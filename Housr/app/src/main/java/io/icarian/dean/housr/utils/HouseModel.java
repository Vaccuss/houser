package io.icarian.dean.housr.utils;

import java.util.ArrayList;

/**
 * Created by Dean on 24-Jul-16.
 * This Class is the data model for a single house
 */
public class HouseModel {
    private String address; // required on create
    private String description;
    private String thumbnailUrl;

    private int bedrooms;
    private int bathrooms;
    private int carParks;


    private ArrayList<String> ImageURLList;

    /**
     *
     * @param Address [String Required]
     * @param thumbNail [String Required]
     * @param Description [String Required]
     * @param Bedrooms [Integer Required]
     * @param Bathrooms [Integer Required]
     * @param Carparks [Integer Required]
     */
    public HouseModel(String Address, String thumbNail, String Description, int Bedrooms, int
            Bathrooms, int Carparks){

        address = Address;
        description = Description;
        thumbnailUrl = thumbNail;

        bedrooms = Bedrooms;
        bathrooms = Bathrooms;
        carParks = Carparks;

    }

//    public void attachExpandedData( ){
//
//    }

}
