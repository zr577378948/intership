package com.ouya.zr.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		User[] users = new User[3];
//		����û�
		users[0] = new User(1001,1235,500.00);
		users[1] = new User(1002,1236,700.00);
		users[2] = new User(1003,1237,900.00);
		
//		����
		while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ��������ȡ��ϵͳ");
		System.out.println("�������˺ţ�");
		int id = input.nextInt();
		System.out.println("���������룺");
		int pwd = input.nextInt();
		
		User user = null;
		for(int i = 0;i < users.length;i++){
			user = users[i];
			if(user.getId() == id && user.getPassword() == pwd){
				break;
			}else{
				user = null;
			}
		}
		boolean f = true;
		if(user!=null){
			System.out.println("��¼�ɹ�������");
			do {
				System.out.println("��ѡ����Ĳ�����");
				System.out.println("1.��Ǯ");
				System.out.println("2.ȡǮ");
				System.out.println("3.��ѯ���");
				System.out.println("4.ת��");
				System.out.println("0.�˳�ϵͳ");
				
				int i = input.nextInt();
				switch (i) {
				case 0:
					//�˳�ϵͳ
					f = false;
					break;
				case 1:
					//������
					System.out.println("���������");
					double money = input.nextDouble();
					user.setMoney(user.getMoney()+money);
					System.out.println("��ǰ�˻���"+user.getMoney());
					break;
					
				case 2:
					//ȡ�����
					while(true){
					System.out.println("������ȡ���");
					double money1 = input.nextDouble();
					if(user.getMoney()-money1>=0){
					user.setMoney(user.getMoney()-money1);}
					else{
						System.out.println("���㣡���������룺");
					}
					//System.out.println("��ǰ�˻���"+user.getMoney());
					break;
					}

				case 3:
					//��ѯ����
					System.out.println("��ǰ�˻���"+user.getMoney());
					break;
					
				case 4:
					//ת�˲���
					while(true){
					System.out.println("������ת���˻���");
					int id1 = input.nextInt();
				
					for(int i1 = 0;i1 < users.length;i1++){
						user = users[i1];
						if(user.getId()==id1){
							System.out.println("������ת�˽�");
							double money2 = input.nextDouble();
							if(user.getMoney()-money2>=0){
								user.setMoney(user.getMoney()-money2);}
								else{
									System.out.println("���㣡���������룺");
								}System.out.println("��ǰ�˻���"+user.getMoney());
							user.setMoney(user.getMoney()+money2);
						}else{
							user = null;
						}
					}
					
					break;}
				default:
					break;
				}
			} while (f);
		}else{
			System.out.println("��¼ʧ�ܣ�����");
		}
		}
	}
}