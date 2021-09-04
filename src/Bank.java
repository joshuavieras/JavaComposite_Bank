
public class Bank {
	public static void main(String args[]){  
		Employee m =new BankManager(1780, "Jose Vega",800000);
		Employee c1 =new Cashier(1760, "María Alpizar",350000);
		Employee c2 =new Cashier(1750, "Gustavo Calderon",350000);
		Employee a1 =new Accountant(1781, "Cintia Mora",500000);
		Employee a2 =new Accountant(1783, "Andres Vega",500000);
		m.add(c1);
		m.add(c2);
		m.add(a1);
		m.add(a2);
		m.print();
       }  
}
