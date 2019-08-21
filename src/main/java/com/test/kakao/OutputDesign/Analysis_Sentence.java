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
//		// ������ ���� �м�
//
//		boolean bNegative = false;
//		String word_add = "";
//		String[] arr_str = null;
//		int originalCount = 0;
//		String ckecklist = "��,��,��,��,����,����,������,��,����,�ȵ�,����";
//
//		for (int i = 0; i < stl.size(); i++) {
//			for (int j = 0; j < stl.get(i).size(); j++) {
//				for (int k = 0; k < stl.get(i).get(j).size(); k++) {
//					arr_str = stl.get(i).get(j).get(k).toString().split("/");
//					System.out.println(arr_str[2] + arr_str[1]);
//					switch (arr_str[2]) {
//					// �Ϲ� �λ� �� ���� ����� ��/������
////					case "MAG":
//					case "VXV":
//					case "VA":
////					case "VXA":
////					case "VCN":
////					case "VX":
////						// ���� ���� ���� : �ʴ�/����/���ϴ�
////						// �Ϲ� �λ� ������ �� : �� / ��
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
////	// 1���� ��� + �λ� / ���� ���� �� ��� , ó��
////	private ArrayList<ReturnType> setNagativeSentence(String word_add) {
////		DescriptionSkill desSkill = new DescriptionSkill();
////		return desSkill.getNegativeSentense(word_add);
////	}
//
//	// �Է��� ������ � ������ ���� �������� �Ǵ� (ī��Ʈ�� �������� ���� �� ����)
//	private ArrayList<ReturnType> setCountAndDes(String word_add, int originalCount) {
//		ArrayList<ReturnType> arr_return = new ArrayList<ReturnType>();
//		Noun arr_noun = new Noun();
//		Analysis_Noun anlysisNoun = new Analysis_Noun();
//		// ��� ����Ʈ �ȿ� �ش� ���� ���� ���, ����Ʈ �������� �ѱ�
//		boolean bZeroCount = false;
//		ReturnType returnType = new ReturnType();
//
//		// ������� ū ī�װ�ȭ
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
//			// ����� ������ ���Ƽ�
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
//	// ī�װ�ȭ �Ǿ��� ��
//	private ArrayList<ReturnType> CategorySuccess(ArrayList<ReturnType> arrReturn, int originalCount) {
//		ArrayList<ReturnType> arr_return = new ArrayList<ReturnType>();
//		int max = 0;
//		for (int i = 1; i < arrReturn.size(); i++)
//			if (arrReturn.get(max).getCount() <= arrReturn.get(i).getCount())
//				max = i;
//
//		arr_return.add(arrReturn.get(max));
//		return arr_return;
//		// System.out.println("�� �亯 " + "(" + getCorrectPercent(arrReturn.get(max),
//		// originalCount) + "%)" + "\r\n"
//		// + arrReturn.get(max).getReDes().getDes());
//	}
//
//	// ī�װ�ȭ ���� �ʾ��� ��
//	// �ִ� 5�� ���� ����
//	// ������ �Է��� �ܾ ���� ��ġ�� ������� ����
//	private ArrayList<ReturnType> CategoryFail(ArrayList<ReturnType> arrReturn, int originalCount) {
//		String str = "�� �亯 " + "\r\n" + "�˼��մϴ�.��Ȯ�� �亯�� ��ƽ��ϴ�." + "\r\n" + "��, ���Բ��� �����Ͻ� �亯�� �Ʒ��� ���� ����Ʈ�� �ִ� �� Ȯ���غ�����!"
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
//	// �� ī�װ��� �ش�Ǵ� �ܾ � �ִ��� Ȯ��
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
//	// �ش� �ܾ �����ϰ� ������, �� ���Ƿ� ����
//	private CategoryEnum.CategoryTypeEnum getCategory(String word_add) {
//		if (word_add.contains( "�˻�"))
//			return CategoryEnum.CategoryTypeEnum.INSPECTION;
//		else if (word_add.contains("��ȯ"))
//			return CategoryEnum.CategoryTypeEnum.SCRAP;
//		else
//			return CategoryEnum.CategoryTypeEnum.Unknown;
//	}
//
//	// ��Ȯ���� �󸶳� ������ % ���
//	private String getCorrectPercent(ReturnType returnType, int OriginalWordCount) {
//		return String.format("%.2f", ((float) returnType.getCount() / (float) OriginalWordCount) * 100);
//	}
//
//	// ��ó�� �� ���׿� ���� ��ó
//	private ArrayList<ReturnType> getDefault() {
//		DescriptionSkill des = new DescriptionSkill();
//
//		return des.getDefaultDescription();
//	}
//}
