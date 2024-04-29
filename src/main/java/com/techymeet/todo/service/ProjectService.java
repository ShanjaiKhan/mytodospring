package com.techymeet.todo.service;

import java.util.List;

import com.techymeet.todo.bo.ProjectBo;
import com.techymeet.todo.vo.ProjectVo;

public interface ProjectService {

	List<ProjectVo> retriveProjectList();

	int createProject(ProjectBo projectBo);

	ProjectVo retriveProjectBasedOnId(int projectId);

	int updateProject(ProjectBo projectBo);

	void deleteProject(int projectId);

}
