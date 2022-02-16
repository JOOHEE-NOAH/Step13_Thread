package threadtest1;

public class EnglishLowerThread extends Thread{
	private  char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
              'o','p','q','r','s','t','u','v','w','x','y','z'};
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
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		}
	}
