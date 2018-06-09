package it.esc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import it.esc.data.User;
import it.esc.data.repository.UserRepository;

@Service
public class UserService {

	
	private static final int ACTIVE_USER=1;
	private static final int INACTIVE_USER=0;
	
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public User toggleUser(String userName)throws Exception{
		User user=Optional.ofNullable(userRepository.findByUserName(userName))
						.orElseThrow(()->new RuntimeException(String.format("User: %s not found",userName)));
		Integer currentUserState=user.getActive();
		user.setActive(currentUserState==ACTIVE_USER?INACTIVE_USER:ACTIVE_USER);
		return userRepository.save(user);
				
	}
}
