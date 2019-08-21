package com.test.kakao.VO.SkillResponse;

public class Response {
	@Override
	public String toString() {
		return "Response [status=" + status + ", value=" + value + "]";
	}

	String status;
	String value;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
