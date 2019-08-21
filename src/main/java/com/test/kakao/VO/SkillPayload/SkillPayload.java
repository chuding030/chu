package com.test.kakao.VO.SkillPayload;

public class SkillPayload {
	UserRequest userRequest = new UserRequest();
	Bot bot = new Bot();
	Action action = new Action();

	public UserRequest getUserRequest() {
		return userRequest;
	}

	public void setUserRequest(UserRequest userRequest) {
		this.userRequest = userRequest;
	}

	@Override
	public String toString() {
		return "SkillPayload [userRequest=" + userRequest + ", bot=" + bot + ", action=" + action + "]";
	}

	public Bot getBot() {
		return bot;
	}

	public void setBot(Bot bot) {
		this.bot = bot;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

}
