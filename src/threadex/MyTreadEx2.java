package threadex;
import java.lang.Thread; //생략가능

// multi thread

/* start()는 쓰레드를 생성(VMThread;쓰레드실행준비)하고 
 * 만들어진 쓰레드가 run() 호출 
 * 멀티쓰레드 사용에는 run()이 아닌 start()를 사용 
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
            Thread.sleep(30);   // 30/1000초
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
      
      ob1.start(); //run 메소드를 호출함 
      ob2.start();
      ob3.start();
      long end=System.nanoTime();
      System.out.println("멀티스레드 소요시간 : "+(end-start));
//      싱글스레드 소요시간 : 9375410400
//      멀티스레드 소요시간 : 235800
      
      
   }

}