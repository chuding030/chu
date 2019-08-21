package com.test.kakao.Fallback.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalysisController {
//	@Autowired
//	FallbackServiceImpl fallbackServiceImpl;
//
//	@RequestMapping(value = "/fallback", method = RequestMethod.POST, produces = { "application/json; charset=utf-8" })
//	public SkillResponse FallbackSkill(@RequestBody SkillPayload skillPayload) {
//		SkillTemplate skillTemp = new SkillTemplate();
//		
//		return null;
//		// return setSkillResponse(skillTemp, arr_analysis);
//	}

	// private SkillResponse setSkillResponse(SkillTemplate skillTemp,
	// ArrayList<ReturnType> arr_analysis) {
	// // ---출력문
	// ArrayList<HashMap<String, OutputImp>> arr_output = new
	// ArrayList<HashMap<String, OutputImp>>();
	// HashMap<String, OutputImp> map_Output = new HashMap<String, OutputImp>();
	// OutputDesign outputDesign = new OutputDesign();
	// if (!arr_analysis.get(0).getReDes().getLink().equals("")) {
	// ArrayList<Button> arr_button = new ArrayList<Button>();
	// arr_button.add(outputDesign.setButton("webLink",
	// arr_analysis.get(0).getReDes().getLink(), "유효기간조회 바로가기",
	// "", null, "", ""));
	//
	// map_Output.put("basicCard",
	// outputDesign.setBasicCard(arr_analysis.get(0).getReDes().getTitle(),
	// arr_analysis.get(0).getReDes().getDes(), arr_button, null));
	//
	// arr_output.add(map_Output);
	// } else {
	// map_Output.put("simpleText", outputDesign.setSimpleText(
	// arr_analysis.get(0).getReDes().getTitle() +
	// arr_analysis.get(0).getReDes().getDes()));
	//
	// arr_output.add(map_Output);
	// if (arr_analysis.size() > 1) {
	// Carousel carousel = new Carousel();
	// HashMap<String, OutputImp> map_Output2 = new HashMap<String, OutputImp>();
	//
	// carousel.setType("basicCard");
	// ArrayList<OutputImp> outputimp = new ArrayList<OutputImp>();
	// for (int i = 1; i < 5; i++)
	// outputimp.add(outputDesign.setBasicCard(arr_analysis.get(i).getReDes().getTitle(),
	// arr_analysis.get(i).getReDes().getDes(), null, null));
	//
	// carousel.setItems(outputimp);
	// map_Output2.put("carousel", carousel);
	// arr_output.add(map_Output2);
	// }
	// }
	// skillTemp.setOutputs(arr_output);
	// SkillResponse skillResponse = new SkillResponse();
	// skillResponse.setVersion("2.0");
	// skillResponse.setTemplate(skillTemp);
	// return skillResponse;
	// }

}
