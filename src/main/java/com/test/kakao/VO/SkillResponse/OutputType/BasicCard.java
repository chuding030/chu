package com.test.kakao.VO.SkillResponse.OutputType;

import java.util.ArrayList;

import com.test.kakao.VO.Common.Button;
import com.test.kakao.VO.Common.Thumbnail;

public class BasicCard implements OutputImp {
	@Override
	public String toString() {
		return "BasicCard [title=" + title + ", description=" + description + ", thumbnail=" + thumbnail + ", buttons="
				+ buttons + "]";
	}

	String title;
	String description;
	Thumbnail thumbnail = new Thumbnail();
	ArrayList<Button> buttons = new ArrayList<Button>();

	// Profile profile;
	// Social social;
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

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public ArrayList<Button> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<Button> buttons) {
		this.buttons = buttons;
	}

}
