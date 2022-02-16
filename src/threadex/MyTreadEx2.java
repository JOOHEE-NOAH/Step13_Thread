package threadex;
import java.lang.Thread; //��������

// multi thread

/* start()�� �����带 ����(VMThread;����������غ�)�ϰ� 
 * ������� �����尡 run() ȣ�� 
 * ��Ƽ������ ��뿡�� run()�� �ƴ� start()�� ��� 
 */
public class MyTreadEx2 extends Thread {
   String str;
   int num;
   public MyTreadEx2(String str, int num) {
      this.str=str;
      this.num=num;
   }
   @Override 
   public void run() {
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
      MyTreadEx2 ob1=new MyTreadEx2("one", 100);
      MyTreadEx2 ob2=new MyTreadEx2("two", 100);
      MyTreadEx2 ob3=new MyTreadEx2("three", 100);
      
      ob1.start(); //run �޼ҵ带 ȣ���� 
      ob2.start();
      ob3.start();
      long end=System.nanoTime();
      System.out.println("��Ƽ������ �ҿ�ð� : "+(end-start));
//      �̱۽����� �ҿ�ð� : 9375410400
//      ��Ƽ������ �ҿ�ð� : 235800
      
      
   }

}