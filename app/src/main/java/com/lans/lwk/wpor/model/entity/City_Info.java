package com.lans.lwk.wpor.model.entity;

/**
 * Created by Li on 2017/11/12.
 */

public class City_Info {


    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String Longitude;
    private String Latitude;
    private String city;

    public String getLocationDescribe() {
        return LocationDescribe;
    }

    public void setLocationDescribe(String locationDescribe) {
        LocationDescribe = locationDescribe;
    }

    private String LocationDescribe;

    public City_Info(String longitude, String latitude, String city, String district, String street,String LocationDescribe) {
        Longitude = longitude;
        Latitude = latitude;
        this.city = city;
        District = district;
        Street = street;
        this.LocationDescribe=LocationDescribe;

    }

    public String getDistrict() {
        return District;

    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    private String District;
    private String Street;
}
