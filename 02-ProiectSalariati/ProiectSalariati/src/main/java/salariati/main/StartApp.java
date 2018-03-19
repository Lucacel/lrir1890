package salariati.main;

import salariati.controller.UIController;
import salariati.repository.interfaces.EmployeeRepositoryInterface;
import salariati.repository.mock.EmployeeMock;
import salariati.validator.EmployeeValidator;
import salariati.controller.EmployeeController;

//functionalitati
//i.	 adaugarea unui nou angajat (nume, prenume, CNP, functia didactica, salariul de incadrare);
//ii.	 modificarea functiei didactice (asistent/lector/conferentiar/profesor) a unui angajat;
//iii.	 afisarea salariatilor ordonati descrescator dupa salariu si crescator dupa varsta (CNP).


public class StartApp {

	public static void main_menu(){
		System.out.println("1)Add employee:");
		System.out.println("2)Modify didactic function");
		System.out.println("3)Print descended by salary");
		System.out.println("4)Print ascending by age");
		System.out.println("-------------------------------");
	}

	public static void nonGUIInterface(){
		main_menu();

	}

	public static void main(String[] args) {
		
		EmployeeRepositoryInterface employeesRepository = new EmployeeMock();
		EmployeeController employeeController = new EmployeeController(employeesRepository);

		UIController uiController = new UIController(employeeController,new EmployeeValidator());


	}

}
