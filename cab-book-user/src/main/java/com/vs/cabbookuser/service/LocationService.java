package com.vs.cabbookuser.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.vs.cabbookuser.constants.AppConstant.CAB_LOCATION;

@Service
public class LocationService {

    @KafkaListener(topics = CAB_LOCATION, groupId = "user-group")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
