package com.test.kakao.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("FallbackDao")
public interface FallbackDao {

	int getFilterStep2(ArrayList<String> arr_Noun);

}
