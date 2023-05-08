package fc.data;

import java.util.ArrayList;
import java.util.List;

import bean.servlet.Employee;

public class Data {
	
	
	private static List <Employee> list = new ArrayList<>();

	public static List<Employee> getList() {
		return list;
	}

	public static void setList(List<Employee> list1) {
		list = list1;
	}
	
	
	
	
	

}
