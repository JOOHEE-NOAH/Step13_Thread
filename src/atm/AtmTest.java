package atm;

public class AtmTest {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread mom=new Thread(bank, "����"); //(���ʺ� Ÿ��, �̸�)
		Thread son=new Thread(bank, "�Ƶ�");
	
		mom.start();// �� �ΰ��� ��Ƽ������� �����ϰڴٴ� �ǹ�
		son.start();
	}
	

}
