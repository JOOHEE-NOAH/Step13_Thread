package threadtest1;

public class KoreanThread extends Thread{
	private char[] arr={'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};

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
	
//--------���� Ǯ��---------	
//@Override
//public void run() {
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
//	}
}
