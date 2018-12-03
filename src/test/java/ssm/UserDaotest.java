package ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.javaex.dao.UserDao;
import cn.javaex.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaotest {
	
	@Autowired
	private UserDao userDao ;
	
	@Test
	public void testFindUserById() {
		int id =2 ;
		User user = userDao.findUserById(id) ;
		System.out.println(user.getId() + " " + user.getUsername() +" " +user.getPassword());
	}

}
