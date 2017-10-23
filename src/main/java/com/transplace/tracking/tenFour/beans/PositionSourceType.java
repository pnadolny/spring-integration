 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

/**
 * Created by asrivastava on 3/1/2017.
 */
public enum PositionSourceType {

    PUBLICAPI(7);

    private int value;

    private PositionSourceType(int val) {
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
