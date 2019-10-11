package com.cts.trainings.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cts.trainings.repository.TrainingsRepository;

@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
/*@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// Authentication : User --> Roles
	  @Override
	    protected void configure(HttpSecurity http) throws Exception {    
	        http
	            .csrf().disable()
	            .authorizeRequests()
	                .anyRequest().permitAll();
	        }*/
//	@Autowired
//	UserRepository userRepo;
	/*protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication()
		      .passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance())
		      .withUser("user1").password("user123").roles("USER").and()
		      .withUser("admin1").password("admin123").roles("USER", "ADMIN");
	}

	// Authorization : Role -> Access
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
		        .antMatchers("/user/**").hasRole("USER")
		        .antMatchers("/**").hasRole("ADMIN")
		        .and().csrf().disable().headers().frameOptions().disable()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}*/
//	@Override  
//public void addCorsMappings(CorsRegistry registry) {
//    registry.addMapping("/**");
//	  }


