package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao {
	// ����һ�������������û���Ϣ
	List<User> list = new ArrayList<User>();
	@Override
	public void save(User user) {
		list.add(user);
		for(User user2 : list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}
	@Override
	public void update(User user) {
		System.out.println("ִ����Ϣ�Ĳ���");
	}
	
}
