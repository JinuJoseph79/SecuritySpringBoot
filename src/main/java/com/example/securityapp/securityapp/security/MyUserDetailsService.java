package com.example.securityapp.securityapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.securityapp.securityapp.entities.Users;
import com.example.securityapp.securityapp.repositories.UserRepository;

@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = userRepo.findByUsername(username);
		System.out.println(user);
		if (username==null)
			throw new UsernameNotFoundException ("Users 404");
				
		return new UserPrincipal (user);
	}

}
