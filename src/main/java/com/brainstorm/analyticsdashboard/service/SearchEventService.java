package com.brainstorm.analyticsdashboard.service;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.stereotype.Service;

@Service
public class SearchEventService implements EventService{
    @Override
    public void processEvent(KStream<String, String> sourceStream) {

    }
}