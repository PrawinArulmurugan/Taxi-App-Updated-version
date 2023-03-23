package com.uc.service;

import org.springframework.stereotype.Service;

import com.uc.businessbean.RegistrationBean;
@Service
public interface RegistrationService {

	RegistrationBean saveDetails(RegistrationBean registrationBean)throws Exception;

	

}
