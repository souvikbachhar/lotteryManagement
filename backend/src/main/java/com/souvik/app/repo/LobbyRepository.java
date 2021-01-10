package com.souvik.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.souvik.app.entity.Lobby;


public interface LobbyRepository<C> extends CrudRepository<Lobby, Long> {

	Lobby findOneByLobbyId(long id);
}
