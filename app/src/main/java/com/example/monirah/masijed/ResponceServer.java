package com.example.monirah.masijed;

/**
 * Created by Monirah on 29/11/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponceServer {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("DawaReqDateH")
    @Expose
    private String dawaReqDateH;
    @SerializedName("Region")
    @Expose
    private String region;
    @SerializedName("City_Village")
    @Expose
    private String cityVillage;
    @SerializedName("District")
    @Expose
    private String district;
    @SerializedName("DawaOffice")
    @Expose
    private String dawaOffice;
    @SerializedName("DawaActivityLoc")
    @Expose
    private String dawaActivityLoc;
    @SerializedName("MosqueName")
    @Expose
    private String mosqueName;
    @SerializedName("LocX_Coord")
    @Expose
    private String locXCoord;
    @SerializedName("LocY_Coord")
    @Expose
    private String locYCoord;
    @SerializedName("ReqStatus_Lajnah")
    @Expose
    private String reqStatusLajnah;
    @SerializedName("DawaActivityType")
    @Expose
    private String dawaActivityType;
    @SerializedName("DawaActivitiesInfoId")
    @Expose
    private String dawaActivitiesInfoId;
    @SerializedName("DawaAddress")
    @Expose
    private String dawaAddress;
    @SerializedName("DawaManyActivities")
    @Expose
    private String dawaManyActivities;
    @SerializedName("DawaMainCategory")
    @Expose
    private String dawaMainCategory;
    @SerializedName("DawaSubCategory")
    @Expose
    private String dawaSubCategory;
    @SerializedName("DawaActivityDateH")
    @Expose
    private String dawaActivityDateH;
    @SerializedName("DawaActivityTime")
    @Expose
    private String dawaActivityTime;
    @SerializedName("DawaActivityRepetition")
    @Expose
    private String dawaActivityRepetition;
    @SerializedName("DawaActivityRepDays")
    @Expose
    private String dawaActivityRepDays;
    @SerializedName("DawaActivLanguage")
    @Expose
    private String dawaActivLanguage;
    @SerializedName("WomenPlaceAvailability")
    @Expose
    private String womenPlaceAvailability;
    @SerializedName("Nationality")
    @Expose
    private String nationality;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("FatherName")
    @Expose
    private String fatherName;
    @SerializedName("GrandFatherName")
    @Expose
    private String grandFatherName;
    @SerializedName("FamilyName")
    @Expose
    private String familyName;
    @SerializedName("LocationName")
    @Expose
    private String locationName;
    @SerializedName("StreetName")
    @Expose
    private String streetName;
    @SerializedName("DawaActivRemarks")
    @Expose
    private String dawaActivRemarks;
    @SerializedName("EXFirstName")
    @Expose
    private String eXFirstName;
    @SerializedName("EXFatherName")
    @Expose
    private String eXFatherName;
    @SerializedName("EXGrandFatherName")
    @Expose
    private String eXGrandFatherName;
    @SerializedName("EXFamilyName")
    @Expose
    private String eXFamilyName;

    @SerializedName("Latitude")
    @Expose
    private String latitude;
    @SerializedName("Longitude")
    @Expose
    private String longitude;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDawaReqDateH() {
        return dawaReqDateH;
    }

    public void setDawaReqDateH(String dawaReqDateH) {
        this.dawaReqDateH = dawaReqDateH;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDawaOffice() {
        return dawaOffice;
    }

    public void setDawaOffice(String dawaOffice) {
        this.dawaOffice = dawaOffice;
    }

    public String getDawaActivityLoc() {
        return dawaActivityLoc;
    }

    public void setDawaActivityLoc(String dawaActivityLoc) {
        this.dawaActivityLoc = dawaActivityLoc;
    }

    public String getMosqueName() {
        return mosqueName;
    }

    public void setMosqueName(String mosqueName) {
        this.mosqueName = mosqueName;
    }

    public String getLocXCoord() {
        return locXCoord;
    }

    public void setLocXCoord(String locXCoord) {
        this.locXCoord = locXCoord;
    }

    public String getLocYCoord() {
        return locYCoord;
    }

    public void setLocYCoord(String locYCoord) {
        this.locYCoord = locYCoord;
    }

    public String getReqStatusLajnah() {
        return reqStatusLajnah;
    }

    public void setReqStatusLajnah(String reqStatusLajnah) {
        this.reqStatusLajnah = reqStatusLajnah;
    }

    public String getDawaActivityType() {
        return dawaActivityType;
    }

    public void setDawaActivityType(String dawaActivityType) {
        this.dawaActivityType = dawaActivityType;
    }

    public String getDawaActivitiesInfoId() {
        return dawaActivitiesInfoId;
    }

    public void setDawaActivitiesInfoId(String dawaActivitiesInfoId) {
        this.dawaActivitiesInfoId = dawaActivitiesInfoId;
    }

    public String getDawaAddress() {
        return dawaAddress;
    }

    public void setDawaAddress(String dawaAddress) {
        this.dawaAddress = dawaAddress;
    }

    public String getDawaManyActivities() {
        return dawaManyActivities;
    }

    public void setDawaManyActivities(String dawaManyActivities) {
        this.dawaManyActivities = dawaManyActivities;
    }

    public String getDawaMainCategory() {
        return dawaMainCategory;
    }

    public void setDawaMainCategory(String dawaMainCategory) {
        this.dawaMainCategory = dawaMainCategory;
    }

    public String getDawaSubCategory() {
        return dawaSubCategory;
    }

    public void setDawaSubCategory(String dawaSubCategory) {
        this.dawaSubCategory = dawaSubCategory;
    }

    public String getDawaActivityDateH() {
        return dawaActivityDateH;
    }

    public void setDawaActivityDateH(String dawaActivityDateH) {
        this.dawaActivityDateH = dawaActivityDateH;
    }

    public String getDawaActivityTime() {
        return dawaActivityTime;
    }

    public void setDawaActivityTime(String dawaActivityTime) {
        this.dawaActivityTime = dawaActivityTime;
    }

    public String getDawaActivityRepetition() {
        return dawaActivityRepetition;
    }

    public void setDawaActivityRepetition(String dawaActivityRepetition) {
        this.dawaActivityRepetition = dawaActivityRepetition;
    }

    public String getDawaActivityRepDays() {
        return dawaActivityRepDays;
    }

    public void setDawaActivityRepDays(String dawaActivityRepDays) {
        this.dawaActivityRepDays = dawaActivityRepDays;
    }

    public String getDawaActivLanguage() {
        return dawaActivLanguage;
    }

    public void setDawaActivLanguage(String dawaActivLanguage) {
        this.dawaActivLanguage = dawaActivLanguage;
    }

    public String getWomenPlaceAvailability() {
        return womenPlaceAvailability;
    }

    public void setWomenPlaceAvailability(String womenPlaceAvailability) {
        this.womenPlaceAvailability = womenPlaceAvailability;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGrandFatherName() {
        return grandFatherName;
    }

    public void setGrandFatherName(String grandFatherName) {
        this.grandFatherName = grandFatherName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDawaActivRemarks() {
        return dawaActivRemarks;
    }

    public void setDawaActivRemarks(String dawaActivRemarks) {
        this.dawaActivRemarks = dawaActivRemarks;
    }

    public String getEXFirstName() {
        return eXFirstName;
    }

    public void setEXFirstName(String eXFirstName) {
        this.eXFirstName = eXFirstName;
    }

    public String getEXFatherName() {
        return eXFatherName;
    }

    public void setEXFatherName(String eXFatherName) {
        this.eXFatherName = eXFatherName;
    }

    public String getEXGrandFatherName() {
        return eXGrandFatherName;
    }

    public void setEXGrandFatherName(String eXGrandFatherName) {
        this.eXGrandFatherName = eXGrandFatherName;
    }

    public String getEXFamilyName() {
        return eXFamilyName;
    }

    public void setEXFamilyName(String eXFamilyName) {
        this.eXFamilyName = eXFamilyName;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ResponceServer{" +
                "id='" + id + '\'' +
                ", dawaReqDateH='" + dawaReqDateH + '\'' +
                ", region='" + region + '\'' +
                ", cityVillage='" + cityVillage + '\'' +
                ", district='" + district + '\'' +
                ", dawaOffice='" + dawaOffice + '\'' +
                ", dawaActivityLoc='" + dawaActivityLoc + '\'' +
                ", mosqueName='" + mosqueName + '\'' +
                ", locXCoord='" + locXCoord + '\'' +
                ", locYCoord='" + locYCoord + '\'' +
                ", reqStatusLajnah='" + reqStatusLajnah + '\'' +
                ", dawaActivityType='" + dawaActivityType + '\'' +
                ", dawaActivitiesInfoId='" + dawaActivitiesInfoId + '\'' +
                ", dawaAddress='" + dawaAddress + '\'' +
                ", dawaManyActivities='" + dawaManyActivities + '\'' +
                ", dawaMainCategory='" + dawaMainCategory + '\'' +
                ", dawaSubCategory='" + dawaSubCategory + '\'' +
                ", dawaActivityDateH='" + dawaActivityDateH + '\'' +
                ", dawaActivityTime='" + dawaActivityTime + '\'' +
                ", dawaActivityRepetition='" + dawaActivityRepetition + '\'' +
                ", dawaActivityRepDays='" + dawaActivityRepDays + '\'' +
                ", dawaActivLanguage='" + dawaActivLanguage + '\'' +
                ", womenPlaceAvailability='" + womenPlaceAvailability + '\'' +
                ", nationality='" + nationality + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", grandFatherName='" + grandFatherName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", locationName='" + locationName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", dawaActivRemarks='" + dawaActivRemarks + '\'' +
                ", eXFirstName='" + eXFirstName + '\'' +
                ", eXFatherName='" + eXFatherName + '\'' +
                ", eXGrandFatherName='" + eXGrandFatherName + '\'' +
                ", eXFamilyName='" + eXFamilyName + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
