package com.transplace.tracking.fourkites.service;

import com.transplace.tracking.order.beans.TrackingOrder;
import com.transplace.tracking.fourkites.beans.StopUpdate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class StopUpdateTransformer {

    public Message<TrackingOrder> transform(Message<StopUpdate> msg) {

        Message<TrackingOrder> trackingOrderMessage = new Message<TrackingOrder>() {
            @Override
            public TrackingOrder getPayload() {

                TrackingOrder trackingOrder = new TrackingOrder();
                trackingOrder.setProNumber(msg.getPayload().getProNumber());
                return trackingOrder;
            }
            @Override
            public MessageHeaders getHeaders() {
                return msg.getHeaders();
            }
        };
        return trackingOrderMessage;
    }

}
