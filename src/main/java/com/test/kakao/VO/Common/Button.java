package com.test.kakao.VO.Common;

public class Button {
	@Override
	public String toString() {
		return "Button [label=" + label + ", action=" + action + ", webLinkUrl=" + webLinkUrl + ", osLink=" + osLink
				+ ", messageText=" + messageText + ", phoneNumber=" + phoneNumber + ", blockId=" + blockId + "]";
	}

	String label;
	// 버튼에 적히는 문구
	String action;
	// 버튼 클릭시 수행될 작업입
	String webLinkUrl;
	// 웹 브라우저를 열고 webLinkUrl 의 주소
	Link osLink;
	// osLink 값에 따라서 웹의 주소로 이동하거나 앱을 실행
	String messageText;
	// message: 사용자의 발화로 messageText를 내보냅니다. (바로가기 응답의 메세지 연결 기능과 동일)
	// block: 블록 연결시 사용자의 발화로 노출됩니다.
	String phoneNumber;
	// phoneNumber에 있는 번호로 전화
	String blockId;
	// blockId를 갖는 블록을 호출

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
