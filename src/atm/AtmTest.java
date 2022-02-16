package atm;

public class AtmTest {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread mom=new Thread(bank, "엄마"); //(러너블 타겟, 이름)
		Thread son=new Thread(bank, "아들");
	
		mom.start();// 이 두개가 멀티쓰레드로 동작하겠다는 의미
		son.start();
	}
	

}
