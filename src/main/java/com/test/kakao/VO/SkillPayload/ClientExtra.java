package com.test.kakao.VO.SkillPayload;

public class ClientExtra {
	String origin;
	String value;
	String groupName;

	@Override
	public String toString() {
		return "ClientExtra [origin=" + origin + ", value=" + value + ", groupName=" + groupName + "]";
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
