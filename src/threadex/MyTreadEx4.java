package threadex;

/*//���� ������(daemon thread):Ư�� �۾� ������ �پ� �ִ� �۾� ex)��������
 * �Ϲݾ����尡 ��� �����ϸ� ���� ������� ���� ���� ��
 * �Ϲ� �����尡 �����ϸ� ���󾲷���� ������ ������ ����
 * ex)ȭ�� ����, �ڵ� ����-->Ư�� ���α׷��� �������� �����ϴ� �������α׷�
*/

class DemonTest extends Thread{
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		}
	}
}
public class MyTreadEx4 {

	public static void main(String[] args) {
		DemonTest th=new DemonTest();
		th.setDaemon(true); //true�� �Ǹ� main�Լ��� ������ �� �Բ� ����-> ���󾲷��尡 �־����忡 ������ �ǰ� �ϴ� ��� (��, �� �����尡 ����Ǹ� ���� ����ǰ�)
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			System.out.println(n);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
