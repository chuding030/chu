package com.test.kakao.Fallback.VO;

import java.util.List;

import kr.co.shineware.nlp.komoran.model.Token;

// 사용자 발화와 그 발화 중 명사 추출한 내역
public class SentenceAnalysis {
	// 사용자 발화
	String Sentence;
	// 명사 추출 내역
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