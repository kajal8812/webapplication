package com.learning.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//http://localhost:8091/sayHello
	@RequestMapping("sayHello")
	@ResponseBody
	public String sayHello() {
		return "hellllooooooooooooo";
	}

	/*	@RequestMapping("sayHelloHtml")
		@ResponseBody
		public String sayHelloHtml() {
			StringBuffer s = new StringBuffer();
			s.append("<html>");
			s.append("<head>");
			s.append("<title> my page </title>");
			s.append("</head>");
			s.append("<body>");
			s.append("hiiiii");
			s.append("</body>");
			s.append("</html>");
			return s.toString();
	
		}*/

	@RequestMapping("sayHelloJsp")

	public String sayHelloJsp() {
		return "sayHello";
	}
}
