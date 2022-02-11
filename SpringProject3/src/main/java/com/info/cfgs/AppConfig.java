package com.info.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.info.beans.User;

@Configuration
public class AppConfig {@Bean
	public Login login()
	{
	Login in=new Login();
	
    
    in.setUserid("kavitay@gmail.com");
    in.setPassword("kavita@123");
	return in;
}
@Bean
public User user()
{
	User user=new User();
	user.setName("kavita");
	user.setFlatNo("m");
	user.setLogin(login());
	return user;
	

}

}