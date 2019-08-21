package com.test.kakao.VO.SkillPayload;

public class UserProperteis {
	String plusfriendUserKey;
	// 플러스 친구에서 제공하는 사용자 식별키
	String appUserId;

	// 봇 설정에서 앱키를 설정한 경우에만 제공되는 사용자 정보
	public String getPlusfriendUserKey() {
		return plusfriendUserKey;
	}

	public void setPlusfriendUserKey(String plusfriendUserKey) {
		this.plusfriendUserKey = plusfriendUserKey;
	}

	public String getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(String appUserId) {
		this.appUserId = appUserId;
	}

}
