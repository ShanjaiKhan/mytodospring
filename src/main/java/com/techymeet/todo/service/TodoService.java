package com.techymeet.todo.service;

import java.util.List;

import com.techymeet.todo.bo.TodoBo;
import com.techymeet.todo.vo.TodoVo;

public interface TodoService {

	int createTodo(TodoBo todoBo, int taskId);

	List<TodoVo> retriveTodoList();

}
