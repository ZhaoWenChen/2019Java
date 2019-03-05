package com.java;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
		List<Integer> score = new ArrayList<>();
		score.add(50);
		score.add(85);
		score.add(70);
		score.add(85); //可以重複
		score.add(95);
		System.out.println(score); //有順序
		score.remove(3); //有索引值
		System.out.println(score);
		
		
		Set<Integer> ID = new HashSet<>();
		ID.add(1574);
		ID.add(1153); //沒有順序
		ID.add(1153); //不能重複
		ID.add(0015); //八進位
		ID.add(1005);
		System.out.println(ID);
		
		//沒有索引值
		ID.remove(3);
		System.out.println(ID);
		ID.remove(1005);
		System.out.println(ID);
	}

}
