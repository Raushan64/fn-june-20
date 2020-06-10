import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Taxable product = () -> {
//			System.out.println("calculating tax");
//			return 0.0;
//		};
//		
//		Taxable.showTax();
//		
//		Product p2 = new Product();
//		Taxable.showTax();
//		p2.method();
		
		List<Employee> listEmployees = new ArrayList<>();
		
		Predicate<Collection> predicate = (col) -> col.isEmpty();
		
		predicate.test(listEmployees);
		
//		Employee employee1 = new Employee("Tom", "Eagar");
//		Employee employee2 = new Employee("Tom", "Smith");
//		Employee employee3 = new Employee("Bill", "Joy");
//		Employee employee4 = new Employee("Bill", "Gates");
//		Employee employee5 = new Employee("Alice", "Wooden");
//		
//		listEmployees.add(employee1);
//		listEmployees.add(employee2);
//		listEmployees.add(employee3);
//		listEmployees.add(employee4);
//		listEmployees.add(employee5);
//			
//		Comparator<Employee> fncomparator = (o1, o2) -> o1.firstName.compareTo(o2.firstName);
//		
//		Collections.sort(listEmployees, fncomparator);
//		
//		listEmployees.forEach((employee)->System.out.println(employee));
	}

}
