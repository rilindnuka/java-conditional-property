package com.rilind.javaconditionalproperty.services.impl;

import com.rilind.javaconditionalproperty.services.MapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Primary
@Service
@ConditionalOnProperty(
        name = "application.map",
        havingValue = "log",
        matchIfMissing = true
)
public class DefaultMap implements MapService {
    private Logger LOG = LoggerFactory.getLogger(DefaultMap.class);

    @PostConstruct
    void init() {
        LOG.info("Using the default LogOnly map as the Map Source");
    }
    @Override
    public String getMap() {
        return "Default LogOnly Map";
    }
}
