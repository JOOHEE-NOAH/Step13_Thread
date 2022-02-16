package factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory=new Factory();
		
		Worker worker=new Worker(factory);
		Buyer buyer=new Buyer(factory);
		
		worker.start();
		buyer.start();
		
	}

}
