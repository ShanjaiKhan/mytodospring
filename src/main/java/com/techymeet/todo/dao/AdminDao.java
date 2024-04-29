package com.techymeet.todo.dao;

import com.techymeet.todo.vo.LoginVo;

public interface AdminDao {

	LoginVo loginValidate(String email,String password);

}
