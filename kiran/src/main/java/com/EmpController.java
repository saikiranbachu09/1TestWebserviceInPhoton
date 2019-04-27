package com;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/JsonData", method = RequestMethod.GET)
	public JSONArray getTestData() {
		JSONArray ja = new JSONArray();
		
		JSONObject js1 = new JSONObject();				
		js1.put("Link Oppurtunity", "Link Oppurtunity" );
		js1.put("Project ID", 10585 );
		js1.put("Project Name", "Active-Bench" );
		js1.put("Oppurtunity", "Parent Oppurtunity");
		js1.put("Name","Alexa & Lex" );
		js1.put("Start Date", "8/21/2019" );
		js1.put("End Date","8/30/2019" );
		js1.put("Revenue/Billing", "$2345.64" );
		js1.put("Latest Comment","Submitted for approval" );
		js1.put("Approval/Rejected","Approved" );
		js1.put("revenue", "S2214545" );
		js1.put("Cost", "$12545");
		js1.put("Oppurtunity1", "Child Oppurtunity");
		js1.put("Name1","Alexa & Lex" );
		js1.put("Start_Date", "8/21/2019" );
		js1.put("End_Date","8/30/2019" );
		js1.put("Revenue_Billing", "$1234.64" );
		ja.add(js1);
		
		JSONObject js2 = new JSONObject();		
		js2.put("Add Resource", "Add Resource" );
		js2.put("Project ID", 10585 );
		js2.put("Project Name", "Active-Bench" );
		js2.put("Oppurtunity", "Parent Oppurtunity");
		js2.put("Name","Alexa & Lex" );
		js2.put("Start Date", "8/21/2019" );
		js2.put("End Date","8/30/2019" );
		js2.put("Revenue/Billing", "$2345.64" );
		js2.put("Latest Comment","Submitted for approval" );
		js2.put("Approval/Rejected","Approved" );
		js2.put("revenue", "S2214545" );
		js2.put("Cost", "$12545");
		js2.put("Oppurtunity1", "Child Oppurtunity");
		js2.put("Name1","Alexa & Lex" );
		js2.put("Start_Date", "8/21/2019" );
		js2.put("End_Date","8/30/2019" );
		js2.put("Revenue_Billing", "$1234.64" );
		ja.add(js2);
		
		JSONObject js3 = new JSONObject();		
		js3.put("New CR creation", " New CR creation" );
		js3.put("Project ID", 10585 );
		js3.put("Project Name", "Active-Bench" );
		js3.put("Oppurtunity", "Parent Oppurtunity");
		js3.put("Name","Alexa & Lex" );
		js3.put("Start Date", "8/21/2019" );
		js3.put("End Date","8/30/2019" );
		js3.put("Revenue/Billing", "$2345.64" );
		js3.put("Latest Comment","Submitted for approval" );
		js3.put("Approval/Rejected","Approved" );
		js3.put("revenue", "S2214545" );
		js3.put("Cost", "$12545");
		js3.put("Oppurtunity1", "Child Oppurtunity");
		js3.put("Name1","Alexa & Lex" );
		js3.put("Start_Date", "8/21/2019" );
		js3.put("End_Date","8/30/2019" );
		js3.put("Revenue_Billing", "$1234.64" );
		ja.add(js3);
		
		JSONObject js4 = new JSONObject();
		js4.put("CR Creation", "CR Creation" );
		js4.put("Project ID", 10585 );
		js4.put("Project Name", "Active-Bench" );
		js4.put("Oppurtunity", "Parent Oppurtunity");
		js4.put("Name","Alexa & Lex" );
		js4.put("Start Date", "8/21/2019" );
		js4.put("End Date","8/30/2019" );
		js4.put("Revenue/Billing", "$2345.64" );
		js4.put("Latest Comment","Submitted for approval" );
		js4.put("Approval/Rejected","Approved" );
		js4.put("revenue", "S2214545" );
		js4.put("Cost", "$12545");
		js4.put("Oppurtunity1", "Child Oppurtunity");
		js4.put("Name1","Alexa & Lex" );
		js4.put("Start_Date", "8/21/2019" );
		js4.put("End_Date","8/30/2019" );
		js4.put("Revenue_Billing", "$1234.64" );
		ja.add(js4);
		
		return ja;
		
	}

}
