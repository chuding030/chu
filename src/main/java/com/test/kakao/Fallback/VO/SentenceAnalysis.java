package com.test.kakao.Fallback.VO;

import java.util.List;

import kr.co.shineware.nlp.komoran.model.Token;

// ����� ��ȭ�� �� ��ȭ �� ��� ������ ����
public class SentenceAnalysis {
	// ����� ��ȭ
	String Sentence;
	// ��� ���� ����
	List<Token> token;

	public List<Token> getToken() {
		return token;
	}

	public void setToken(List<Token> token) {
		this.token = token;
	}

	public String getSentence() {
		return Sentence;
	}

	public void setSentence(String sentence) {
		Sentence = sentence;
	}

}