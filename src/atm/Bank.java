package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable{// 러너블 하면 run메소드가 자동완성
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private long balance; // 찾는 금액
	private long depositMoney=100000; //잔액
	
	@Override
	public synchronized void run() { //동작하고자하는 메소드에 대해서 동기화 처리
		System.out.println(Thread.currentThread().getName()+"고객님 어서오세요"); //쓰레드 정보에서 이름 뽑아내기
	
		System.out.print("출금하실 금액을 입력하세요 : ");
		try {
			balance=Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withDraw();//잔액계산
	}
	
	public void withDraw() {
		if(depositMoney>=balance) {
			if(balance%10000==0) {
				depositMoney=depositMoney-balance;
				System.out.println("남은 금액은 "+depositMoney+"원 입니다\n");
			}else {
				System.out.println("금액을 만원단위로 넣어주세요\n");
			}
			}else {
				System.out.println("잔액이 부족합니다.\n");
			
		}
	}
	

}
