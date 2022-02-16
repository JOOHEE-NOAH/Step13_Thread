package threadex;
// single thread
public class MyTreadEx1 {
   String str;
   int num;
   public MyTreadEx1(String str, int num) {
      this.str=str;
      this.num=num;
   }
   public void view() {
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
      MyTreadEx1 ob1=new MyTreadEx1("one", 100);
      MyTreadEx1 ob2=new MyTreadEx1("two", 100);
      MyTreadEx1 ob3=new MyTreadEx1("three", 100);
      
      ob1.view();
      ob2.view();
      ob3.view();
      long end=System.nanoTime();
      System.out.println("싱글스레드 소요시간 : "+(end-start));
//      싱글스레드 소요시간 : 9375410400
      
      
   }

}