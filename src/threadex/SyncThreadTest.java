package threadex;
//동기화 ->주로 네트워크 프로그래밍(채팅)에서 많이 사용한다.
//동기화 키워드 하나만 넣어주면 된다.
class FamilyThread extends Thread{ //run메소드는 extends Thread나 runnable에 위치시켜줌
	private Washroom wr;
	private String who;
	public FamilyThread(Washroom wr,String who) {
		this.wr=wr;
		this.who=who;
	}
	@Override
	public void run() {
		wr.openDoor(who);
	}
}
class Washroom{ //run메소드에서
	public synchronized void openDoor(String who) { //동기화처리 :synchronized 실행 순서 동기화
		System.out.println(who+"님이 입장");
		for(int i=0; i<50000;i++) { //만번에 한번씩 지연시간 하면서 메세지 뿌리는 동작.
			if(i%10000==0) {
				try { 
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(who+"님이 볼일을 보는 중...");
			}
		}
		System.out.println(who+"님이 퇴장");
	}
}

public class SyncThreadTest {

	public static void main(String[] args) {
		Washroom wr=new Washroom();
		FamilyThread father=new FamilyThread(wr,"father"); //(러너블 타겟, 이름)
		FamilyThread mother=new FamilyThread(wr,"mother");
		FamilyThread brother=new FamilyThread(wr,"brother");
		FamilyThread sister=new FamilyThread(wr,"sister");
		FamilyThread me=new FamilyThread(wr,"me");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}

}
