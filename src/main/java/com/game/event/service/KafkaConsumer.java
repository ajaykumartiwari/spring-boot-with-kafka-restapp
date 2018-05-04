package com.game.event.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.game.event.model.GameEvent;
import com.game.event.repo.EventStorage;

@Service
public class KafkaConsumer {
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@Autowired
	EventStorage storage;
		
	@KafkaListener(topics="${topic.jsa-kafka-topic}")
    public void processEvent(GameEvent game) {
		
		System.out.println("received content = " + game);
		log.info("received content = '{}'", game);
		storage.put(game);
    }
}