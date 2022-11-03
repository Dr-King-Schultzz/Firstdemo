package com.tests;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class Logintest extends BaseClass{

	@Test
	public void test() {
		pu.readProperty("browser");
	}
	
}
