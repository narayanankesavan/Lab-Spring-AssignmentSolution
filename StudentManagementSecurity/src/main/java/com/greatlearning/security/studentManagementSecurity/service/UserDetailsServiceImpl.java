package com.greatlearning.security.studentManagementSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.security.studentManagementSecurity.entity.User;
import com.greatlearning.security.studentManagementSecurity.repository.UserRepository;
import com.greatlearning.security.studentManagementSecurity.securer.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.getUserByUserName(username);
		
		if(user == null)
		{
			throw new UsernameNotFoundException("Sorry User Not found");
		}
		return new MyUserDetails(user);
		
	}

}
