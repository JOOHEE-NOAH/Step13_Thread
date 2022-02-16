package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable{// ���ʺ� �ϸ� run�޼ҵ尡 �ڵ��ϼ�
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private long balance; // ã�� �ݾ�
	private long depositMoney=100000; //�ܾ�
	
	@Override
	public synchronized void run() { //�����ϰ����ϴ� �޼ҵ忡 ���ؼ� ����ȭ ó��
		System.out.println(Thread.currentThread().getName()+"���� �������"); //������ �������� �̸� �̾Ƴ���
	
		System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
		try {
			balance=Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withDraw();//�ܾװ��
	}
	
	public void withDraw() {
		if(depositMoney>=balance) {
			if(balance%10000==0) {
				depositMoney=depositMoney-balance;
				System.out.println("���� �ݾ��� "+depositMoney+"�� �Դϴ�\n");
			}else {
				System.out.println("�ݾ��� ���������� �־��ּ���\n");
			}
			}else {
				System.out.println("�ܾ��� �����մϴ�.\n");
			
		}
	}
	

}
