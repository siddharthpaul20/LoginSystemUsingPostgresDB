package com.siddharth.registration;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/registration")
@CrossOrigin(origins = "*")
public class RegistrationController {
	
	public RegistrationController() {
		super();
		this.registrationService = new RegistrationService();
	}

	private RegistrationService registrationService;

	@PostMapping
	public String register(@RequestBody RegistrationRequest request)
	{
		return registrationService.register(request);
	}
}
