package threadex;
//����ȭ ->�ַ� ��Ʈ��ũ ���α׷���(ä��)���� ���� ����Ѵ�.
//����ȭ Ű���� �ϳ��� �־��ָ� �ȴ�.
class FamilyThread extends Thread{ //run�޼ҵ�� extends Thread�� runnable�� ��ġ������
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
class Washroom{ //run�޼ҵ忡��
	public synchronized void openDoor(String who) { //����ȭó�� :synchronized ���� ���� ����ȭ
		System.out.println(who+"���� ����");
		for(int i=0; i<50000;i++) { //������ �ѹ��� �����ð� �ϸ鼭 �޼��� �Ѹ��� ����.
			if(i%10000==0) {
				try { 
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(who+"���� ������ ���� ��...");
			}
		}
		System.out.println(who+"���� ����");
	}
}

public class SyncThreadTest {

	public static void main(String[] args) {
		Washroom wr=new Washroom();
		FamilyThread father=new FamilyThread(wr,"father"); //(���ʺ� Ÿ��, �̸�)
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
