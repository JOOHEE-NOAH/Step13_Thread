package threadex;
import java.lang.Thread; //생략가능
//클래스가 다른걸 상속해야할 경우 Runnable사용

// multi thread

/* start()는 쓰레드를 생성(VMThread;쓰레드실행준비)하고
 * 만들어진 쓰레드가 run() 호출 
 * 멀티쓰레드 사용에는 run()이 아닌 start()를 사용 
 */
public class MyTreadEx3 implements Runnable {
   String str;
   int num;
   public MyTreadEx3(String str, int num) {
      this.str=str;
      this.num=num;
   }
   @Override 
   public void run() { //동작을 시키고자하는 내용을 run 메소드에 넣으면 되는 간단한 내용!!!
      for(int i=0; i<num; i++) {
         System.out.println(str);
         try {
            Thread.sleep(30);   // 30/1000초
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
            
      th1.start();// start()-->run()호출
      th2.start();
      th3.start();
      long end=System.nanoTime();
      System.out.println("멀티스레드 소요시간 : "+(end-start));
//	멀티스레드 소요시간 :499500
      
      
   }

}
