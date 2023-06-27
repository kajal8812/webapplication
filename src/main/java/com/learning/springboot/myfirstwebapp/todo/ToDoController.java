package com.learning.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		List<ToDo> l = ts.findByUsername();
		m.addAttribute("todos", l);
		return "listTodos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String newTodo(ModelMap m) {
		String username = (String) m.get("name");
		ToDo t1 = new ToDo(0, username, "", LocalDate.now().plusYears(1), false);
		m.put("t", t1);
		return "addTodo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, ToDo t) {
		String username = (String) model.get("name");
		ts.addTodo(username, t.getDescription(), LocalDate.now().plusYears(1), false);

		//ts.addTodo();
		return "redirect:list";
	}
}
