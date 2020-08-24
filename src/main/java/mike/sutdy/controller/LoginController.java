package mike.sutdy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ExceptionHandler;

import mike.study.entity.User;
import mike.sutdy.service.UserServiceImpl;


@Controller()
public class LoginController {	
	
	@Resource
	private UserServiceImpl userServiceImpl;
	
	
	@ExceptionHandler
	/**
	 * e:是其它方法所抛出的异常。
	 */
	public String handle(Exception e,
			HttpServletRequest request){
		//依据异常类型，分别做不同的处理
		if(e instanceof 
				NumberFormatException){
			System.out.println(
				"处理NumberFormatException异常");
			request.setAttribute("msg", 
					"亲，请输入合法的数字");
			return "error3";
		}
		if(e instanceof 
				StringIndexOutOfBoundsException){
			System.out.println(
					"处理StringIndexOutOfBoundsException异常");
				request.setAttribute("msg", 
						"亲，下标越界啦");
				return "error3";
		}
		//其它异常
		return "error";
	}
	
	@RequestMapping("/login.do")
	public String login() {
		String str = "123a";
		Integer.parseInt(str);
		return "login";
	}
	
	@RequestMapping("/check.do")
	public String checkUser(@RequestParam("id") Integer id,@RequestParam("name") String name,HttpSession session) {
		User user = userServiceImpl.getUserById(id);		
		if (user == null) {
			return "redirect: fail.do";
		}else {
			System.out.print(name);
			session.setAttribute("user", user);
			return "redirect: success.do";
		}	
	}
	
	@RequestMapping("/fail.do")
	public String fail() {
		
		return "fail";
	}
	
	@RequestMapping("/success.do")
	public String success() {
		
		return "success";
	}
}
