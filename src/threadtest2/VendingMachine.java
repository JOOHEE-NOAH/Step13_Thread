package threadtest2;

import java.util.Stack;

public class VendingMachine {
   Stack store=new Stack();
   
   //�Һ�
   public synchronized String getDrink() {
      while(store.isEmpty()) {
         //��� ���� �� ���� �� �۾�
         try {
            wait();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
      return "--"+store.pop().toString()+"--";
   }
   
   
   
   //����
   public synchronized void putDrink(String drink) {
      // ���Ǳ⿡ drink �����ϴ� �۾�
      notifyAll();
      store.push(drink);
      
   }
   


}