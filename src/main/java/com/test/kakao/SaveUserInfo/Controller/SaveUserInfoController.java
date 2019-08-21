package com.test.kakao.SaveUserInfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.kakao.SaveUserInfo.Service.SaveUserInfoService;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_F;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_S;
import com.test.kakao.VO.SkillPayload.SkillPayload;

public class SaveUserInfoController {
	@Autowired
	SaveUserInfoService saveUserInfoService;

	// 인식 성공 후 사용자 정보 MASTER 값 저장
	private boolean SetSaveUserInfo_Success(SkillPayload skillPayload) {
		if (saveUserInfoService.setSaveUserInfo_Success(SetSaveUserInfo_S(skillPayload)) > 0)
			return true;
		else
			return false;
	}

	// 인식 실패 후 사용자 정보 MASTER 값 저장
	private boolean SetSaveUserInfo_Fail(SkillPayload skillPayload) {
		if (saveUserInfoService.setSaveUserInfo_Fail(SetSaveUserInfo_F(skillPayload)) > 0)
			return true;
		else
			return false;
	}

	// 인식 성공 후, 사용자 VO 세팅
	// 값 세팅 부터 작업하기
	public SaveUserInfo_S SetSaveUserInfo_S(SkillPayload skillPayload) {

		SaveUserInfo_S saveUserInfo_S = new SaveUserInfo_S();
		saveUserInfo_S.setUse_dt(null);
		saveUserInfo_S.setUser_key("");
		saveUserInfo_S.setQuest_cn("");
		saveUserInfo_S.setCtgry_id("");
		saveUserInfo_S.setRecog_ty("");

		return saveUserInfo_S;

	}

	// 인식 실패 후, 사용자 VO 세팅
	// 값 세팅 부터 작업하기
	public SaveUserInfo_F SetSaveUserInfo_F(SkillPayload skillPayload) {

		SaveUserInfo_F saveUserInfo_F = new SaveUserInfo_F();
		saveUserInfo_F.setUse_dt(null);
		saveUserInfo_F.setUser_key("");
		saveUserInfo_F.setQuest_cn("");
		return saveUserInfo_F;
	}
}
