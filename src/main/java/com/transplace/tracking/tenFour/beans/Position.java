 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

import java.util.Date;

 /**
  * Created by asrivastava on 3/7/2017.
  */
 public class Position {
     private String freightHaulerProviderXID;
     private String freightProviderReferenceNumber;
     private String carrierScac;
     private String streetAddress1;
     private String streetAddress2;
     private String city;
     private String state;
     private String postalCode;
     private String country;
     private Number latitude;
     private Number longitude;
     private Date positionReportTime;
     private Number positionSourceType;
     private Number positionEventType;
     private PositionEventHeadingType positionEventHeadingType;
     private String positionEventHeading;
     private Long userId;

     private long meID;

     public long getMeID() {
         return meID;
     }

     public void setMeID(long meID) {
         this.meID = meID;
     }

     public String getFreightHaulerProviderXID() {
         return freightHaulerProviderXID;
     }

     public void setFreightHaulerProviderXID(String freightHaulerProviderXID) {
         this.freightHaulerProviderXID = freightHaulerProviderXID;
     }

     public String getFreightProviderReferenceNumber() {
         return freightProviderReferenceNumber;
     }

     public void setFreightProviderReferenceNumber(String freightProviderReferenceNumber) {
         this.freightProviderReferenceNumber = freightProviderReferenceNumber;
     }

     public String getCarrierScac() {
         return carrierScac;
     }

     public void setCarrierScac(String carrierScac) {
         this.carrierScac = carrierScac;
     }

     public String getStreetAddress1() {
         return streetAddress1;
     }

     public void setStreetAddress1(String streetAddress1) {
         this.streetAddress1 = streetAddress1;
     }

     public String getStreetAddress2() {
         return streetAddress2;
     }

     public void setStreetAddress2(String streetAddress2) {
         this.streetAddress2 = streetAddress2;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getState() {
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }

     public String getPostalCode() {
         return postalCode;
     }

     public void setPostalCode(String postalCode) {
         this.postalCode = postalCode;
     }

     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     public Number getLatitude() {
         return latitude;
     }

     public void setLatitude(Number latitude) {
         this.latitude = latitude;
     }

     public Number getLongitude() {
         return longitude;
     }

     public void setLongitude(Number longitude) {
         this.longitude = longitude;
     }

     public Date getPositionReportTime() {
         return positionReportTime;
     }

     public void setPositionReportTime(Date positionReportTime) {
         this.positionReportTime = positionReportTime;
     }

     public Number getPositionSourceType() {
         return positionSourceType;
     }

     public void setPositionSourceType(Number positionSourceType) {
         this.positionSourceType = positionSourceType;
     }

     public PositionEventHeadingType getPositionEventHeadingType() {
         return positionEventHeadingType;
     }

     public void setPositionEventHeadingType(PositionEventHeadingType positionEventHeadingType) {
         this.positionEventHeadingType = positionEventHeadingType;
     }

     public String getPositionEventHeading() {
         return positionEventHeading;
     }

     public void setPositionEventHeading(String positionEventHeading) {
         this.positionEventHeading = positionEventHeading;
     }


     public Number getPositionEventType() {
         return positionEventType;
     }

     public void setPositionEventType(Number positionEventType) {
         this.positionEventType = positionEventType;
     }

     public Long getUserId() {
         return userId;
     }

     public void setUserId(Long userId) {
         this.userId = userId;
     }

     @Override
     public String toString() {
         return "Position{" +
                 "freightProviderHaulerXID='" + freightHaulerProviderXID + '\'' +
                 ", freightProviderReferenceNumber='" + freightProviderReferenceNumber + '\'' +
                 ", carrierScac='" + carrierScac + '\'' +
                 ", streetAddress1='" + streetAddress1 + '\'' +
                 ", streetAddress2='" + streetAddress2 + '\'' +
                 ", city='" + city + '\'' +
                 ", state='" + state + '\'' +
                 ", postalCode='" + postalCode + '\'' +
                 ", country='" + country + '\'' +
                 ", latitude=" + latitude +
                 ", longitude=" + longitude +
                 ", positionReportTime=" + positionReportTime +
                 ", positionSourceType=" + positionSourceType +
                 ", positionEventHeadingType=" + positionEventHeadingType +
                 ", positionEventHeading='" + positionEventHeading + '\'' +
                 '}';
     }
 }
