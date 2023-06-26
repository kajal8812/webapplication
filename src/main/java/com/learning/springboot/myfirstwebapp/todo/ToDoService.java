package com.learning.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private static List<ToDo> l = new ArrayList<>();

	static {
		l.add(new ToDo(1, "ravi", "learn spring", LocalDate.now().plusYears(1), false));
		l.add(new ToDo(2, "rakul", "learn springboot", LocalDate.now().plusYears(2), false));
		l.add(new ToDo(3, "bhatt", "learn springmvc", LocalDate.now().plusYears(3), false));
	}

	//public List<ToDo> findByUsername(String username) {
	//	return l;
	//}

	public List<ToDo> findByUsername(String username) {
		// TODO Auto-generated method stub
		return l;
	}
}
