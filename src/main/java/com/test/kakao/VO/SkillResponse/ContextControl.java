package com.test.kakao.VO.SkillResponse;

import java.util.ArrayList;

public class ContextControl {
	@Override
	public String toString() {
		return "ContextControl [values=" + values + "]";
	}

	ArrayList<ContextValue> values = new ArrayList<ContextValue>();

	public ArrayList<ContextValue> getValues() {
		return values;
	}

	public void setValues(ArrayList<ContextValue> values) {
		this.values = values;
	}

}
