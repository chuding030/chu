package com.test.kakao.VO.Common;

public class Thumbnail {
	String imageUrl;
	Link link = new Link();

	// String link;

	@Override
	public String toString() {
		return "Thumbnail [imageUrl=" + imageUrl + ", link=" + link + "]";
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

}
