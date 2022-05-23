package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	
	
/*
	ArrayList arr = new ArrayList();
	ArrayList arr1 = new ArrayList();
	
	Scanner input = new Scanner(System.in);
	String name =" ";
	int num = 0;
	for(;;){//반복넣기
	System.out.println("1.연락처 등록");
	
	System.out.println("2.연락처보기");

	System.out.println("3.연락처 삭제");

	System.out.println("4.모든 연락처 보기");
	
	System.out.println("5.종료");
	System.out.println(">>>>>");
	int a = input.nextInt();
	
	
	while(true) {
	if (a==1) {
		System.out.println("이름 입력: ");
		name = input.next();
		arr.add(name);
		//String index = "소금";
		//int i = arr.indexOf(index);
		String index = name;
		int i = arr.indexOf(name);
		System.out.println("번호입력: ");
		num = input.nextInt();
		arr1.add(num);
		
		System.out.println(arr.get(0));
		break;
	}else if (a==2) {
		System.out.println("확인 이름 입력: ");
		String n= input.next();
		
		if() {
			//System.out.println(arr.get(i));
	
		}else {
			System.out.println("등록되어 있지 않습니다.");
			break;
		}
	}else if (a==3) {
		System.out.println(arr.remove(num));
	}
	}
	}
	
	*/
	
	ArrayList nameArr = new ArrayList();
	ArrayList numArr = new ArrayList();
	
	int num, temp=0;
	Scanner input = new Scanner(System.in);
	String name=null, phNum=null;
	
	
	while(true) {
		System.out.println("1.연락처 등 록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		System.out.println(">>>: ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			while(true) {
			System.out.println("이름 입력: ");
			name = input.next();
			if(nameArr.indexOf(name)==-1) {//-1은 거짓을 의미:입력한 이름이랑 다르다
				break;
			}
			System.out.println("존재하는 이름. 다시.");
			}
		System.out.println("전화번호 입력: ");
		phNum = input.next();
		nameArr.add(name);
		numArr.add(phNum);
		System.out.println("저장 완료");
			break;
		case 2:
			System.out.println("이름입력");
			name = input.next();
			temp= nameArr.indexOf(name);
			if(temp==-1) {
				System.out.println("존재하지 않는 정보 입니다.");
			}else {
				System.out.println("이름: "+name);
				System.out.println("전화번호: "+numArr.get(temp)); //매칭된 번호 찾기위해 temp입력
				//System.out.println("전화번호: "+numArr.get(nameArr.indexOf(name)));
			}
			break;
		case 3: 
			System.out.println("이름입력");
			name = input.next();
			temp= nameArr.indexOf(name);
			if(temp==-1) {
				System.out.println("존재하지 않는 정보 입니다.");
			}else {
				//nameArr.remove(temp); 이렇게 쓰거나
				nameArr.remove(name);
				//numArr.remove(temp) 이렇게 쓰거나
				numArr.remove(numArr.get(temp));
				
				System.out.println("삭제 완료");
			}
			break;
		case 4: 
			System.out.println("이름 \t전화번호");
			System.out.println("===============");
				
			for(int i=0;i<numArr.size();i++) {
				System.out.print(nameArr.get(i)+"\t");
				System.out.println(numArr.get(i));
				System.out.println("-------------------------");
			}
			
			break;
		case 5: 
			System.exit(1);//프로그램 종료
		}
		
	}
	
	//서버:서비스를 제공하는 
	//클라이언트: 서비스를 받는
}
}
