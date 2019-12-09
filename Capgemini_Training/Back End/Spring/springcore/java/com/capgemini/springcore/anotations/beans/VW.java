package com.capgemini.springcore.anotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VW implements Engine {

	@Override
	public int getCC() {
		return 1600;
	}

	@Override
	public String getType() {
		return "ABCD";
	}

}
