package com.test.kakao.SaveUserInfo.Service;

import org.springframework.stereotype.Service;

import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_F;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_S;

@Service
public interface SaveUserInfoService {
	int setSaveUserInfo_Success(SaveUserInfo_S saveUserInfo);

	int setSaveUserInfo_Fail(SaveUserInfo_F saveUserInfo_F);

}
