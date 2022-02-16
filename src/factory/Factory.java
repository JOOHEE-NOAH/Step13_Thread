package factory;

/* 스레드 조정(실행제어)
 * wait(): 쓰레드를 일시 정지 시켜서 대기 상태로 만들기
 * notify():쓰레드를 깨워서 다시 실행
 * notify(All):모든 쓰레드를 깨워서 다시 실행
 * 
 * 다중쓰레드에서는 notify()실행시 어느 쓰레드가 깨어날지 모름.
 * (우선순위 높은애가 깨어날 확률이 높음 그럼 하나만 계속 동작하게되는 상황이 발생할 수 있음)
 * notifyAll()을 사용하여 모든 쓰레드를 깨우고 JVM이 스레드 우선순위에 따라 처리하는게 낫다
*/
public class Factory {//Thread안해도 됨. 호출 당하는 입장이라서 호출하는 run메소드 쪽에서만 Thread처리하면 된다.
	private int product=0;
	
	public synchronized void produce() {//생산
		if(product>4) {
			System.out.println("생산중단 : "+product);
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		++product;
		System.out.println("생산 : "+product);
		
		notifyAll(); //깨우는 작업 하나만 깨울거면 notify 다 깨울거면 notifyAll. 하나만 깨우면 누구 깨울지 몰라서 보통 all함
	}

	public synchronized void sell() {
		if(product<1) {
			System.out.println("소비중단 : "+product);
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		--product;
		System.out.println("소비 : "+product);
		
		notifyAll();
	}
}
