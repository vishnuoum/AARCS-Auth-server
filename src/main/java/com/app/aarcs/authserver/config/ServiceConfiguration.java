package com.app.aarcs.authserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:properties/app-${spring.profiles.active}.properties")
@PropertySource("classpath:properties/secret-${spring.profiles.active}.properties")
public class ServiceConfiguration {}
