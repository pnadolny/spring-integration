 
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
