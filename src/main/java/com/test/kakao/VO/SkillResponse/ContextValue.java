package com.test.kakao.VO.SkillResponse;

import java.util.HashMap;
import java.util.Map;

public class ContextValue {
	@Override
	public String toString() {
		return "ContextValue [name=" + name + ", lifeSpan=" + lifeSpan + ", params=" + params + "]";
	}

	String name;
	// 수정하려는 output 컨텍스트의 이름
	int lifeSpan;
	// 수정하려는 ouptut 컨텍스트의 lifeSpan
	Map<String, String> params = new HashMap<String, String>();
	// output 컨텍스트에 저장하는 추가 데이터

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

}
