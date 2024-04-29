package com.techymeet.todo.dao;

import java.util.List;

import com.techymeet.todo.bo.ProjectBo;
import com.techymeet.todo.vo.ProjectVo;

public interface ProjectDao {

	List<ProjectVo> retriveProjectList();

	int createProject(ProjectVo projectVo);

	ProjectVo retriveProjectBasedOnId(int projectId);

	int updateProject(ProjectVo projectVo);

	void deleteProject(int projectId);

}
