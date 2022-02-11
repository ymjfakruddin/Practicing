package com.info.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {@Bean
	public Login login()
	{
	Login in=new Login();
	
    
    in.setUserid("kavitay@gmail.com");
    in.setPassword("kavita@123");
	return in;
}

}