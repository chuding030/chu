package com.test.kakao.VO.Common;

public class Button {
	@Override
	public String toString() {
		return "Button [label=" + label + ", action=" + action + ", webLinkUrl=" + webLinkUrl + ", osLink=" + osLink
				+ ", messageText=" + messageText + ", phoneNumber=" + phoneNumber + ", blockId=" + blockId + "]";
	}

	String label;
	// ��ư�� ������ ����
	String action;
	// ��ư Ŭ���� ����� �۾���
	String webLinkUrl;
	// �� �������� ���� webLinkUrl �� �ּ�
	Link osLink;
	// osLink ���� ���� ���� �ּҷ� �̵��ϰų� ���� ����
	String messageText;
	// message: ������� ��ȭ�� messageText�� �������ϴ�. (�ٷΰ��� ������ �޼��� ���� ��ɰ� ����)
	// block: ��� ����� ������� ��ȭ�� ����˴ϴ�.
	String phoneNumber;
	// phoneNumber�� �ִ� ��ȣ�� ��ȭ
	String blockId;
	// blockId�� ���� ����� ȣ��

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

	public String getWebLinkUrl() {
		return webLinkUrl;
	}

	public void setWebLinkUrl(String webLinkUrl) {
		this.webLinkUrl = webLinkUrl;
	}

	public Link getOsLink() {
		return osLink;
	}

	public void setOsLink(Link osLink) {
		this.osLink = osLink;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

}
