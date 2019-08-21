package com.test.kakao.VO.SkillPayload;

public class UserRequest {
	String timezone;
	Block block;
	String utterance;
	String lang;
	User user;

	public String getTimezone() {
		return timezone;
	}

	@Override
	public String toString() {
		return "UserRequest [timezone=" + timezone + ", block=" + block + ", utterance=" + utterance + ", lang=" + lang
				+ ", user=" + user + "]";
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public String getUtterance() {
		return utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
