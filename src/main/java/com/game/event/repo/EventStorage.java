package com.game.event.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.game.event.model.GameEvent;

@Component
public class EventStorage {

private List<GameEvent> storage = new ArrayList<GameEvent>();
	
	public void put(GameEvent event){
		storage.add(event);
	}
	
	public String toString(){
		StringBuffer info = new StringBuffer();
		storage.forEach(msg->info.append(msg).append("<br/>"));
		return info.toString();
	}
	
	public void clear(){
		storage.clear();
	}
}
