package com.test.kakao.VO.SkillPayload;

public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", type=" + type + ", properties=" + properties + "]";
	}

	String id;
	// ����ڸ� �ĺ��� �� �ִ� key
	String type;
	// ����� botUserKey�� ����
	UserProperteis properties = new UserProperteis();

	// �߰������� �����ϴ� ������� �Ӽ� ����
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
