
import java.util.ArrayList;
import java.util.List;
public class BankManager implements Employee {
	private int id;
	private String name;
	private double salary;
	List <Employee> empleados=new ArrayList<>();
	public BankManager(int id, String name, double salary) {
		this.id=id;  
	    this.name = name;  
	    this.salary = salary;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		System.out.println("ID: "+id);
		System.out.println("Nombre: "+name);
		System.out.println("Puesto: Gerente");
		System.out.println("Salario: "+salary);
		System.out.println("Empleados: ");
		System.out.println("");
		for(int i =0;i<empleados.size();i++) {
			empleados.get(i).print();
		}
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		empleados.add(employee);

	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		empleados.remove(employee);

	}

	@Override
	public Employee getChild(int a) {
		// TODO Auto-generated method stub
		return empleados.get(a);
	}

}