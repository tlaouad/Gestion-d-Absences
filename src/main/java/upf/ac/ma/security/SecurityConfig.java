package upf.ac.ma.security;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserDetailsService userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication().withUser("admin@gmail.com").password(
		 * "{noop}1234").roles("ADMIN","USER");
		 * auth.inMemoryAuthentication().withUser("user@gmail.com").password(
		 * "{noop}1234").roles("USER");
		 */	
		//auth.jdbcAuthentication().dataSource(dataSource).authoritiesByUsernameQuery("select username as principal,password as credentials,active from users where username=?").authoritiesByUsernameQuery("select username as principal ,role as role from users where username=?").rolePrefix("ROLE_");
		auth.userDetailsService(userDetailsService);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/auth_login");
		http.logout().logoutUrl("/lougout").logoutSuccessUrl("/auth_login");
		http.authorizeRequests().antMatchers("/menu","/enseignants").hasRole("Etudiant").and().csrf().disable();
		http.exceptionHandling().accessDeniedPage("/401");
	}
	
	
}
