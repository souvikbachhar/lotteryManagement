package com.souvik.app.request;

public class CreateLobby {

	private String lobbyName;
	private String memberCount;
	private String entryPrice;
	public String getLobbyName() {
		return lobbyName;
	}
	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}
	public String getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(String memberCount) {
		this.memberCount = memberCount;
	}
	public String getEntryPrice() {
		return entryPrice;
	}
	public void setEntryPrice(String entryPrice) {
		this.entryPrice = entryPrice;
	}
	
}
