package com.test.kakao.VO.SkillPayload;

import java.util.HashMap;
import java.util.Map;

public class Action {
	String id;
	// 스킬의 고유한 식별자
	String name;
	// 설정된 스킬의 이름
	Map<String, String> params = new HashMap<String, String>();
	// 사용자의 발화로부터 추출한 파라미터 정보
	Map<String, ClientExtra> detailParams = new HashMap<String, ClientExtra>();

	// 사용자의 발화로부터 추출한 엔티티의 상세 정보
	Map<String, ClientExtra> clientExtra = new HashMap<String, ClientExtra>();

	public Map<String, ClientExtra> getClientExtra() {
		return clientExtra;
	}

	public void setClientExtra(Map<String, ClientExtra> clientExtra) {
		this.clientExtra = clientExtra;
	}

	// 사용자 발화로 추가적인 정보 제공
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

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public Map<String, ClientExtra> getDetailParams() {
		return detailParams;
	}

	public void setDetailParams(Map<String, ClientExtra> detailParams) {
		this.detailParams = detailParams;
	}

	@Override
	public String toString() {
		return "Action [id=" + id + ", name=" + name + ", params=" + params + ", detailParams=" + detailParams
				+ ", clientExtra=" + clientExtra + "]";
	}

}
