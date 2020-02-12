package com.dilu.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.dilu.domain.Employee;

@Configuration
@ComponentScan(basePackages = "com.dilu.domain")
@ImportResource(locations ="com/dilu/confg/applicationContext.xml")
public class AppConfig {

}
