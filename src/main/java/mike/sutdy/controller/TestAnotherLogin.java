package mike.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class TestAnotherLogin {
	
	@RequestMapping("/login2.do")
	public String login() {
		String str = "123a";
		Integer.parseInt(str);
		return "login";
	}
}
