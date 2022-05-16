package com.rilind.javaconditionalproperty.services.impl;

import com.rilind.javaconditionalproperty.services.MapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@ConditionalOnProperty(
        name = "application.map",
        havingValue = "google",
        matchIfMissing = false
)
public class GoogleMapImpl implements MapService {
    private Logger LOG = LoggerFactory.getLogger(GoogleMapImpl.class);

    @PostConstruct
    void init() {
        LOG.info("Using Google map as the Map Source");
    }

    @Override
    public String getMap() {
        return "Google Map";
    }
}
