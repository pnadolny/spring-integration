 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.fourkites.beans;

 import com.fasterxml.jackson.annotation.JsonProperty;

 public class StopUpdate  {
     @JsonProperty("ProNumber")
     private String proNumber;

     public String getProNumber() {
         return proNumber;
     }

     public void setProNumber(String proNumber) {
         this.proNumber = proNumber;
     }


 }
