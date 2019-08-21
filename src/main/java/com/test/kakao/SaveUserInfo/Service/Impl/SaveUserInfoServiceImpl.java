package com.test.kakao.SaveUserInfo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.kakao.SaveUserInfo.Service.SaveUserInfoService;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_F;
import com.test.kakao.SaveUserInfo.VO.SaveUserInfo_S;
import com.test.kakao.SaveUserInfo.dao.SaveUserInfoDao;

public class SaveUserInfoServiceImpl implements SaveUserInfoService {
	@Autowired
	SaveUserInfoDao saveUserInfoDao;

	@Override
	public int setSaveUserInfo_Success(SaveUserInfo_S saveUserInfo_S) {
		// TODO Auto-generated method stub
		return saveUserInfoDao.setSaveUserInfo_Success(saveUserInfo_S);
	}

	@Override
	public int setSaveUserInfo_Fail(SaveUserInfo_F saveUserInfo_F) {
		// TODO Auto-generated method stub
		return saveUserInfoDao.setSaveUserInfo_Fail(saveUserInfo_F);
	}

}
