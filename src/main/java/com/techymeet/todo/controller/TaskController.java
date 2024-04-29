package com.techymeet.todo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techymeet.todo.bo.EmployeeBo;
import com.techymeet.todo.bo.TaskBo;
import com.techymeet.todo.service.EmployeeService;
import com.techymeet.todo.service.ProjectService;
import com.techymeet.todo.service.TaskService;
import com.techymeet.todo.vo.EmployeeVo;
import com.techymeet.todo.vo.ProjectVo;
import com.techymeet.todo.vo.TaskVo;

@Controller
public class TaskController {
	@Autowired
	TaskService taskService;
	@Autowired
	ProjectService project;
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "createTask", method = RequestMethod.GET)
	public ModelAndView getCreateTask() {
		List<ProjectVo> listProject = new ArrayList();
		ModelAndView model = new ModelAndView();
		List<ProjectVo> projectList = project.retriveProjectList();
		projectList.remove(1);
//		for (ProjectVo vo : projectList) {
//			if (vo.getProjectName().equals("Mycognitiv")) {
//				projectList.remove(vo);
//			} else {
//				listProject.add(vo);
//			}
//		}
		List<EmployeeVo> employeeList = employeeService.retriveEmployeeList();
		model.addObject("taskBo", new TaskBo());
		model.addObject("employeeList", employeeList);
		model.addObject("projectList", listProject);
		model.setViewName("task_form");
		return model;

	}

	@RequestMapping(value = { "createTask" }, method = RequestMethod.POST)
	public ModelAndView postCreateTask(@ModelAttribute("taskBo") TaskBo taskBo, HttpServletRequest request) {
		ModelAndView model = new ModelAndView("redirect:/listTask");
		int projectId = Integer.parseInt(request.getParameter("projectId"));
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		int taskId = taskService.createTask(taskBo, projectId, employeeId);
		if (0 < taskId) {
			model.addObject("errorMessage", "Task Created Successfully!");
		} else {
			model.addObject("errorMessage", "Task Creation Failed!");
		}
		return model;

	}

	@RequestMapping(value = "listTask")
	public ModelAndView getListTask(HttpServletRequest request) {

		ModelAndView model = new ModelAndView("task_list");
		if (null != request.getParameter("errorMessage")) {
			model.addObject("errorMessage", request.getParameter("errorMessage"));
		}
		List<TaskVo> listTask = taskService.retriveTaskList();
		if (null != listTask && listTask.size() > 0) {
			model.addObject("listTask", listTask);
		} else {
			model.addObject("errorMessage", "No Record Found!");
		}
		return model;

	}

}
