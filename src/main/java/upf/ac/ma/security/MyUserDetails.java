package upf.ac.ma.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import upf.ac.ma.entity.Compte;

public class MyUserDetails implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	private String userName;
	
	public MyUserDetails()
	{
		
	}
	
	public MyUserDetails(Compte user) {
		super();
		this.userName = user.getEmail();
		this.password = user.getMotDePasse();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_Etudiant"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "{noop}"+password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
