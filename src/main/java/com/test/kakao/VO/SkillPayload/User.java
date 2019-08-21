package com.test.kakao.VO.SkillPayload;

public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", type=" + type + ", properties=" + properties + "]";
	}

	String id;
	// 사용자를 식별할 수 있는 key
	String type;
	// 현재는 botUserKey만 제공
	UserProperteis properties = new UserProperteis();

	// 추가적으로 제공하는 사용자의 속성 정보
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserProperteis getProperties() {
		return properties;
	}

	public void setProperties(UserProperteis properties) {
		this.properties = properties;
	}

}
