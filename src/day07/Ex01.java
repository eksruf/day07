package day07;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	/*
	 �÷��� ������ ��ũ
	 �÷��� 
	 -�ټ��� ������, �����ͱ׷�
	 -������ �������� ���� - �ڹ��� �ڷᱸ��
	 
	 �����ӿ�ũ
	 - �ϳ��� Ʋ
	 -ǥ��ȭ�� ���α׷��� ���
	 List, Set,Map
	 List(�θ�)
	 -ArrayList
	 -LinkedList
	 -Stack...
	 
	 
	 ArrayList
	 -������ �����Ѵ�.
	 -�������� �ߺ��� �����Ѵ�.
	 */
	
	
	ArrayList arr = new ArrayList(); //����
	//Arraylist = �ڷ���, arr = �����̸�
	//ù ���ڰ� �빮�ڴ� Ŭ����
	arr.add("123");
	arr.add("456");
	System.out.println(arr.get(0));
	System.out.println(arr.get(1));
	
	//ù ���ڰ� �ҹ��󸶸� ���� �� .�� �� ��� �͵� ǥ�� �ȵ�
	//Ŭ������ ������ ����� �Է��� ������ ��� ����
	
	System.out.println(arr.size());
	//����� ������ ������ �´�.
	int s = arr.size();// ������ �����Ͽ� ���� ĭ�� ���� �� �ִ�
	//int [] a = new int [s] ��� �� �� �ִ�
	int [] a = new int[3];
	System.out.println(a.length);
	
	boolean bool = arr.contains("123");
	if (bool ==true) {
		System.out.println("123�� �����մϴ�.");
	}//������ �ʿ��� ��찡 ���� �� �� ���� �ִ�
	
	System.out.println(bool );
	System.out.println(arr.contains("12311") );
	//�ش��ϴ� ���� �����ϴ°�? ���� �������� ���
	
	System.out.println(arr.remove("123"));
	//������ ��� ����� Ʈ�� ���
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	
	arr.clear();
	System.out.println(arr.size());
	
	
	arr.add("���"); arr.add("�ұ�");
	arr.add("����");
	//���ʷ� ��ȣ ���� ���=0�� �ұ� =1�� ���� =2��
	String index = "�ұ�";
	int i = arr.indexOf(index); //index�� �ش��ϴ� ��ȣ�� �˷��ּ���
	System.out.println(i+"��° ������");
	
	System.out.println("���� �� : "+arr.get(1));
	arr.set(i, "�ݱ�");
	System.out.println("������: "+arr.get(1));
	
	
}
}
