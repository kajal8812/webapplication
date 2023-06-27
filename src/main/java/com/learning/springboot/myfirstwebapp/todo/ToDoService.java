package com.learning.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private static List<ToDo> l = new ArrayList<>();

	private static int c = 0;

	static {
		l.add(new ToDo(++c, "ravi", "learn spring", LocalDate.now().plusYears(1), false));
		l.add(new ToDo(++c, "ravi", "learn springboot", LocalDate.now().plusYears(2), false));
		l.add(new ToDo(++c, "ravi", "learn springmvc", LocalDate.now().plusYears(3), false));
	}

	//public List<ToDo> findByUsername(String username) {
	//	return l;
	//}

	public List<ToDo> findByUsername() {
		// TODO Auto-generated method stub
		return l;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		ToDo t = new ToDo(++c, username, description, targetDate, done);
		l.add(t);
	}
}
