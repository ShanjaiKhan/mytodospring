package com.techymeet.todo.dao;

import java.util.List;

import com.techymeet.todo.vo.TaskVo;

public interface TaskDao {

	TaskVo createTask(TaskVo taskVo);

	List<TaskVo> retriveTaskList();
	public TaskVo retriveTask(int taskId);

}
