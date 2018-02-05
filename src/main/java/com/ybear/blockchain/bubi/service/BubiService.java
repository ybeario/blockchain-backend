package com.ybear.blockchain.bubi.service;

import com.ybear.blockchain.bubi.entity.APP_INFO;
import com.ybear.blockchain.bubi.entity.URLConstant;

import bubi4j.common.BubiServiceFactory;

public class BubiService {
	private static BubiServiceFactory factory = null;
	public static BubiServiceFactory BubiServiceFactory() {
		factory = BubiServiceFactory.getInstance(URLConstant.BASE_URL, APP_INFO.APP_ID, APP_INFO.APP_SECREAT);
		return factory;
	}
}
