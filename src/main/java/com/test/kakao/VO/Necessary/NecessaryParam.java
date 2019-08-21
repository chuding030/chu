package com.test.kakao.VO.Necessary;

import com.test.kakao.VO.SkillPayload.Action;
import com.test.kakao.VO.SkillPayload.User;

public class NecessaryParam {
	boolean isInSlotFilling;
	String utterance;
	Value value = new Value();
	User user = new User();
	Action action = new Action();

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public boolean isInSlotFilling() {
		return isInSlotFilling;
	}

	@Override
	public String toString() {
		return "NecessaryParam [isInSlotFilling=" + isInSlotFilling + ", utterance=" + utterance + ", value=" + value
				+ ", user=" + user + ", action=" + action + "]";
	}

	public void setInSlotFilling(boolean isInSlotFilling) {
		this.isInSlotFilling = isInSlotFilling;
	}

	public String getUtterance() {
		return utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
