package com.test.kakao.VO.SkillResponse.OutputType;

import java.util.ArrayList;
import com.test.kakao.VO.Common.Button;

public class ListCard implements OutputImp {
	public ListItem getHeader() {
		return header;
	}

	public void setHeader(ListItem header) {
		this.header = header;
	}

	public ArrayList<ListItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<ListItem> items) {
		this.items = items;
	}

	public ArrayList<Button> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<Button> buttons) {
		this.buttons = buttons;
	}

	ListItem header = new ListItem();
	ArrayList<ListItem> items = new ArrayList<ListItem>();
	ArrayList<Button> buttons = new ArrayList<Button>();

}
