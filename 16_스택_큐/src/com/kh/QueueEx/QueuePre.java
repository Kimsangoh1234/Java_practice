package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	//main
	public static void main(String[] args) {
		Queue<Integer> 스택 = new LinkedList<>();
		스택.offer(80);
		스택.offer(60);
		스택.offer(30);
		스택.offer(20);
		
		//poll 데이터 확인 및 제거
		int 맨앞 = 스택.poll();
		System.out.println(맨앞);
		
		//peek 맨앞 데이터 확인
		int 데이터확인 = 스택.peek();
		System.out.println(데이터확인);
		
		//isEmpty 비어있는지 확인
		boolean isEmpty = 스택.isEmpty();
		System.out.println(isEmpty);
	}
	
	//offer 80 60 30 20
	
}
