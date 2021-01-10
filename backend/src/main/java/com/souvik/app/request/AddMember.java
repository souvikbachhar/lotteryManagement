package com.souvik.app.request;

public class AddMember {

	private String memberName;
	private String lobbyId;
	
	public String getLobbyId() {
		return lobbyId;
	}
	public void setLobbyId(String lobbyId) {
		this.lobbyId = lobbyId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
