package mike.sutdy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import mike.study.entity.User;
import mike.sutdy.dao.UserMapper;

@Service
public class UserServiceImpl {
	@Resource
	private UserMapper dao;
	
	public User getUserById(Integer id) {
		User user = dao.getUserById(id);
		return user;
	}
}
