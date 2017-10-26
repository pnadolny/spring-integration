package com.transplace.tracking.fourkites;

import com.transplace.tracking.fourkites.beans.StopUpdate;
import com.transplace.tracking.tms.CheckCall;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class FourkitesTransformerService {

    public Message<CheckCall> transform(Message<StopUpdate> msg) {
        msg.getHeaders();
        msg.getPayload();

        Message<CheckCall> checkCallMessage = new Message<CheckCall>() {
            @Override
            public CheckCall getPayload() {

                CheckCall checkCall = new CheckCall();
                checkCall.setCheckCallType("ARRIVAL");
                return checkCall;
            }
            @Override
            public MessageHeaders getHeaders() {
                return msg.getHeaders();
            }
        };
        return checkCallMessage;
    }

}
