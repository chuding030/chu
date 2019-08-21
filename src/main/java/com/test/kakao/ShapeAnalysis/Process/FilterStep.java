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

	// Komoran ���¼� �м��� ���
	// ����� �Է��� �Է°��� ���¼� �м� ��(Token)���� ����
	public SentenceAnalysis setUserSentence(String userSentence) {
		SentenceAnalysis sentenceAnalysis = new SentenceAnalysis();
		sentenceAnalysis.setSentence(userSentence);
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		sentenceAnalysis.setToken(komoran.analyze(userSentence).getTokenList());
		return sentenceAnalysis;
	}

	// 1�� ����
	// ����ڰ� �Է��� ������ ��簡 1�� �̻����� Ȯ��
	// 1�� �̸��� ���, �Ϲ� fallback ���� ����
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

	// 2�� ����
	// ����ڰ� �Է��� ������ ��� �� �츮�� ����ϴ� ��簡 1�� �̻����� Ȯ��
	// 1�� �̸��� ���, �Ϲ� fallback ���� ����
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
