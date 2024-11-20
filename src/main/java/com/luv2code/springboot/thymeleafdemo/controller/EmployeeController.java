package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Tasks;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.MemberService;
import com.luv2code.springboot.thymeleafdemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	private TaskService taskService;
	private MemberService memberService;

	@Autowired
	public EmployeeController(EmployeeService theEmployeeService, TaskService theTaskService, MemberService theMemberService) {
		employeeService = theEmployeeService;
		taskService = theTaskService;
		memberService=theMemberService;
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees = employeeService.findAll();
		List<Tasks> theTasks=taskService.findAll();
		theModel.addAttribute("tasks",theTasks);
		theModel.addAttribute("employees", theEmployees);
		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		Employee theEmployee = employeeService.findById(theId);
		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		employeeService.save(theEmployee);
		return "redirect:/employees/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		employeeService.deleteById(theId);
		List<Tasks> list=taskService.findAllByEmployeeId(theId);
		for (Tasks t:list){
			taskService.delete(t.getId());
		}

		return "redirect:/employees/list";
	}

	@GetMapping("/showFormForAddTask")
	public String addTask(@RequestParam("employeeId") int theId, Model model) {

		Tasks task=new Tasks(theId,"");
		model.addAttribute("taskss", task);
		return "employees/assign-task";
	}

	@PostMapping("/saveTask")
	public String saveTask(@ModelAttribute("taskss") Tasks tasks, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "employees/assign-task"; // Return with errors for invalid form inputs
		}
		taskService.save(tasks);

		System.out.println(tasks);


		return "redirect:/employees/list";
	}
	@GetMapping("/home")
	public String home(Model model) {
		String username = "";

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication != null && authentication.isAuthenticated()) {
			username = authentication.getName();
		}
		int employeeId=(int)memberService.findEmployeeIdByUsername(username);
		List<Tasks> tasks=taskService.findAllByEmployeeId(employeeId);
		System.out.println(username);
		System.out.println(employeeId);
		model.addAttribute("taskss",tasks);

		return "employees/home";
	}
	@GetMapping("/deleteTask")
	public String deleteTask(@RequestParam("employeeId") int theId){
		List<Tasks> list=taskService.findAllByEmployeeId(theId);
		for (Tasks t:list){
			taskService.delete(t.getId());
		}

		return "redirect:/employees/list";
	}
	@GetMapping("/taskCompleted")
	public String taskCompleted(@RequestParam("taskId") int theId){
		taskService.delete(theId);
		return "redirect:/employees/home";
	}

}
