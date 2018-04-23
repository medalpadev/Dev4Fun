package com.dev4fun.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.dev4fun.reporting.ReportingInfoAspect;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.dev4fun"})
public class ReportingAppConfig {

	@Bean
	public ReportingInfoAspect reportInfo(){
		return new ReportingInfoAspect();
	}
	
	
	public ReportingAppConfig() {
		// TODO Auto-generated constructor stub
	}

}
