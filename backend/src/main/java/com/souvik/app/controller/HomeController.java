package com.souvik.app.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.app.request.AddMember;
import com.souvik.app.request.CreateLobby;
import com.souvik.app.request.LotteryRequest;
import com.souvik.app.service.LobbyService;

@RestController
public class HomeController {

	@Autowired
	LobbyService lobbyService;
	
	@GetMapping("get-lobby")
	public Map<String,Object> getLobby(){
		return lobbyService.getAllLobby();
	}
	
	@PostMapping("add-lobby")
	public Map<String,Object> createLobby(@RequestBody CreateLobby lobbyRequest){
		return lobbyService.addLobby(lobbyRequest);
	}
	
	@PostMapping("add-member")
	public Map<String,Object> addMember(@RequestBody AddMember memberRequest){
		return lobbyService.addMember(memberRequest);
	}
	
	@PostMapping("get-member")
	public Map<String,Object> getMember(@RequestBody LotteryRequest request){
		return lobbyService.getMember(request);
	}
	
	@PostMapping("start-lottery")
	public Map<String,Object> startLottery(@RequestBody LotteryRequest request){
		return lobbyService.startLottery(request);
	}
	
}

