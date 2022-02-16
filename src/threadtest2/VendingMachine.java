package threadtest2;

import java.util.Stack;

public class VendingMachine {
   Stack store=new Stack();
   
   //소비
   public synchronized String getDrink() {
      while(store.isEmpty()) {
         //비어 있을 때 수행 할 작업
         try {
            wait();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
      return "--"+store.pop().toString()+"--";
   }
   
   
   
   //생산
   public synchronized void putDrink(String drink) {
      // 자판기에 drink 투입하는 작업
      notifyAll();
      store.push(drink);
      
   }
   


}