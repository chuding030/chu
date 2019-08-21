package com.test.kakao.ShapeAnalysis.Process;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.kakao.Fallback.Service.FallbackService;
import com.test.kakao.Fallback.VO.SentenceAnalysis;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.Token;

public class FilterStep {
	@Autowired
	FallbackService fallbackService;

	// Komoran 형태소 분석기 사용
	// 사용자 입력을 입력값과 형태소 분석 값(Token)으로 저장
	public SentenceAnalysis setUserSentence(String userSentence) {
		SentenceAnalysis sentenceAnalysis = new SentenceAnalysis();
		sentenceAnalysis.setSentence(userSentence);
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		sentenceAnalysis.setToken(komoran.analyze(userSentence).getTokenList());
		return sentenceAnalysis;
	}

	// 1차 필터
	// 사용자가 입력한 문장의 명사가 1개 이상인지 확인
	// 1개 미만일 경우, 일반 fallback 응답 제공
	public Boolean BChkFilterStep1(SentenceAnalysis sentenceAnalysis) {
		for (Token token : sentenceAnalysis.getToken())
			switch (token.getPos()) {
			case "NNG":
			case "NNP":
			case "NNB":
			case "NR":
			case "NP":
				return true;
			}
		return false;
	}

	// 2차 필터
	// 사용자가 입력한 문장의 명사 중 우리가 취급하는 명사가 1개 이상인지 확인
	// 1개 미만일 경우, 일반 fallback 응답 제공
	public Boolean BChkFilterStep2(SentenceAnalysis sentenceAnalysis) {
		ArrayList<String> arr_Noun = new ArrayList<String>();
		for (Token token : sentenceAnalysis.getToken())
			arr_Noun.add(token.getMorph());
		if (fallbackService.getFilterStep2(arr_Noun) < 1)
			return false;
		else
			return true;
	}
}
