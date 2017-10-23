 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

/**
 * Created by asrivastava on 3/1/2017.
 */
public enum PositionEventHeadingType {

    UNKNOWN(0),
    NORTH(1),
    NORTHEAST(2),
    EAST(3),
    SOUTHEAST(4),
    SOUTH(5),
    SOUTHWEST(6),
    WEST(7),
    NORTHWEST(8);

    private int value;

    private PositionEventHeadingType(int val) {
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
