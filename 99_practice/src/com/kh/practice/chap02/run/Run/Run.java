package com.kh.practice.chap02.run.Run;
import java.util.Scanner;

//import = 가져오겠다 폴더 위치에서.폴더 안에 있는 파일명;
import com.kh.practice.chap02.loop.LoopPractice.LooPractice;

public class Run {
	//최종으로 실행하는 메인 메서드
	public static void main(String[] args) {
		// 기능 제공 클래스에서 최종으로 실행할 메소드 이름만 작성
		// 특정 기능을 실행할 수 있도록 기능을 작성한 공간
		
		//LooPractice에 있는 Greeting을 가져와서 출력하고 싶음
		//Scanner를 사용했던 것처럼
		//LooPractice을 new로 가지고 와서
		//LooPracitce 밑에 있는 Greeting을 소환할 것
		Scanner sc= new Scanner(System.in);
		LooPractice Lp = new LooPractice();
		//Lp.Geeting();
		//0Lp.Geeting2();
		//Lp.practice2();
		Lp.practice3();
	}

}
