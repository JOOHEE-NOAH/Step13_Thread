package threadex;
/*������ �켱���� : setPriority()
 * �켱 ���� ���� ������� ����ð��� ���� �Ҵ����.(�׷��� ���� �����ϱ�)

join();�� �����尡 ����ɶ����� �ٸ� ������� ���
*/
public class RoseTest extends Thread{
	private String rose;
	
	public RoseTest(String rose) {
		this.rose=rose;
	}
	
	@Override
	public void run() {//���⼭ Ư�� �۾� ó��
		for(int i=0;i<500;i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(rose+"\t"+Thread.currentThread()); //Ŀ��Ʈ ������: �������� ������ ���
			//currentThread: �̸� ,�켱����, �׷�
	}
	}
	public static void main(String[] args) {
		RoseTest ob1=new RoseTest("�����");
		RoseTest ob2=new RoseTest("�����");
		RoseTest ob3=new RoseTest("��̲�");
		//������ ����� �����Ұ� ��� �º������� ���� (1�� �ְ�����ִ� 1�� �� �� ����)
	//	ob1.setPriority(6);//( )���� �켱����
		//�켱 ������ �������� ����� �ʰ� ����--->������ �ʰ� ����
		//0: ���� �켱 ����
		//10: ���� �켱 ����
		//5 : ���� ����(�߰� ����)
		ob1.setPriority(MAX_PRIORITY);
		ob2.setPriority(MIN_PRIORITY);
		ob3.setPriority(NORM_PRIORITY);
		
		
		ob1.start();
		try {
			ob1.join(); //ob1 ���۽�Ű�µ�, ob1 ������ ���������� �ٸ� ������� ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob2.start();
		ob3.start();
	}

}
