package com.test.kakao.OutputDesign;

import java.util.ArrayList;

import com.test.kakao.VO.Common.Button;
import com.test.kakao.VO.Common.Link;
import com.test.kakao.VO.Common.Thumbnail;
import com.test.kakao.VO.SkillResponse.QuickReply;
import com.test.kakao.VO.SkillResponse.OutputType.BasicCard;
import com.test.kakao.VO.SkillResponse.OutputType.ListCard;
import com.test.kakao.VO.SkillResponse.OutputType.ListItem;
import com.test.kakao.VO.SkillResponse.OutputType.SimpleImage;
import com.test.kakao.VO.SkillResponse.OutputType.SimpleText;

public class OutputDesign {

	/*
	 * 2019-02-19 추윤지 기본 카드형 필수 구성요소 : 이미지 부가 요소 : 제목/ 설명 / 버튼(최대 3개) 버튼 명 필수
	 */
	public BasicCard setBasicCard(String title, String description, ArrayList<Button> arrButton, Thumbnail thumbnail) {
		BasicCard basicCard = new BasicCard();
		basicCard.setTitle(title);
		basicCard.setDescription(description);
		basicCard.setButtons(arrButton);
		basicCard.setThumbnail(thumbnail);
		return basicCard;
	}

	/*
	 * 2019-02-19 추윤지 리스트형 필수 구성요소 : 헤더/아이템(1개이상 5개이하) - titel 필수 부가 요소 : 버튼
	 */
	public ListCard setListCard(ListItem header, ArrayList<ListItem> items, ArrayList<Button> buttons) {
		ListCard listCard = new ListCard();
		listCard.setHeader(header);
		listCard.setItems(items);
		listCard.setButtons(buttons);
		return listCard;
	}

	// ListItem 세팅 header랑 items부분
	public ListItem setListItem(String title, String description, String imageUrl, Link link) {
		ListItem listItem = new ListItem();
		listItem.setTitle(title);
		listItem.setDescription(description);
		listItem.setImageUrl(imageUrl);
		listItem.setLink(link);
		return listItem;

	}

	/*
	 * 2019-02-19 추윤지 기본 카드형 필수 구성요소 : 이미지 부가 요소 : 제목/ 설명 / 버튼(최대 3개) 버튼 명 필수
	 */
	public SimpleImage setSimpleImage(String altText, String imageUrl) {
		SimpleImage simpleImage = new SimpleImage();
		simpleImage.setAltText(altText);
		simpleImage.setImageUrl(imageUrl);
		return simpleImage;
	}

	/*
	 * 2019-02-19 추윤지 기본 카드형 필수 구성요소 : 이미지 부가 요소 : 제목/ 설명 / 버튼(최대 3개) 버튼 명 필수
	 */
	public SimpleText setSimpleText(String text) {
		SimpleText simpleText = new SimpleText();
		simpleText.setText(text);

		return simpleText;
	}

	/*
	 * common setting : thumbnail / button
	 */
	// 썸네일 - 기본 카드형 / 이미지 형/ 리스트 형
	public Thumbnail setThumnail(String imageUrl, String web) {
		Thumbnail thumbnail = new Thumbnail();
		thumbnail.setImageUrl(imageUrl);
		Link link = new Link();
		link.setWeb(web);
		thumbnail.setLink(link);

		return thumbnail;
	}

	// 버튼은 각 세팅해줘야하는 값이 다르기 때문에, 이곳에서 배열 선언 X
	public Button setButton(String action, String webLinkUrl, String label, String messageText, Link osLink,
			String phoneNumber, String blockId) {
		Button button = new Button();
		button.setAction(action);
		button.setBlockId(blockId);
		button.setLabel(label);
		button.setMessageText(messageText);
		button.setOsLink(osLink);
		button.setPhoneNumber(phoneNumber);
		button.setWebLinkUrl(webLinkUrl);
		return button;
	}

	public Link setLink(String web) {
		Link link = new Link();
		link.setWeb(web);
		return link;
	}

	// QuickReply block
	public QuickReply setQuickReply_block(String action, String blockId, String label) {
		QuickReply quickReply = new QuickReply();
		quickReply.setAction(action);
		quickReply.setBlockId(blockId);
		quickReply.setLabel(label);

		return quickReply;
	}

	// QuickReply message
	public QuickReply setQuickReply_message(String action, String messageText, String label) {
		QuickReply quickReply = new QuickReply();
		quickReply.setAction(action);
		quickReply.setMessageText(messageText);
		quickReply.setLabel(label);

		return quickReply;
	}

}
