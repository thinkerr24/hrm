import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rr.hrm.dao.UserDao;
import com.rr.hrm.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
//Telling junit the location of spring configuration file
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestUserDao {
	@Autowired
	private UserDao dao;
	@Test
	public void testUserQuery() {
		List<User> users = dao.getAllUsers();
		for (User user : users) {
			System.out.println(user.getLoginname());
		}
	}
}
