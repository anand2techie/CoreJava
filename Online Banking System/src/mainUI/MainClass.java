package mainUI;

import java.util.ArrayList;

import business_controllers.AccountController;
import exceptions.NotFoundException;
import models.Account;
import models.MapAccountCustomer;

public class MainClass {

	public static void main(String[] args) throws NotFoundException {
		// TODO Auto-generated method stub
		AccountController accountController=new AccountController();
		
		/*Account account=new Account();
		account.setAll(3, 678, 67000, 2, 200);
		
		
		ArrayList<MapAccountCustomer> mapAccountCustomersList=new ArrayList<MapAccountCustomer>();
		MapAccountCustomer mapAccountCustomer=new MapAccountCustomer();
		mapAccountCustomer.setAll(1, 1, 2);
		mapAccountCustomersList.add(mapAccountCustomer);
		
		accountController.saveAccount(account, mapAccountCustomersList);*/
		accountController.depositMoney(3, 2, 500, 678);
		
	}

}
