package com.techymeet.todo.bo;

import java.time.LocalDate;

public class ProjectBo {
	private int projectId;
	private String projectName;
	private String projectManager;
	private String startDate;
	private String endDate;
	private boolean isDelete;
	//private LocalDate startDate;
	//private LocalDate endDate;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	/*
	 * public LocalDate getStartDate() { return startDate; } public void
	 * setStartDate(LocalDate startDate) { this.startDate = startDate; } public
	 * LocalDate getEndDate() { return endDate; } public void setEndDate(LocalDate
	 * endDate) { this.endDate = endDate; }
	 */
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	
}
