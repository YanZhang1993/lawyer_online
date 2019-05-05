package com.yan.zhang.lawyer_online;

import com.yan.zhang.lawyer_online.core.mapper.UserMapper;
import com.yan.zhang.lawyer_online.core.model.User;
import com.yan.zhang.lawyer_online.utils.SexEnum;
import com.yan.zhang.lawyer_online.utils.SnowflakeIdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LawyerOnlineApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
		User user = new User();
		user.setUserId(SnowflakeIdWorker.generateId());
		user.setUserName("张三");
		user.setAge(24);
		user.setSex(1);
		user.setAddress("湖南长沙");
		user.setMobile("177777777");
		userMapper.addUser(user);
	}

	public static void main(String[] args) {
		System.out.println(SexEnum.valueOf("MAN"));
	}
}
