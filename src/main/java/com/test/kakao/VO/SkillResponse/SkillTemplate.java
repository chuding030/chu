package com.test.kakao.VO.SkillResponse;

import java.util.ArrayList;
import java.util.HashMap;

import com.test.kakao.VO.SkillResponse.OutputType.OutputImp;

public class SkillTemplate {
	ArrayList<HashMap<String, OutputImp>> outputs = new ArrayList<HashMap<String, OutputImp>>();
	ArrayList<QuickReply> quickReplies = new ArrayList<QuickReply>();

	public ArrayList<HashMap<String, OutputImp>> getOutputs() {
		return outputs;
	}

	@Override
	public String toString() {
		return "SkillTemplate [outputs=" + outputs + ", quickReplies=" + quickReplies + "]";
	}

	public void setOutputs(ArrayList<HashMap<String, OutputImp>> outputs) {
		this.outputs = outputs;
	}

	public ArrayList<QuickReply> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(ArrayList<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}

}
