package com.capgemini.springcore.anotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class ISuzu implements Engine {

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "4-Stroke Petrol";
	}

}
