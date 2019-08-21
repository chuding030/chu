package com.test.kakao.SaveUserInfo.dao;

import org.springframework.stereotype.Repository;

import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_F;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_S;

@Repository
public interface SaveUserInfoDao {
	int setSaveUserInfo_Success(SaveUserInfo_S saveUserInfo);

	int setSaveUserInfo_Fail(SaveUserInfo_F saveUserInfo_F);

}
