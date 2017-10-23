 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

import com.google.gson.annotations.Expose;

import java.util.Date;

 /**
  * Created by asrivastava on 3/7/2017.
  */
 public class StopStatus {

     private String freightHaulerProviderXID;
     private String freightProviderReferenceNumber;
     private String carrierScac;
     private Date reportTime;
     private String positionEventTypeID;
     private int stopSequence;
     private Appointment appointment;
     private Long userId;

     @Expose(serialize = false)
     private Long meID;

     public Long getMeID() {
         return meID;
     }

     public void setMeID(Long meID) {
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

     public Date getReportTime() {
         return reportTime;
     }

     public void setReportTime(Date reportTime) {
         this.reportTime = reportTime;
     }

     public String getPositionEventTypeID() {
         return positionEventTypeID;
     }

     public void setPositionEventTypeID(String positionEventTypeID) {
         this.positionEventTypeID = positionEventTypeID;
     }

     public int getStopSequence() {
         return stopSequence;
     }

     public void setStopSequence(int stopSequence) {
         this.stopSequence = stopSequence;
     }

     public Appointment getAppointment() {
         return appointment;
     }

     public void setAppointment(Appointment appointment) {
         this.appointment = appointment;
     }


     public Long getUserId() {
         return userId;
     }

     public void setUserId(Long userId) {
         this.userId = userId;
     }

     @Override
     public String toString() {
         return "StopStatus{" + "freightHaulerProviderXID='" + freightHaulerProviderXID + '\'' + ", freightProviderReferenceNumber='"
                 + freightProviderReferenceNumber + '\'' + ", carrierScac='" + carrierScac + '\'' + ", reportTime=" + reportTime
                 + ", positionEventTypeID='" + positionEventTypeID + '\'' + ", stopSequence=" + stopSequence + ", appointment="
                 + appointment + ", userId=" + userId + ", meID=" + meID + '}';
     }
 }
