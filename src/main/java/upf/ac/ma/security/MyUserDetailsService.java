package upf.ac.ma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import upf.ac.ma.dao.CompteRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return new MyUserDetails(compteRepository.getByUserName(username));
	}

}
