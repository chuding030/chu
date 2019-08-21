package com.test.kakao.VO.SkillPayload;

import java.util.HashMap;
import java.util.Map;

public class Action {
	String id;
	// ��ų�� ������ �ĺ���
	String name;
	// ������ ��ų�� �̸�
	Map<String, String> params = new HashMap<String, String>();
	// ������� ��ȭ�κ��� ������ �Ķ���� ����
	Map<String, ClientExtra> detailParams = new HashMap<String, ClientExtra>();

	// ������� ��ȭ�κ��� ������ ��ƼƼ�� �� ����
	Map<String, ClientExtra> clientExtra = new HashMap<String, ClientExtra>();

	public Map<String, ClientExtra> getClientExtra() {
		return clientExtra;
	}

	public void setClientExtra(Map<String, ClientExtra> clientExtra) {
		this.clientExtra = clientExtra;
	}

	// ����� ��ȭ�� �߰����� ���� ����
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
