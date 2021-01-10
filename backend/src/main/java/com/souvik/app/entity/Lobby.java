package com.souvik.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "lobby_details")
public class Lobby {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lobby_details")
	@SequenceGenerator(sequenceName = "lobby_details_lobby_id_SEQ", allocationSize = 1, name = "lobby_details")
	@Column(name = "lobby_id")
	private Long lobbyId;
	
	@Column(name = "entry_prize")
	private int entryPrice;
	
	@Column(name = "member_required")
	private int memberRequired;
	
	@Column(name = "member_registered")
	private int memberRegistered;
	
	@Column(name = "winner_prize")
	private double winnerPrize;
	
	@Column(name = "house_charges")
	private double houseCharges;
	
	@Column(name = "winner_id")
	private String winnerId;
	
	@Column(name="created_time")
	private Date createdTime;
	
	@Column(name="lobby_name")
	private String lobbyName;

	public Long getLobbyId() {
		return lobbyId;
	}

	public void setLobbyId(Long lobbyId) {
		this.lobbyId = lobbyId;
	}

	public int getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(int entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getMemberRequired() {
		return memberRequired;
	}

	public void setMemberRequired(int memberRequired) {
		this.memberRequired = memberRequired;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getLobbyName() {
		return lobbyName;
	}

	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}

	public int getMemberRegistered() {
		return memberRegistered;
	}

	public void setMemberRegistered(int memberRegistered) {
		this.memberRegistered = memberRegistered;
	}

	public double getWinnerPrize() {
		return winnerPrize;
	}

	public void setWinnerPrize(double winnerPrize) {
		this.winnerPrize = winnerPrize;
	}

	public double getHouseCharges() {
		return houseCharges;
	}

	public void setHouseCharges(double houseCharges) {
		this.houseCharges = houseCharges;
	}

	public String getWinnerId() {
		return winnerId;
	}

	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}
}
