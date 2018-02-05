package com.ybear.blockchain.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ybear.blockchain.bubi.service.AuthenticationService;
import com.ybear.blockchain.bubi.service.RegisterService;
import com.ybear.blockchain.command.UserRegisterCommand;
import com.ybear.blockchain.controller.annotation.ResponseWrapper;

@RestController
@ResponseWrapper
@RequestMapping(value = "/bubi")
public class TestBubiController {
	@RequestMapping(value = "/auth")
	public String Authticate() {
		try {
			return AuthenticationService.getAuthenticationToken();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String RegisterableService(@RequestBody UserRegisterCommand command) {
		String result=null;
		try {
			result=RegisterService.Regist(command.getUserName(), command.getPassWord());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}