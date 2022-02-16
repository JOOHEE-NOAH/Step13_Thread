package factory;

/* ������ ����(��������)
 * wait(): �����带 �Ͻ� ���� ���Ѽ� ��� ���·� �����
 * notify():�����带 ������ �ٽ� ����
 * notify(All):��� �����带 ������ �ٽ� ����
 * 
 * ���߾����忡���� notify()����� ��� �����尡 ����� ��.
 * (�켱���� �����ְ� ��� Ȯ���� ���� �׷� �ϳ��� ��� �����ϰԵǴ� ��Ȳ�� �߻��� �� ����)
 * notifyAll()�� ����Ͽ� ��� �����带 ����� JVM�� ������ �켱������ ���� ó���ϴ°� ����
*/
public class Factory {//Thread���ص� ��. ȣ�� ���ϴ� �����̶� ȣ���ϴ� run�޼ҵ� �ʿ����� Threadó���ϸ� �ȴ�.
	private int product=0;
	
	public synchronized void produce() {//����
		if(product>4) {
			System.out.println("�����ߴ� : "+product);
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		++product;
		System.out.println("���� : "+product);
		
		notifyAll(); //����� �۾� �ϳ��� ����Ÿ� notify �� ����Ÿ� notifyAll. �ϳ��� ����� ���� ������ ���� ���� all��
	}

	public synchronized void sell() {
		if(product<1) {
			System.out.println("�Һ��ߴ� : "+product);
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		--product;
		System.out.println("�Һ� : "+product);
		
		notifyAll();
	}
}
