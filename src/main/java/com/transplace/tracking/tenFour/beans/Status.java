 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

import java.util.Date;

 /**
  * Created by asrivastava on 3/23/2017.
  */
 public class Status {

     private long meID;
     private String freightHaulerProviderXID;
     private String freightProviderReferenceNumber;
     private String carrierScac;
     private Date reportTime;
     private String shipmentStatusType;
     private String estimatedDeliveryDate;
     private boolean retainEstimatedDeliveryDate;
     private Long userId;

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

     public Date getReportTime() {
         return reportTime;
     }

     public void setReportTime(Date reportTime) {
         this.reportTime = reportTime;
     }

     public String getShipmentStatusType() {
         return shipmentStatusType;
     }

     public void setShipmentStatusType(String shipmentStatusType) {
         this.shipmentStatusType = shipmentStatusType;
     }

     public String getEstimatedDeliveryDate() {
         return estimatedDeliveryDate;
     }

     public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
         this.estimatedDeliveryDate = estimatedDeliveryDate;
     }

     public boolean isRetainEstimatedDeliveryDate() {
         return retainEstimatedDeliveryDate;
     }

     public void setRetainEstimatedDeliveryDate(boolean retainEstimatedDeliveryDate) {
         this.retainEstimatedDeliveryDate = retainEstimatedDeliveryDate;
     }

     public Long getUserId() {
         return userId;
     }

     public void setUserId(Long userId) {
         this.userId = userId;
     }
 }
