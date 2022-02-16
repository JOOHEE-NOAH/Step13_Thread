package threadex;

/*//데몬 쓰레드(daemon thread):특정 작업 하위에 붙어 있는 작업 ex)파일저장
 * 일반쓰레드가 모두 종료하면 데몬 쓰레드는 강제 종료 됨
 * 일반 쓰레드가 종료하면 데몬쓰레드는 존재할 이유가 없음
 * ex)화면 갱신, 자동 저장-->특정 프로그램의 하위에서 동작하는 서브프로그램
*/

class DemonTest extends Thread{
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		}
	}
}
public class MyTreadEx4 {

	public static void main(String[] args) {
		DemonTest th=new DemonTest();
		th.setDaemon(true); //true가 되면 main함수가 종료할 때 함께 종료-> 데몬쓰레드가 주쓰레드에 종속이 되게 하는 기능 (즉, 주 쓰레드가 종료되면 같이 종료되게)
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			System.out.println(n);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
