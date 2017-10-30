package com.transplace.tracking.history.beans.service;

import com.transplace.tracking.order.beans.TrackingOrder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    public void process(Message<TrackingOrder> message) {

        System.out.println("In HistoryService");
        // Save to DB
    }
}
