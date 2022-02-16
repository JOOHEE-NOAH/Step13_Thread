package threadex;
import java.lang.Thread; //��������
//Ŭ������ �ٸ��� ����ؾ��� ��� Runnable���

// multi thread

/* start()�� �����带 ����(VMThread;����������غ�)�ϰ�
 * ������� �����尡 run() ȣ�� 
 * ��Ƽ������ ��뿡�� run()�� �ƴ� start()�� ��� 
 */
public class MyTreadEx3 implements Runnable {
   String str;
   int num;
   public MyTreadEx3(String str, int num) {
      this.str=str;
      this.num=num;
   }
   @Override 
   public void run() { //������ ��Ű�����ϴ� ������ run �޼ҵ忡 ������ �Ǵ� ������ ����!!!
      for(int i=0; i<num; i++) {
         System.out.println(str);
         try {
            Thread.sleep(30);   // 30/1000��
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   public static void main(String[] args) {
      long start=System.nanoTime();
      MyTreadEx3 ob1=new MyTreadEx3("one", 100);
      MyTreadEx3 ob2=new MyTreadEx3("two", 100);
      MyTreadEx3 ob3=new MyTreadEx3("three", 100);
      
      Thread th1=new Thread(ob1);
      Thread th2=new Thread(ob2);
      Thread th3=new Thread(ob3);
            
      th1.start();// start()-->run()ȣ��
      th2.start();
      th3.start();
      long end=System.nanoTime();
      System.out.println("��Ƽ������ �ҿ�ð� : "+(end-start));
//	��Ƽ������ �ҿ�ð� :499500
      
      
   }

}
