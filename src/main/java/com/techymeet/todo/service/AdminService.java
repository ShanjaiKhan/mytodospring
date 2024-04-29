package com.techymeet.todo.service;

import com.techymeet.todo.bo.LoginBo;
import com.techymeet.todo.vo.LoginVo;

public interface AdminService {

	LoginVo loginValidate(String email,String password);

}
