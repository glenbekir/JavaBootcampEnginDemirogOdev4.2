
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new BaseCustomerManager();
		customerManager.Save(new Customer (1,"Ebubekir","GÜLEN","15.12.2000","123456"));
		
		System.out.println();
	}

}
