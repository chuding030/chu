package com.test.kakao.VO.SkillResponse;

public class QuickReply {
	// 이부분은 따로 더 보기

	String label;
	String action;
	String messageText;
	String blockId;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	@Override
	public String toString() {
		return "QuickReply [label=" + label + ", action=" + action + ", messageText=" + messageText + ", blockId="
				+ blockId + "]";
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
}
