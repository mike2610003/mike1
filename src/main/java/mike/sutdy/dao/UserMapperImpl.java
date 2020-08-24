package mike.sutdy.dao;

import mike.study.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements UserMapper{

	public User getUserById(Integer id) {
		User user = new User();
		user.setId(1);
		user.setName("mike");
		user.setOld(18);
		return user;
	}
	
}
