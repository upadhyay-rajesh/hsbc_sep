import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Employee> l =  new HashSet<Employee>();
		
		Employee a1 = new Employee();
		a1.setEmpId("sdf234");
		a1.setName("asdfsd");
		a1.setEmail("lsjdflj@gmail.com");
		
		l.add(a1);
		
		for(Employee e:l) {
			System.out.println(e.getEmail() + " " + e.getEmpId() + " " + e.getName());
		}
	}

}
