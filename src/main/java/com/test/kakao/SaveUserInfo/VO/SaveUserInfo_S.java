package com.test.kakao.SaveUserInfo.VO;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("SaveUserInfo")
public class SaveUserInfo_S {
	Date use_dt;
	String user_key;
	String quest_cn;
	String ctgry_id;
	String recog_ty;

	public Date getUse_dt() {
		return use_dt;
	}

	public void setUse_dt(Date use_dt) {
		this.use_dt = use_dt;
	}

	public String getUser_key() {
		return user_key;
	}

	public void setUser_key(String user_key) {
		this.user_key = user_key;
	}

	public String getQuest_cn() {
		return quest_cn;
	}

	public void setQuest_cn(String quest_cn) {
		this.quest_cn = quest_cn;
	}

	public String getCtgry_id() {
		return ctgry_id;
	}

	public void setCtgry_id(String ctgry_id) {
		this.ctgry_id = ctgry_id;
	}

	public String getRecog_ty() {
		return recog_ty;
	}

	public void setRecog_ty(String recog_ty) {
		this.recog_ty = recog_ty;
	}

}
