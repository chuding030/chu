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
	 * 2019-02-19 ������ �⺻ ī���� �ʼ� ������� : �̹��� �ΰ� ��� : ����/ ���� / ��ư(�ִ� 3��) ��ư �� �ʼ�
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
	 * 2019-02-19 ������ ����Ʈ�� �ʼ� ������� : ���/������(1���̻� 5������) - titel �ʼ� �ΰ� ��� : ��ư
	 */
	public ListCard setListCard(ListItem header, ArrayList<ListItem> items, ArrayList<Button> buttons) {
		ListCard listCard = new ListCard();
		listCard.setHeader(header);
		listCard.setItems(items);
		listCard.setButtons(buttons);
		return listCard;
	}

	// ListItem ���� header�� items�κ�
	public ListItem setListItem(String title, String description, String imageUrl, Link link) {
		ListItem listItem = new ListItem();
		listItem.setTitle(title);
		listItem.setDescription(description);
		listItem.setImageUrl(imageUrl);
		listItem.setLink(link);
		return listItem;

	}

	/*
	 * 2019-02-19 ������ �⺻ ī���� �ʼ� ������� : �̹��� �ΰ� ��� : ����/ ���� / ��ư(�ִ� 3��) ��ư �� �ʼ�
	 */
	public SimpleImage setSimpleImage(String altText, String imageUrl) {
		SimpleImage simpleImage = new SimpleImage();
		simpleImage.setAltText(altText);
		simpleImage.setImageUrl(imageUrl);
		return simpleImage;
	}

	/*
	 * 2019-02-19 ������ �⺻ ī���� �ʼ� ������� : �̹��� �ΰ� ��� : ����/ ���� / ��ư(�ִ� 3��) ��ư �� �ʼ�
	 */
	public SimpleText setSimpleText(String text) {
		SimpleText simpleText = new SimpleText();
		simpleText.setText(text);

		return simpleText;
	}

	/*
	 * common setting : thumbnail / button
	 */
	// ����� - �⺻ ī���� / �̹��� ��/ ����Ʈ ��
	public Thumbnail setThumnail(String imageUrl, String web) {
		Thumbnail thumbnail = new Thumbnail();
		thumbnail.setImageUrl(imageUrl);
		Link link = new Link();
		link.setWeb(web);
		thumbnail.setLink(link);

		return thumbnail;
	}

	// ��ư�� �� ����������ϴ� ���� �ٸ��� ������, �̰����� �迭 ���� X
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
