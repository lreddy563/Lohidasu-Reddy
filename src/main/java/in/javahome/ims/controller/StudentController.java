package in.javahome.ims.controller;

import in.javahome.ims.entities.Student;
import in.javahome.ims.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@Autowired
	private IStudentService registerService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String register(@ModelAttribute("student") Student student) {
		return "addStudent";
	}

	@RequestMapping(value = "/student-registration", method = RequestMethod.POST)
	public String upload(@Validated @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "addStudent";
		} else {
			registerService.addStudentDetails(student);
			return "addStudent";
		}

	}
}
