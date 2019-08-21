package com.test.kakao.VO.Common;

import java.util.ArrayList;

import com.test.kakao.VO.SkillResponse.OutputType.OutputImp;

public class Carousel implements OutputImp {
	String type;
	ArrayList<OutputImp> items;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<OutputImp> getItems() {
		return items;
	}

	public void setItems(ArrayList<OutputImp> items) {
		this.items = items;
	}
}
