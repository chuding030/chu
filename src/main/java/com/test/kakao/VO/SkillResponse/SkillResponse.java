package com.test.kakao.VO.SkillResponse;

import com.test.kakao.VO.SkillPayload.Action;
import com.test.kakao.VO.SkillPayload.UserRequest;

public class SkillResponse {
	@Override
	public String toString() {
		return "SkillResponse [version=" + version + ", template=" + template + ", context=" + context
				+ ", userRequest=" + userRequest + ", action=" + action + ", response=" + response + "]";
	}

	String version;
	SkillTemplate template = new SkillTemplate();
	ContextControl context = new ContextControl();

	// 현재 사용 안함
	UserRequest userRequest = new UserRequest();
	Action action = new Action();
	Response response = new Response();

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public UserRequest getUserRequest() {
		return userRequest;
	}

	public void setUserRequest(UserRequest userRequest) {
		this.userRequest = userRequest;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public SkillTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SkillTemplate template) {
		this.template = template;
	}

	public ContextControl getContext() {
		return context;
	}

	public void setContext(ContextControl context) {
		this.context = context;
	}

}
