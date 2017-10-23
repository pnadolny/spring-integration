 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

/**
 * Created by asrivastava on 3/1/2017.
 */
public enum PositionEventType {

    ARRIVED(1),
    DEPARTED(2),
    INTRANSIT(3),
    IDLE(4),
    WAYPOINT(5);

    private int value;

    private PositionEventType(int val) {
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
