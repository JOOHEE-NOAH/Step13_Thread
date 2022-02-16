package threadtest1;

public class EnglishUpperThread extends Thread{
	 private char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
             'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	 @Override
	 public void run() {
	 	for(char ar:arr) {
	 		System.out.print(ar+" ");
	 		try {
	 			Thread.sleep(30);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 	}
	 }	
	 	
	 //--------나의 풀이---------	
	 //@Override
	 //public void run() {
//	 	for(int i=0;i<arr.length;i++) {
//	 		System.out.print(arr[i]+" ");
//	 	}
//	 	}
	 }