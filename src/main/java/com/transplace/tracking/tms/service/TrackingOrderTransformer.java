package com.transplace.tracking.tms.service;

import com.transplace.tracking.order.beans.TrackingOrder;
import com.transplace.tracking.tms.beans.CheckCall;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class TrackingOrderTransformer {

    public Message<CheckCall> transform(Message<TrackingOrder> message)
   {
        Message<CheckCall> checkCallMessage = new Message<CheckCall>() {
            @Override
            public CheckCall getPayload() {
                CheckCall checkCall = new CheckCall();
                checkCall.setCheckCallType(message.getPayload().getProNumber());
                return checkCall;
            }

            @Override
            public MessageHeaders getHeaders() {
                return null;
            }
        };
        return checkCallMessage;
    }
}
