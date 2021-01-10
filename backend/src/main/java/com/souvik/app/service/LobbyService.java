package com.souvik.app.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.checkerframework.checker.units.qual.C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.app.AppConstants;
import com.souvik.app.entity.Lobby;
import com.souvik.app.entity.Member;
import com.souvik.app.repo.LobbyRepository;
import com.souvik.app.repo.MemberRepository;
import com.souvik.app.request.AddMember;
import com.souvik.app.request.CreateLobby;
import com.souvik.app.request.LotteryRequest;

@Service
public class LobbyService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LobbyRepository<C> lobbyRepo;
	
	@Autowired
	MemberRepository<C> memberRepo;
	
	public Map<String, Object> getAllLobby() {
		Map<String,Object> response= new HashMap<>();
		try{
			response.put("lobbyList", lobbyRepo.findAll());
		}catch(Exception e){
			logger.info(e.getLocalizedMessage());
		}
		return response;
	}
	
	public Map<String,Object> addLobby(CreateLobby lobbyRequest){
		Map<String,Object> response= new HashMap<>();
		try{
			Lobby lobby = new Lobby();
			lobby.setEntryPrice(Integer.parseInt(lobbyRequest.getEntryPrice()));
			lobby.setMemberRequired(Integer.parseInt(lobbyRequest.getMemberCount()));
			lobby.setCreatedTime(new Date());
			lobby.setLobbyName(lobbyRequest.getLobbyName());
			lobby.setMemberRegistered(0);
			lobby.setWinnerPrize(lobby.getEntryPrice()*lobby.getMemberRequired()*0.95);
			lobby.setHouseCharges(lobby.getEntryPrice()*lobby.getMemberRequired()*0.05);
			lobby=(Lobby) lobbyRepo.save(lobby);
			response.put("lobbyId", lobby.getLobbyId());
			response.put(AppConstants.STATUS, AppConstants.SUCCESS);
		}catch(Exception e){
			response.put(AppConstants.STATUS,  AppConstants.FAILED);
			logger.info(e.getLocalizedMessage());
		}
		return response;
	}

	public Map<String, Object> addMember(AddMember memberRequest) {
		Map<String,Object> response= new HashMap<>();
		try{
			Member member= new Member();
			member.setLobbyId(Integer.parseInt(memberRequest.getLobbyId()));
			member.setMemberName(memberRequest.getMemberName());
			member=(Member)  memberRepo.save(member);
			response.put("memberId", member.getMemberId());
			Lobby lobby =(Lobby) lobbyRepo.findOneByLobbyId(member.getLobbyId());
			lobby.setMemberRegistered(lobby.getMemberRegistered()+1);
			lobbyRepo.save(lobby);
			response.put("memberRegistered", lobby.getMemberRegistered());
			response.put(AppConstants.STATUS,  AppConstants.SUCCESS);
		}catch(Exception e){
			response.put(AppConstants.STATUS, AppConstants.FAILED);
			logger.info(e.getLocalizedMessage());
		}
		return response;
	}

	public Map<String, Object> startLottery(LotteryRequest request) {
		Map<String,Object> response= new HashMap<>();
		try{
			List<Member> members= memberRepo.findByLobbyId(Integer.parseInt(request.getLotteryId()));
			logger.info(members.size()+"");
			int randomNumber=(int)Math.floor(Math.random() * members.size()) + 1  ;
			Member winner= members.get(randomNumber-1);
			logger.info("winner--"+winner.getMemberName()  );
			response.put("winnerName", winner.getMemberName());
			response.put("winnerId", winner.getMemberId());
			Lobby lobby =(Lobby) lobbyRepo.findOneByLobbyId(winner.getLobbyId());
			lobby.setWinnerId(winner.getMemberId()+"");
			lobbyRepo.save(lobby);
			response.put(AppConstants.STATUS,  AppConstants.SUCCESS);
		}catch(Exception e){
			response.put(AppConstants.STATUS, AppConstants.FAILED);
			logger.info(e.getLocalizedMessage());
		}
		return response;
	}

	public Map<String, Object> getMember(LotteryRequest request) {
		Map<String,Object> response= new HashMap<>();
		try{
			response.put("member", memberRepo.findOneByMemberId(Integer.parseInt(request.getMemberId())));
		}catch(Exception e){
			logger.info(e.getLocalizedMessage());
		}
		return response;
	}
	
}
