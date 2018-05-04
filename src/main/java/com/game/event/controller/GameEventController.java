package com.game.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.event.model.GameEvent;
import com.game.event.repo.EventStorage;
import com.game.event.service.KafkaProducer;

@RestController
@RequestMapping(value = "/api/kafka")
public class GameEventController {

	@Autowired
	KafkaProducer producer;

	@Autowired
	EventStorage storage;GameEvent data;

	@GetMapping(value = "/producer")
	public String producer(GameEvent data) {
		data = new GameEvent(1, "Ajay", 100, "Java", "male", "10", "India", "Running", 101, "c", "6");
		System.out.println("Data send...." + data);
		producer.send(data);

		return "Data Produced Successfully....";
	}

	@GetMapping(value = "/consumer")
	public String getAllRecievedMessage() {
		String messages = storage.toString();
		storage.clear();

		return messages;
	}
	
	
	
}
