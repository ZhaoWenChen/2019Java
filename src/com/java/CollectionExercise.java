package com.java;

import java.util.*;

public class CollectionExercise {

	public static void main(String[] args) {
		
		List<String> medicalRecordInfo = new ArrayList<String>();
		//歷史病歷資料
		medicalRecordInfo.add("流行性感冒");
		medicalRecordInfo.add("鼻竇炎");
		medicalRecordInfo.add("香港腳");
		medicalRecordInfo.add("流行性感冒"); //可以重複
		medicalRecordInfo.add("中耳炎");
		medicalRecordInfo.add("流行性感冒");
		System.out.println(medicalRecordInfo); //有順序
		medicalRecordInfo.remove(3); //有索引值
		System.out.println(medicalRecordInfo);
		
		Set<String> marathonRunnerID = new HashSet<String>();
		//馬拉松跑者識別號碼
		marathonRunnerID.add("XN10246");
		marathonRunnerID.add("XN00154");
		marathonRunnerID.add("XN00001");
		marathonRunnerID.add("XN05978");
		marathonRunnerID.add("XN10246"); //不能重複
		marathonRunnerID.add("XN02245");
		marathonRunnerID.add("XN14524");
		System.out.println(marathonRunnerID); //沒有順序
		marathonRunnerID.remove(3); //沒有索引值
		marathonRunnerID.remove("XN00154");
		System.out.println(marathonRunnerID);
	}

}
