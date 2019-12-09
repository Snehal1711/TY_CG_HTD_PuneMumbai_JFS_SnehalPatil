package com.capgemini.springcore.anotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.anotations.beans.ISuzu;
import com.capgemini.springcore.anotations.beans.VW;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {

	@Bean(name="isuzu")
	@Primary
	public Engine getISuzu() {
		return new ISuzu();
	}

	@Bean(name="vw")
	public Engine getVW() {
		return new VW();
	}
}// end of class
