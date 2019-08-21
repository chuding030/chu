package com.test.kakao.VO.SkillResponse.OutputType;

import com.test.kakao.VO.Common.Link;

public class ListItem implements OutputImp {

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	String title;
	String description;
	String imageUrl;
	Link link;

}
