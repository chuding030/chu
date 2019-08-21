package com.test.kakao.VO.SkillPayload;

public class Bot {
	@Override
	public String toString() {
		return "Bot [id=" + id + ", name=" + name + "]";
	}

	String id;
	// 봇의 고유한 식별자
	String name;

	// 설정된 봇의 이름
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
