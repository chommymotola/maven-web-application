package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

	
	@GetMapping
	@ResponseBody
	@RequestMapping("/greet", method = GET)
public String greet(String greetee) {
			

		JSONObject js = new JSONObject();
		js.put("Name", "Landmark Technologies");
		js.put("Calling Name", "Landmark");
		js.put("DOB", "08-Nov-2011");
		js.put("Hobbies", "Reading Technical Blogs,Teaching, Changing lives..");
		js.put("Places he like", "Africa, Church, His native place");

		return js.toString();
}
}
