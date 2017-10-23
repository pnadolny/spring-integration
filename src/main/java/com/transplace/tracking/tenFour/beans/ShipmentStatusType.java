 /*********************** 
 * Copyright © Transplace, Inc, 2012. All rights reserved. 
 * Unauthorized copying or usage of this file, via any medium is strictly prohibited. 
 * Proprietary and confidential. Illegal distribution of files prohibited via any manner.
 **********************/
package com.transplace.tracking.tenFour.beans;

/**
 * Created by asrivastava on 3/23/2017.
 */
public enum ShipmentStatusType {

	UNKOWN("0"),
	PENDING("1"),
	DISPATCHED("4"),
	INTRANSIT("5"),
	DELIVERED("6"),
	ENROUTE("7"),
	COMPLETED("8"),
	CANCELLED("9"),
	ATSHIPPER("10"),
	ATCONSIGNEE("11");


	private String value;

	private ShipmentStatusType(String val) {
		this.value = val;
	}

	public String getValue() {
		return this.value;
	}
}
