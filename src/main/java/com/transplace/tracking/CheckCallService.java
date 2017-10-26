package com.transplace.tracking;

import com.transplace.tracking.beans.TrackingOrder;
import com.transplace.tracking.tms.CheckCall;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class CheckCallService {


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
