package com.techymeet.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techymeet.todo.bo.TodoBo;
import com.techymeet.todo.dao.TaskDao;
import com.techymeet.todo.dao.TodoDao;
import com.techymeet.todo.vo.TaskVo;
import com.techymeet.todo.vo.TodoVo;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoDao todoDao;

	@Override
	public int createTodo(TodoBo todoBo, int taskId) {
		TodoVo todoVo = new TodoVo();

		TaskVo task = new TaskVo();
		task.setTaskId(taskId);

		todoVo.setTask(task);
		todoVo.setTitle(todoBo.getTitle());
		todoVo.setDescription(todoBo.getDescription());
		todoVo.setTargetDate(todoBo.getTargetDate());
		todoVo.setStatus(todoBo.isStatus());

		return todoDao.createTodo(todoVo)	;
	}

	@Override
	public List<TodoVo> retriveTodoList() {
		// TODO Auto-generated method stub
		return todoDao.retriveTodoList();
	}

}
