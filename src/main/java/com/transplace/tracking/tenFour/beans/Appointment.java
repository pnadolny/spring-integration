 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

/**
 * Created by asrivastava on 3/1/2017.
 */
public class Appointment  {

    private String appointmentDatePart;
    private String appointmentEndTimePart;
    private String appointmentStartTimePart;

    public String getAppointmentDatePart() {
        return appointmentDatePart;
    }

    public void setAppointmentDatePart(String appointmentDatePart) {
        this.appointmentDatePart = appointmentDatePart;
    }

    public String getAppointmentEndTimePart() {
        return appointmentEndTimePart;
    }

    public void setAppointmentEndTimePart(String appointmentEndTimePart) {
        this.appointmentEndTimePart = appointmentEndTimePart;
    }

    public String getAppointmentStartTimePart() {
        return appointmentStartTimePart;
    }

    public void setAppointmentStartTimePart(String appointmentStartTimePart) {
        this.appointmentStartTimePart = appointmentStartTimePart;
    }


}
