package com.transplace.tracking.fourkites;

import com.transplace.tracking.fourkites.beans.StopUpdate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class FourkitesTransformerService {

    public void transform(Message<StopUpdate> msg) {
        msg.getHeaders();
        msg.getPayload();
    }

}
