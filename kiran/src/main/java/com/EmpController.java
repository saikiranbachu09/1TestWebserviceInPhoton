package com;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class EmpController {
	List<Employee> empData = new ArrayList<Employee>();;

	@RequestMapping("/")
	public String maiPage() {
		return "index";
	}

	@RequestMapping(value = "/getDetails", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getDetails() {

		empData.add(new Employee("saikrian", 1));
		empData.add(new Employee("sa", 2));
		empData.add(new Employee("Ram", 3));
		return empData;
	}

	@RequestMapping(value = "/postDetails/{name}/{id}", method = RequestMethod.POST)
	public @ResponseBody List<Employee> postDetails(@PathVariable("name") String name, @PathVariable int id) {

		empData.add(new Employee(name, id));

		return empData;
	}

	@RequestMapping(value = "/postDetails1", method = RequestMethod.POST)
	@ResponseBody
	public List<Employee> post1Details(@RequestBody Employee e) {

		empData.add(e);
		return empData;
	}

	@RequestMapping(value = "/putDetails/{Id}", method = RequestMethod.PUT)
	@ResponseBody
	public List<Employee> putDetails(@PathVariable("Id") int Id) {
		ArrayList<Employee> emp = (ArrayList<Employee>) empData;
		for (Employee em : emp) {
			Employee data = em;

			if (data.getEmployeeNumber() == Id) {

				em.setEmployeeName("Updated One");

			}
		}
		return empData;

	}

	@RequestMapping(value = "/deleteDetails/{Id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ArrayList<Employee> deleteDetails(@PathVariable("Id") int Id) {
		ArrayList<Employee> emp = (ArrayList<Employee>) empData;
		for (Employee em : emp) {
			Employee data = em;

			if (data.getEmployeeNumber() == Id) {
				emp.remove(em);
			}
		}
		return emp;
	}

	@ResponseBody
	@RequestMapping(value = "/putJson", method = RequestMethod.POST)
	public List<Employee> getJsonList(@RequestBody Employee[] emp) {

		List<Employee> list = empData;

		for (Employee t1 : emp) {

			list.add(t1);
		}
		return list;
	}

}
