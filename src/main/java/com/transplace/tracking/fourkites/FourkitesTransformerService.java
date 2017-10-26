package com.transplace.tracking.fourkites;

import com.transplace.tracking.beans.TrackingOrder;
import com.transplace.tracking.fourkites.beans.StopUpdate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class FourkitesTransformerService {

    public Message<TrackingOrder> transform(Message<StopUpdate> msg) {
        msg.getHeaders();
        msg.getPayload();

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
