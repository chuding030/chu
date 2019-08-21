package com.test.kakao.OutputDesign;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMaker {
	// 글이 들어간 이미지 처리
	public String MakeImage(String str) throws IOException {
		String[] texts = { str };
		BufferedImage imageBg = ImageIO.read(new File("C:/Users/DELL/Desktop/3.jpg"));

		int FONT_SIZE = 50;
		//  int POS_X = (imageBg.getWidth() - ((str.length()) * 30)) / 2;
		int POS_X = 50;
		System.out.println("imageBg.getWidth()" + imageBg.getWidth() + "str.length()" + str.length() + "POS_X" + POS_X);
		int POS_Y = 0;

		Font font = new Font("맑은 고딕", Font.BOLD, FONT_SIZE);
		BufferedImage image = new BufferedImage(imageBg.getWidth(), 75, BufferedImage.TYPE_INT_ARGB);

		Graphics g = image.getGraphics();
		g.setColor(new Color(155, 174, 200));
		g.fillRoundRect(5, 8, imageBg.getWidth() - 5, 65, 50, 20);
		g.setColor(new Color(217, 225, 232));
		g.fillRoundRect(0, 0, imageBg.getWidth() - 5, 65, 50, 20);

		int x = POS_X;
		for (int i = 0; i < texts.length; i++) {
			int y = (FONT_SIZE + POS_Y) * (i + 1);
			// 그림자 처리
			drawStringDropshadow(g, texts[i], x, y, font);
		}
		return SaveImgFile(image, false, "png", "1236");
	}

	// 라벨이 들어간 이미지와 배경 이미지 합체
	public void SetImage(String str) {
		try {
			BufferedImage imageBg = ImageIO.read(new File("C:/Users/DELL/Desktop/3.jpg"));
			BufferedImage imageLabel = ImageIO.read(new File(MakeImage(str)));

			BufferedImage mergedImage = new BufferedImage(imageBg.getWidth(), imageBg.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics = (Graphics2D) mergedImage.getGraphics();

			graphics.drawImage(imageBg, 0, 0, null);
			graphics.drawImage(imageLabel, 0, 50, null);
			
			SaveImgFile(mergedImage, true, "jpg", "1235559");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// x좌표 y좌표이동
	int ShiftPoint(int p, int distance) {
		return (p + distance);
	}

	// 글자 그림자
	private void drawStringDropshadow(Graphics g, String text, int x, int y, Font font) {
		g.setFont(font);
		g.setColor(new Color(155, 174, 200));
		g.drawString(text, ShiftPoint(x, 4), ShiftPoint(y, 5));
		g.setColor(new Color(40, 44, 55));
		g.drawString(text, x, y);
	}

	// 파일 저장
	private String SaveImgFile(BufferedImage image, boolean bPath, String extension, String filename) {
		String sMergeFilePath = "C:/Users/DELL/chatbot-workspace/KaKaoChatbot_0124_SetKeyTest/src/main/webapp/resources/image/";
		String sLabelFilePath = "C:/Users/DELL/chatbot-workspace/KaKaoChatbot_0124_SetKeyTest/src/main/webapp/resources/img_Label/";
		String sPath = (bPath ? sMergeFilePath : sLabelFilePath) + filename + "." + extension;

		try {
			ImageIO.write(image, extension, new File(sPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sPath;
	}
}
