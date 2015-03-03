package com.skisontherun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skisontherun.view.Notification;
import com.skisontherun.view.NotificationType;
import com.skisontherun.view.Response;

@Controller
@RequestMapping("/app")
public class ApplicationController {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping("/initialization-request")
	public @ResponseBody Response initializationRequest() {
		Response response = new Response();
		Notification notification = new Notification("Skis on the Run!", "Welcome to our store!", NotificationType.INFO);
		response.addCommand(notification);
		return response;
	}

}