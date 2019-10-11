package com.cts.user.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.user.model.User;

public interface UserRepository extends CrudRepository<User,Long> {
	@Modifying
	@Query(value="update user set active = 0 where id = ?1 ",nativeQuery=true)
	public int block(Long id);
	@Modifying
	@Query(value="update user set active = 1 where id = ?1",nativeQuery=true)
	public int unblock(Long id);
}
