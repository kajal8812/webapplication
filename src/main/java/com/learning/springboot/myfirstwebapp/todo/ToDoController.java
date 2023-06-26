package com.learning.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {

	private ToDoService ts;

	public ToDoController(ToDoService ts) {
		super();
		this.ts = ts;
	}

	@RequestMapping("/list")
	public String list(ModelMap m) {
		List<ToDo> l = ts.findByUsername("ravi");
		m.addAttribute("todos", l);
		return "listTodos";
	}
}
