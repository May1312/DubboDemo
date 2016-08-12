package com.helian.interImpl;

import java.util.ArrayList;
import java.util.List;

import com.helian.beans.User;
import com.helian.interf.TwoDemo;
//@Service("")
public class TwoDemoImpl implements TwoDemo {

	public List<User> run() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setName("雷布斯");
		user.setAge(18);
		list.add(user);
		return list;
	}

}
