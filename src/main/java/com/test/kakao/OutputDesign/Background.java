package com.test.kakao.OutputDesign;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {

	public static void main(String[] args) {
		ImageMaker imageMaker = new ImageMaker();
		imageMaker.SetImage("[긴급공지]150번 버스 문제 발생");

	}

	public static void MakeImage(String str) {
		String[] texts = { str };

		final int FONT_SIZE = 30;
		final int POS_X = 50;
		final int POS_Y = 0;

		Font font = new Font("나눔고딕", Font.BOLD, FONT_SIZE);

		BufferedImage image = new BufferedImage(500, 80, BufferedImage.TYPE_INT_ARGB);

		Graphics g = image.getGraphics(); // 이미지의 그래픽 객체 얻어옴,
		g.setColor(Color.gray); // 색상을 흰색으로 지정.
		g.fillRoundRect(3, 3, 400, 50, 50, 20);
		g.setColor(Color.LIGHT_GRAY); // 색상을 흰색으로 지정.
		g.fillRoundRect(0, 0, 400, 50, 50, 20);

		for (int i = 0; i < texts.length; i++) {
			Graphics2D g2d = getG2D(image);

			g2d.setFont(font);
			int x = POS_X;
			int y = (FONT_SIZE + POS_Y) * (i + 1);
			// 그림자 처리
			drawStringDropshadow(g, texts[i], x, y);
		}
		// x좌료 너비 구하기
		BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		g2d.dispose();

		File file = new File("C:/Users/DELL/Desktop/1235.png");
		try {
			ImageIO.write(image, "png", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Graphics2D getG2D(BufferedImage image) {
		// TODO Auto-generated method stub
		Graphics2D g2d = image.createGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
		return g2d;
	}

	static int ShiftEast(int p, int distance) {
		return (p + distance);
	}

	static int ShiftSouth(int p, int distance) {
		return (p + distance);
	}

	// 글자 그림자
	private static void drawStringDropshadow(Graphics g, String text, int x, int y) {
		g.setColor(Color.gray);
		g.drawString(text, ShiftEast(x, 1), ShiftSouth(y, 1));
		g.setColor(Color.black);
		g.drawString(text, x, y);
	}

	public static void SetImage() {

		try {
			BufferedImage imageBg = ImageIO.read(new File("C:/Users/DELL/Desktop/3.jpg"));
			BufferedImage imageLabel = ImageIO.read(new File("C:/Users/DELL/Desktop/1235.png"));
			BufferedImage mergedImage = new BufferedImage(imageBg.getWidth(), imageBg.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics = (Graphics2D) mergedImage.getGraphics();

			graphics.drawImage(imageBg, 0, 0, null);
			graphics.drawImage(imageLabel, 180, 50, null);

			ImageIO.write(mergedImage, "jpg", new File("C:/Users/DELL/Desktop/123.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
