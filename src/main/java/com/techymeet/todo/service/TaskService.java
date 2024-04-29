package com.techymeet.todo.service;

import java.util.List;

import com.techymeet.todo.bo.TaskBo;
import com.techymeet.todo.vo.TaskVo;

public interface TaskService {

	int createTask(TaskBo taskBo, int projectId, int employeeId);

	List<TaskVo> retriveTaskList();

}
