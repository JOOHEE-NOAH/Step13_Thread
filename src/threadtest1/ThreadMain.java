package threadtest1;

public class ThreadMain {

	public static void main(String[] args) {
		EnglishLowerThread t1=new EnglishLowerThread();
        EnglishUpperThread t2=new EnglishUpperThread();
        KoreanThread t3=new KoreanThread();
        
        
        
        
        t3.start();
        try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println();
        t2.start();
        try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println();
        t1.start();
	}

}
