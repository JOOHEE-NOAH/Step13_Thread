package threadtest2;

public class Producer extends Thread {
	   private VendingMachine vm;

	   public Producer(VendingMachine vm) {
	      this.vm=vm;
	   }
	   
	   @Override
	   public void run() {
	      
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() +
						" : ����� No. " + i + " ���Ǳ⿡ �ֱ�");
				vm.putDrink("����� No. " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	      
	   }
	   
	   

	}
