package it.esc.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esc.data.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String userName);
	
}
