package com.test.kakao.VO.SkillResponse.OutputType;

public class SimpleImage implements OutputImp {
	String imageUrl;
	String altText;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

}
