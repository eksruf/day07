package day07;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	/*
	 컬렉션 프레임 워크
	 컬렉션 
	 -다수의 데이터, 데이터그룹
	 -무한한 데이터의 집합 - 자바의 자료구조
	 
	 프레임워크
	 - 하나의 틀
	 -표준화된 프로그래밍 방식
	 List, Set,Map
	 List(부모)
	 -ArrayList
	 -LinkedList
	 -Stack...
	 
	 
	 ArrayList
	 -순서를 유지한다.
	 -데이터의 중복을 혀용한다.
	 */
	
	
	ArrayList arr = new ArrayList(); //지정
	//Arraylist = 자료형, arr = 변수이름
	//첫 글자가 대문자는 클래스
	arr.add("123");
	arr.add("456");
	System.out.println(arr.get(0));
	System.out.println(arr.get(1));
	
	//첫 글자가 소문라마면 변수 뒤 .을 찍어도 어떠한 것도 표현 안됨
	//클래스로 변수를 만들면 입력한 변수에 기능 제공
	
	System.out.println(arr.size());
	//저장된 개수를 가지고 온다.
	int s = arr.size();// 변수로 지정하여 밑의 칸에 넣을 수 있다
	//int [] a = new int [s] 라고 쓸 수 있다
	int [] a = new int[3];
	System.out.println(a.length);
	
	boolean bool = arr.contains("123");
	if (bool ==true) {
		System.out.println("123은 존재합니다.");
	}//값만이 필요한 경우가 있을 떄 쓸 수도 있다
	
	System.out.println(bool );
	System.out.println(arr.contains("12311") );
	//해당하는 값이 존재하는가? 진실 거짓으로 출력
	
	System.out.println(arr.remove("123"));
	//삭제한 경우 실행시 트루 출력
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	
	arr.clear();
	System.out.println(arr.size());
	
	
	arr.add("라면"); arr.add("소금");
	arr.add("순대");
	//차례로 번호 받음 라면=0번 소금 =1번 순대 =2번
	String index = "소금";
	int i = arr.indexOf(index); //index에 해당하는 번호를 알려주세요
	System.out.println(i+"번째 존재함");
	
	System.out.println("변경 전 : "+arr.get(1));
	arr.set(i, "금금");
	System.out.println("변경후: "+arr.get(1));
	
	
}
}
