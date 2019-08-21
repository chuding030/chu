package com.test.kakao.VO.SkillResponse.OutputType;

public class SimpleText implements OutputImp
{
	String text;
	// 출력하려는 텍스트

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
