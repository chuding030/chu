package com.test.kakao.Fallback.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.kakao.Fallback.Service.Impl.FallbackServiceImpl;
import com.test.kakao.Fallback.VO.SentenceAnalysis;
import com.test.kakao.ShapeAnalysis.Process.FilterStep;
import com.test.kakao.VO.SkillPayload.SkillPayload;
import com.test.kakao.VO.SkillResponse.SkillResponse;
import com.test.kakao.VO.SkillResponse.SkillTemplate;

public class FallbackController {
	@Autowired
	FallbackServiceImpl fallbackServiceImpl;

	@RequestMapping(value = "/fallback", method = RequestMethod.POST, produces = { "application/json; charset=utf-8" })
	public SkillResponse FallbackSkill(@RequestBody SkillPayload skillPayload) {
		FilterStep filterStep = new FilterStep();
		// 사용자 발화를 넘겨, 해당 문장의 명사를 추출
		SentenceAnalysis sentenceAnalysis = filterStep.setUserSentence(skillPayload.getUserRequest().getUtterance());
		if (filterStep.BChkFilterStep1(sentenceAnalysis))
			return null;
		if (filterStep.BChkFilterStep2(sentenceAnalysis))
			return null;
		SkillTemplate skillTemp = new SkillTemplate();
		return null;
		// return setSkillResponse(skillTemp, arr_analysis);
	}
}
