//package com.test.kakao.OutputDesign;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import com.test.kakao.Fallback.Enum.CategoryEnum;
//import com.test.kakao.Fallback.Process.DescriptionSkill;
//import com.test.kakao.Fallback.VO.Analysis_Noun;
//import com.test.kakao.Fallback.VO.Noun;
//import com.test.kakao.Fallback.VO.ReturnType;
//
//public class Analysis_Sentence {
//	public ArrayList<ReturnType> getAnalysis_Sentence(String str) throws Exception {
//
//		ArrayList<ReturnType> arr_returnType = new ArrayList<ReturnType>();
//		MorphemeAnalyzer ma = new MorphemeAnalyzer();
//		List<MExpression> ret = ma.analyze(str);
//		ret = ma.postProcess(ret);
//		ret = ma.leaveJustBest(ret);
//		List<Sentence> stl = ma.divideToSentences(ret);
//		ArrayList<String> arr = new ArrayList<String>();
//		// 꼬꼬마 문장 분석
//
//		boolean bNegative = false;
//		String word_add = "";
//		String[] arr_str = null;
//		int originalCount = 0;
//		String ckecklist = "안,못,않,말,못하,버리,마지않,없,없이,안됨,안해";
//
//		for (int i = 0; i < stl.size(); i++) {
//			for (int j = 0; j < stl.get(i).size(); j++) {
//				for (int k = 0; k < stl.get(i).get(j).size(); k++) {
//					arr_str = stl.get(i).get(j).get(k).toString().split("/");
//					System.out.println(arr_str[2] + arr_str[1]);
//					switch (arr_str[2]) {
//					// 일반 부사 및 보조 동사로 안/못부정
////					case "MAG":
//					case "VXV":
//					case "VA":
////					case "VXA":
////					case "VCN":
////					case "VX":
////						// 부정 보조 동사 : 않다/말다/못하다
////						// 일반 부사 부정의 뜻 : 안 / 못
////						for (String check : ckecklist.split(","))
////							if (arr_str[1].equals(check))
////								bNegative = true;
////						break;
////					case "NNG":
////						for (String check : ckecklist.split(","))
////							if (arr_str[1].equals(check))
////								bNegative = true;
//					case "NNP":
//					case "NNG":
//					case "NP":
//					case "NNA":
//						word_add += arr_str[1];
//						originalCount++;
//					}
//				}
//			}
//		}
//		if (originalCount == 0)
//			arr_returnType = getDefault();
////		else if (bNegative)
////			arr_returnType = setNagativeSentence(word_add);
//		else {
//			for (int i = 0; i < arr.size(); i++)
//				System.out.print("\"" + arr.get(i) + "\"" + ",");
//			arr_returnType = setCountAndDes(word_add, originalCount);
//		}
//
//		return arr_returnType;
//	}
//
////	// 1형식 명사 + 부사 / 보조 동사 일 경우 , 처리
////	private ArrayList<ReturnType> setNagativeSentence(String word_add) {
////		DescriptionSkill desSkill = new DescriptionSkill();
////		return desSkill.getNegativeSentense(word_add);
////	}
//
//	// 입력한 문장이 어떤 주제에 가장 적합한지 판단 (카운트와 리턴해줄 정보 값 저장)
//	private ArrayList<ReturnType> setCountAndDes(String word_add, int originalCount) {
//		ArrayList<ReturnType> arr_return = new ArrayList<ReturnType>();
//		Noun arr_noun = new Noun();
//		Analysis_Noun anlysisNoun = new Analysis_Noun();
//		// 모든 리스트 안에 해당 값이 없을 경우, 디폴트 폴백으로 넘김
//		boolean bZeroCount = false;
//		ReturnType returnType = new ReturnType();
//
//		// 가장먼저 큰 카테고리화
//		int arr_length = 0;
//		CategoryEnum.CategoryTypeEnum enumCollect = getCategory(word_add);
//		switch (enumCollect) {
//		case INSPECTION:
//			arr_length = 10;
//			for (int i = 0; i < arr_length; i++) {
//				arr_noun = anlysisNoun.getList(i, enumCollect);
//				returnType = getCount(arr_noun, word_add, i);
//				arr_return.add(returnType);
//			}
//			arr_return = CategorySuccess(arr_return, originalCount);
//		case SCRAP:
//			// 현재는 개수가 같아서
//			arr_length = 6;
//			for (int i = 0; i < arr_length; i++) {
//				arr_noun = anlysisNoun.getList(i, enumCollect);
//				returnType = getCount(arr_noun, word_add, i);
//				arr_return.add(returnType);
//			}
//			arr_return = CategorySuccess(arr_return, originalCount);
//			break;
//		case Unknown:
//			arr_length = 10;
//			for (int i = 0; i < arr_length; i++) {
//				arr_noun = anlysisNoun.getList(i, CategoryEnum.CategoryTypeEnum.INSPECTION);
//				returnType = getCount(arr_noun, word_add, i);
//				arr_return.add(returnType);
//				if (!bZeroCount)
//					if (returnType.getCount() != 0)
//						bZeroCount = true;
//			}
//			arr_length = 6;
//			for (int i = 0; i < arr_length; i++) {
//				arr_noun = anlysisNoun.getList(i, CategoryEnum.CategoryTypeEnum.SCRAP);
//				returnType = getCount(arr_noun, word_add, i);
//				arr_return.add(returnType);
//				if (!bZeroCount)
//					if (returnType.getCount() != 0)
//						bZeroCount = true;
//			}
//			if (bZeroCount)
//				arr_return = CategoryFail(arr_return, originalCount);
//			else
//				arr_return = getDefault();
//			break;
//		}
//		return arr_return;
//	}
//
//	// 카테고리화 되었을 때
//	private ArrayList<ReturnType> CategorySuccess(ArrayList<ReturnType> arrReturn, int originalCount) {
//		ArrayList<ReturnType> arr_return = new ArrayList<ReturnType>();
//		int max = 0;
//		for (int i = 1; i < arrReturn.size(); i++)
//			if (arrReturn.get(max).getCount() <= arrReturn.get(i).getCount())
//				max = i;
//
//		arr_return.add(arrReturn.get(max));
//		return arr_return;
//		// System.out.println("ㅁ 답변 " + "(" + getCorrectPercent(arrReturn.get(max),
//		// originalCount) + "%)" + "\r\n"
//		// + arrReturn.get(max).getReDes().getDes());
//	}
//
//	// 카테고리화 되지 않았을 때
//	// 최대 5개 까지 노출
//	// 유저가 입력한 단어가 많이 겹치는 순서대로 노출
//	private ArrayList<ReturnType> CategoryFail(ArrayList<ReturnType> arrReturn, int originalCount) {
//		String str = "ㅁ 답변 " + "\r\n" + "죄송합니다.정확한 답변이 어렵습니다." + "\r\n" + "단, 고객님께서 질문하신 답변이 아래와 같은 리스트에 있는 지 확인해보세요!"
//				+ "\r\n" + "\r\n";
//		Collections.sort(arrReturn, new Comparator<ReturnType>() {
//			@Override
//			public int compare(ReturnType o1, ReturnType o2) {
//				// TODO Auto-generated method stub
//				if (o1.getCount() <= o2.getCount())
//					return 1;
//				else
//					return -1;
//			}
//		});
//		for (int i = 0; i < 5; i++) {
//			str += ">> " + arrReturn.get(i).getReDes().getTitle();
//		}
//		// System.out.println(str);
//		return arrReturn;
//	}
//
//	// 각 카테고리에 해당되는 단어가 몇개 있는지 확인
//	private ReturnType getCount(Noun arr_noun, String word_add, int index) {
//		ReturnType returnType = new ReturnType();
//		DescriptionSkill des = new DescriptionSkill();
//		int count = 0;
//		for (int j = 0; j < arr_noun.getArr_str().size(); j++) {
//			if (word_add.contains(arr_noun.getArr_str().get(j))) {
//				{
//					count++;
//				}
//			}
//		}
//		returnType.setCategory(arr_noun.getCategory());
//		returnType.setCount(count);
//		returnType.setReDes(des.getDes(index, arr_noun.getCategory()));
//		return returnType;
//	}
//
//	// 해당 단어를 포함하고 있으면, 그 질의로 답함
//	private CategoryEnum.CategoryTypeEnum getCategory(String word_add) {
//		if (word_add.contains( "검사"))
//			return CategoryEnum.CategoryTypeEnum.INSPECTION;
//		else if (word_add.contains("교환"))
//			return CategoryEnum.CategoryTypeEnum.SCRAP;
//		else
//			return CategoryEnum.CategoryTypeEnum.Unknown;
//	}
//
//	// 정확도가 얼마나 높은지 % 계산
//	private String getCorrectPercent(ReturnType returnType, int OriginalWordCount) {
//		return String.format("%.2f", ((float) returnType.getCount() / (float) OriginalWordCount) * 100);
//	}
//
//	// 미처리 된 사항에 대한 대처
//	private ArrayList<ReturnType> getDefault() {
//		DescriptionSkill des = new DescriptionSkill();
//
//		return des.getDefaultDescription();
//	}
//}
