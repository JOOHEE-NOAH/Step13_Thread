package threadex;
/*쓰레드 우선순위 : setPriority()
 * 우선 순위 높은 쓰레드는 실행시간을 많이 할당받음.(그래야 빨리 끝나니까)

join();한 쓰레드가 종료될때까지 다른 쓰레드는 대기
*/
public class RoseTest extends Thread{
	private String rose;
	
	public RoseTest(String rose) {
		this.rose=rose;
	}
	
	@Override
	public void run() {//여기서 특정 작업 처리
		for(int i=0;i<500;i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(rose+"\t"+Thread.currentThread()); //커런트 쓰레드: 쓰레드의 정보를 출력
			//currentThread: 이름 ,우선순위, 그룹
	}
	}
	public static void main(String[] args) {
		RoseTest ob1=new RoseTest("흑장미");
		RoseTest ob2=new RoseTest("백장미");
		RoseTest ob3=new RoseTest("장미껌");
		//쓰레드 결과는 예측불가 대신 승부조작은 가능 (1등 주고싶은애는 1등 줄 수 있음)
	//	ob1.setPriority(6);//( )안은 우선순위
		//우선 순위가 낮을수록 결과가 늦게 나옴--->동작이 늦게 끝남
		//0: 낮은 우선 순위
		//10: 높은 우선 순위
		//5 : 순위 없음(중간 순위)
		ob1.setPriority(MAX_PRIORITY);
		ob2.setPriority(MIN_PRIORITY);
		ob3.setPriority(NORM_PRIORITY);
		
		
		ob1.start();
		try {
			ob1.join(); //ob1 동작시키는데, ob1 동작이 끝날때까지 다른 쓰레드는 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob2.start();
		ob3.start();
	}

}
