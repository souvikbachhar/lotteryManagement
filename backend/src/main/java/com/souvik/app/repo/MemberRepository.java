package com.souvik.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souvik.app.entity.Member;

public interface MemberRepository<C> extends CrudRepository<Member, Long> {

	List<Member> findByLobbyId(int id);
	
	Member findOneByMemberId(int id);
}
