package com.test.kakao.VO.SkillResponse;

import java.util.HashMap;
import java.util.Map;

public class ContextValue {
	@Override
	public String toString() {
		return "ContextValue [name=" + name + ", lifeSpan=" + lifeSpan + ", params=" + params + "]";
	}

	String name;
	// �����Ϸ��� output ���ؽ�Ʈ�� �̸�
	int lifeSpan;
	// �����Ϸ��� ouptut ���ؽ�Ʈ�� lifeSpan
	Map<String, String> params = new HashMap<String, String>();
	// output ���ؽ�Ʈ�� �����ϴ� �߰� ������

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
