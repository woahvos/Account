import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Accounttest {
	public static void main(String args[]){
		CheckingAccount account1 = new CheckingAccount(100,50,0.01,0.07);
		SavingAccount account2 = new SavingAccount(100,0.05);
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);
		
		System.out.println("��ü ������ �ܾ� �ջ� : " +Account.sumForAccount(accountList));
		System.out.println("��ü ������ 12���� �� ����");
		Account.passTimeForList(accountList, 12);
		System.out.println("��ü ������ �ܾ� �ջ� : " +Account.sumForAccount(accountList));
	}
}	
 
