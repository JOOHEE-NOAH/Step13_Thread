package factory;
//생성작업을 처리하겠다.
public class Worker extends Thread {
	private Factory factory;
	public Worker(Factory factory) {
		this.factory=factory;
	}
	
	@Override
	public void run() {
		for(int i=0; i<500;i++) {
			factory.produce();
		}
	}
}
