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
	for(;;){//�ݺ��ֱ�
	System.out.println("1.����ó ���");
	
	System.out.println("2.����ó����");

	System.out.println("3.����ó ����");

	System.out.println("4.��� ����ó ����");
	
	System.out.println("5.����");
	System.out.println(">>>>>");
	int a = input.nextInt();
	
	
	while(true) {
	if (a==1) {
		System.out.println("�̸� �Է�: ");
		name = input.next();
		arr.add(name);
		//String index = "�ұ�";
		//int i = arr.indexOf(index);
		String index = name;
		int i = arr.indexOf(name);
		System.out.println("��ȣ�Է�: ");
		num = input.nextInt();
		arr1.add(num);
		
		System.out.println(arr.get(0));
		break;
	}else if (a==2) {
		System.out.println("Ȯ�� �̸� �Է�: ");
		String n= input.next();
		
		if() {
			//System.out.println(arr.get(i));
	
		}else {
			System.out.println("��ϵǾ� ���� �ʽ��ϴ�.");
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
		System.out.println("1.����ó �� ��");
		System.out.println("2.����ó ����");
		System.out.println("3.����ó ����");
		System.out.println("4.��� ����ó ����");
		System.out.println("5.����");
		System.out.println(">>>: ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			while(true) {
			System.out.println("�̸� �Է�: ");
			name = input.next();
			if(nameArr.indexOf(name)==-1) {//-1�� ������ �ǹ�:�Է��� �̸��̶� �ٸ���
				break;
			}
			System.out.println("�����ϴ� �̸�. �ٽ�.");
			}
		System.out.println("��ȭ��ȣ �Է�: ");
		phNum = input.next();
		nameArr.add(name);
		numArr.add(phNum);
		System.out.println("���� �Ϸ�");
			break;
		case 2:
			System.out.println("�̸��Է�");
			name = input.next();
			temp= nameArr.indexOf(name);
			if(temp==-1) {
				System.out.println("�������� �ʴ� ���� �Դϴ�.");
			}else {
				System.out.println("�̸�: "+name);
				System.out.println("��ȭ��ȣ: "+numArr.get(temp)); //��Ī�� ��ȣ ã������ temp�Է�
				//System.out.println("��ȭ��ȣ: "+numArr.get(nameArr.indexOf(name)));
			}
			break;
		case 3: 
			System.out.println("�̸��Է�");
			name = input.next();
			temp= nameArr.indexOf(name);
			if(temp==-1) {
				System.out.println("�������� �ʴ� ���� �Դϴ�.");
			}else {
				//nameArr.remove(temp); �̷��� ���ų�
				nameArr.remove(name);
				//numArr.remove(temp) �̷��� ���ų�
				numArr.remove(numArr.get(temp));
				
				System.out.println("���� �Ϸ�");
			}
			break;
		case 4: 
			System.out.println("�̸� \t��ȭ��ȣ");
			System.out.println("===============");
				
			for(int i=0;i<numArr.size();i++) {
				System.out.print(nameArr.get(i)+"\t");
				System.out.println(numArr.get(i));
				System.out.println("-------------------------");
			}
			
			break;
		case 5: 
			System.exit(1);//���α׷� ����
		}
		
	}
	
	//����:���񽺸� �����ϴ� 
	//Ŭ���̾�Ʈ: ���񽺸� �޴�
}
}
