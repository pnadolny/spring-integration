package com.transplace.tracking.tms.beans;

import org.springframework.core.style.ToStringCreator;

public class CheckCall {

    public String getCheckCallType() {
        return checkCallType;
    }

    public void setCheckCallType(String checkCallType) {
        this.checkCallType = checkCallType;
    }

    private String checkCallType;

    public String toString() {
        return new ToStringCreator(this).toString();
    }
}
