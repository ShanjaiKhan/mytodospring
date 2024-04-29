package com.techymeet.todo.dao;

import java.util.List;

import com.techymeet.todo.vo.TodoVo;

public interface TodoDao {

	int createTodo(TodoVo todoVo);

	List<TodoVo> retriveTodoList();

}
