package com.test.kakao.Fallback.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.kakao.DAO.FallbackDao;
import com.test.kakao.Fallback.Service.FallbackService;

@Service
public class FallbackServiceImpl implements FallbackService {
	@Autowired
	FallbackDao fallbackDao;

	@Override
	public int getFilterStep2(ArrayList<String> arr_Noun) {
		// TODO Auto-generated method stub
		return fallbackDao.getFilterStep2(arr_Noun);
	}

}
