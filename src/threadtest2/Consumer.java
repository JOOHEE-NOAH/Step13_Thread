package threadtest2;

public class Consumer extends Thread{
	   private VendingMachine vm;
	   
	   public Consumer(VendingMachine vm) {
	      this.vm=vm;
	   }
	   
	   @Override
	   public void run() {
	      
	      for(int i=1; i<=10; i++) {
	         System.out.println(Thread.currentThread().getName()+
	               " : "+vm.getDrink()+" ²¨³»¸ÔÀ½");
	         
	         try {
	            Thread.sleep(300);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }  
	      }         
	      }
